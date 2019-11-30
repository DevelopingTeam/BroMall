package com.team.bromall.dao;

import com.team.bromall.model.UserAdminPermissionRelation;
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
public interface UserAdminPermissionRelationDao {
    /**
     * 插入用户角色权限关系
     * @param list 用户角色权限关系列表
     * @return 插入状态
     */
    int insertList(@Param("List") List<UserAdminPermissionRelation> list);
}
