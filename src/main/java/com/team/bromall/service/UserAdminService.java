package com.team.bromall.service;

import com.team.bromall.dto.AdminParam;
import com.team.bromall.dto.UpdateAdminPwdParam;
import com.team.bromall.model.UserAdmin;
import com.team.bromall.model.UserPermission;
import com.team.bromall.model.UserRole;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台管理员Service接口
 *
 * @author zhangbocheng
 * @version v1.0
 * @date 2019/11/29 21:33
 */
public interface UserAdminService {
    /**
     * 根据用户名获取后台管理员
     * @param username 用户名
     * @return 获取后台管理员
     */
    UserAdmin getAdminByUsername(String username);

    /**
     * 用户注册
     * @param adminParam 需要的参数
     * @return 注册用户
     */
    UserAdmin register(AdminParam adminParam);

    /**
     * 用户登录
     * @param username 用户名
     * @param password 用户密码
     * @return 登陆用户
     */
    String login(String username,String password);

    /**
     * 刷新Token
     * @param oldToken 过期Token
     * @return 刷新状态
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户信息
     * @param id 用户ID
     * @return 返回用户信息
     */
    UserAdmin getItem(Long id);

    /**
     * 根据用户名或者昵称分页查找用户
     * @param name 用户名或者昵称
     * @param pageSize 页大小
     * @param pageNum 页数
     * @return 用户信息
     */
    List<UserAdmin> list(String name, Integer pageSize, Integer pageNum);

    /**
     * 修改用户信息
     * @param id 用户ID
     * @param admin 用户信息
     * @return 修改状态
     */
    int update(Long id, UserAdmin admin);

    /**
     * 删除指定用户
     * @param id 用户ID
     * @return 删除状态
     */
    int delete(Long id);

    /**
     * * 修改用户角色关系
     * @param adminId 用户ID
     * @param roleIds 角色ID集合
     * @return 修改状态
     */
    @Transactional(rollbackFor = Exception.class)
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * 获取用户对应的角色
     * @param adminId 用户ID
     * @return 用户角色信息
     */
    List<UserRole> getRoleList(Long adminId);

    /**
     * 修改用户的权限
     * @param adminId 用户ID
     * @param permissionIds 角色ID集合
     * @return 修改状态
     */
    @Transactional(rollbackFor = Exception.class)
    int updatePermission(Long adminId, List<Long> permissionIds);

    /**
     * 获取用户所有权限（包括角色权限和权限修改）
     * @param adminId 用户ID
     * @return 用户所有权限信息
     */
    List<UserPermission> getPermissionList(Long adminId);

    /**
     * 修改密码
     * @param param 密码参数
     * @return 修改状态
     */
    int updatePassword(UpdateAdminPwdParam param);

    /**
     * 根据用户名获取用户信息
     * @param username 用户名
     * @return 用户信息
     */
    UserDetails loadUserByUsername(String username);
}
