package com.team.bromall.dao;

import com.team.bromall.model.UserAdminRoleRelation;
import com.team.bromall.model.UserPermission;
import com.team.bromall.model.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * UserAdminRoleRelationDao接口
 *
 * @author team
 * @version v1.0
 * @date 2019/11/25 17:07
 */
@Mapper
public interface UserAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     * @param adminRoleRelationList 角色关系列表
     * @return 插入状态
     */
    int insertList(@Param("list") List<UserAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     * @param adminId 用户ID
     * @return 用户角色
     */
    List<UserRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     * @param adminId 用户ID
     * @return 用户所有角色权限
     */
    List<UserPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限(包括+-权限)
     * @param adminId 用户ID
     * @return 用户所有权限
     */
    List<UserPermission> getPermissionList(@Param("adminId") Long adminId);
}
