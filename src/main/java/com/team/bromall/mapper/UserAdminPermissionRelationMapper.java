package com.team.bromall.mapper;

import com.team.bromall.model.UserAdminPermissionRelation;
import com.team.bromall.model.UserAdminPermissionRelationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
public interface UserAdminPermissionRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    long countByExample(UserAdminPermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByExample(UserAdminPermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insert(UserAdminPermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insertSelective(UserAdminPermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    List<UserAdminPermissionRelation> selectByExample(UserAdminPermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    UserAdminPermissionRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserAdminPermissionRelation record, @Param("example") UserAdminPermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExample(@Param("record") UserAdminPermissionRelation record, @Param("example") UserAdminPermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKeySelective(UserAdminPermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin_permission_relation
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKey(UserAdminPermissionRelation record);
}