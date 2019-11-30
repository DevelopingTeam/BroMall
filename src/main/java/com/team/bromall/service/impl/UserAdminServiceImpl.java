package com.team.bromall.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.team.bromall.mapper.UserAdminLoginLogMapper;
import com.team.bromall.mapper.UserAdminMapper;
import com.team.bromall.mapper.UserAdminPermissionRelationMapper;
import com.team.bromall.mapper.UserAdminRoleRelationMapper;
import com.team.bromall.model.*;
import com.team.bromall.service.UserAdminService;
import com.team.bromall.utils.AdminUserDetails;
import com.team.bromall.utils.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 后台管理员Service
 *
 * @author team
 * @version v1.0
 * @date 2019/11/23 11:58
 */
@Service
public class UserAdminServiceImpl implements UserAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAdminServiceImpl.class);

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserAdminMapper adminMapper;
    @Autowired
    private UserAdminRoleRelationMapper adminRoleRelationMapper;
    @Autowired
    private UserAdminPermissionRelationMapper adminPermissionRelationMapper;
    @Autowired
    private UserAdminLoginLogMapper loginLogMapper;

    @Override
    public UserAdmin getAdminByUsername(String username)
    {
        UserAdminExample example = new UserAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UserAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public UserAdmin getItem(Long id)
    {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserAdmin register(UserAdmin adminParam)
    {
        UserAdmin userAdmin = new UserAdmin();
        BeanUtils.copyProperties(adminParam, userAdmin);
        userAdmin.setCreateTime(new Date());
        userAdmin.setStatus(1);
        //查询是否有相同用户名的用户
        UserAdminExample example = new UserAdminExample();
        example.createCriteria().andUsernameEqualTo(userAdmin.getUsername());
        List<UserAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }

        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(userAdmin.getPassword());
        userAdmin.setPassword(encodePassword);
        adminMapper.insert(userAdmin);
        return userAdmin;
    }

    @Override
    public String login(String username, String password)
    {
        String token = null;
        //密码需要客户端加密后传递
        try {
            UserDetails userDetails = loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确!");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails,
                    null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
            insertLoginLog(username);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    /**
     * 添加登录记录
     * @param username 用户名
     */
    private void insertLoginLog(String username) {
        UserAdmin admin = getAdminByUsername(username);
        UserAdminLoginLog loginLog = new UserAdminLoginLog();
        loginLog.setAdminId(admin.getId());
        loginLog.setCreateTime(new Date());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        loginLog.setIp(request.getRemoteAddr());
        loginLogMapper.insert(loginLog);
    }

    @Override
    public String refreshToken(String oldToken)
    {
        return jwtTokenUtil.refreshHeadToken(oldToken);
    }

    @Override
    public List<UserAdmin> list(String name, Integer pageSize, Integer pageNum)
    {
        PageHelper.startPage(pageNum, pageSize);
        UserAdminExample example = new UserAdminExample();
        UserAdminExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(name)) {
            criteria.andUsernameLike("%" + name + "%");
            example.or(example.createCriteria().andNickNameLike("%" + name + "%"));
        }
        return adminMapper.selectByExample(example);
    }

    @Override
    public int update(Long id, UserAdmin admin)
    {
        admin.setId(id);
        //密码已经加密处理，需要单独修改
        admin.setPassword(null);
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public int delete(Long id)
    {
        return adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateRole(Long adminId, List<Long> roleIds)
    {
        int count = roleIds == null ? 0 : roleIds.size();
        //先删除原来的关系
        UserAdminRoleRelationExample adminRoleRelationExample = new UserAdminRoleRelationExample();
        adminRoleRelationExample.createCriteria().andAdminIdEqualTo(adminId);
        adminRoleRelationMapper.deleteByExample(adminRoleRelationExample);
        //建立新关系
        if (!CollectionUtils.isEmpty(roleIds)) {
            List<UserAdminRoleRelation> list = new ArrayList<>();
            for (Long roleId : roleIds) {
                UserAdminRoleRelation roleRelation = new UserAdminRoleRelation();
                roleRelation.setAdminId(adminId);
                roleRelation.setRoleId(roleId);
                list.add(roleRelation);
            }
            adminRoleRelationMapper.insertList(list);
        }
        return count;
    }

    @Override
    public List<UserRole> getRoleList(Long adminId)
    {
        return adminRoleRelationMapper.getRoleList(adminId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updatePermission(Long adminId, List<Long> permissionIds)
    {
        //删除原所有权限关系
        UserAdminPermissionRelationExample relationExample = new UserAdminPermissionRelationExample();
        relationExample.createCriteria().andAdminIdEqualTo(adminId);
        adminPermissionRelationMapper.deleteByExample(relationExample);
        //获取用户所有角色权限
        List<UserPermission> permissionList = adminRoleRelationMapper.getRolePermissionList(adminId);
        List<Long> rolePermissionList = permissionList.stream().map(UserPermission::getId).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(permissionIds)) {
            List<UserAdminPermissionRelation> relationList = new ArrayList<>();
            //筛选出+权限
            List<Long> addPermissionIdList = permissionIds.stream().filter(permissionId -> !rolePermissionList.contains(permissionId)).collect(Collectors.toList());
            //筛选出-权限
            List<Long> subPermissionIdList = rolePermissionList.stream().filter(permissionId -> !permissionIds.contains(permissionId)).collect(Collectors.toList());
            //插入+-权限关系
            relationList.addAll(convert(adminId,1,addPermissionIdList));
            relationList.addAll(convert(adminId,-1,subPermissionIdList));
            return 0; // adminPermissionRelationMapper.insertList(relationList);
        }
        return 0;
    }

    /**
     * 将+-权限关系转化为对象
     * @param adminId 用户ID
     * @param type 类型
     * @param permissionIdList 权限列表
     * @return 新的角色关系列表
     */
    private List<UserAdminPermissionRelation> convert(Long adminId,Integer type,List<Long> permissionIdList) {
        List<UserAdminPermissionRelation> relationList = permissionIdList.stream().map(permissionId -> {
            UserAdminPermissionRelation relation = new UserAdminPermissionRelation();
            relation.setAdminId(adminId);
            relation.setType(type);
            relation.setPermissionId(permissionId);
            return relation;
        }).collect(Collectors.toList());
        return relationList;
    }

    @Override
    public List<UserPermission> getPermissionList(Long adminId)
    {
        return adminRoleRelationMapper.getPermissionList(adminId);
    }

    @Override
    public int updatePassword(String username, String oldPassword, String newPassword)
    {
        if (StrUtil.isEmpty(username) || StrUtil.isEmpty(oldPassword) || StrUtil.isEmpty(newPassword)) {
            return -1;
        }

        UserAdminExample example = new UserAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UserAdmin> adminList = adminMapper.selectByExample(example);
        if(CollUtil.isEmpty(adminList)){
            return -2;
        }

        UserAdmin umsAdmin = adminList.get(0);
        if(!passwordEncoder.matches(oldPassword,umsAdmin.getPassword())){
            return -3;
        }
        umsAdmin.setPassword(passwordEncoder.encode(newPassword));
        adminMapper.updateByPrimaryKey(umsAdmin);

        return 1;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
    {
        UserAdmin admin = getAdminByUsername(username);
        if (admin != null) {
            List<UserPermission> permissionList = getPermissionList(admin.getId());
            return new AdminUserDetails(admin, permissionList);
        }
        throw new UsernameNotFoundException("用户名或密码错误!");
    }
}
