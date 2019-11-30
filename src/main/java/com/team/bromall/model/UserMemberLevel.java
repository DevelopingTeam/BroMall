package com.team.bromall.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserMemberLevel implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.name
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.growth_point
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer growthPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.default_status
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer defaultStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.free_freight_point
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private BigDecimal freeFreightPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.comment_growth_point
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer commentGrowthPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.priviledge_free_freight
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer priviledgeFreeFreight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.priviledge_sign_in
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer priviledgeSignIn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.priviledge_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer priviledgeComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.priviledge_promotion
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer priviledgePromotion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.priviledge_member_price
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer priviledgeMemberPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.priviledge_birthday
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer priviledgeBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_level.note
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_member_level
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.id
     *
     * @return the value of user_member_level.id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.id
     *
     * @param id the value for user_member_level.id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.name
     *
     * @return the value of user_member_level.name
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.name
     *
     * @param name the value for user_member_level.name
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.growth_point
     *
     * @return the value of user_member_level.growth_point
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getGrowthPoint() {
        return growthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.growth_point
     *
     * @param growthPoint the value for user_member_level.growth_point
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.default_status
     *
     * @return the value of user_member_level.default_status
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.default_status
     *
     * @param defaultStatus the value for user_member_level.default_status
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.free_freight_point
     *
     * @return the value of user_member_level.free_freight_point
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.free_freight_point
     *
     * @param freeFreightPoint the value for user_member_level.free_freight_point
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.comment_growth_point
     *
     * @return the value of user_member_level.comment_growth_point
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.comment_growth_point
     *
     * @param commentGrowthPoint the value for user_member_level.comment_growth_point
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.priviledge_free_freight
     *
     * @return the value of user_member_level.priviledge_free_freight
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.priviledge_free_freight
     *
     * @param priviledgeFreeFreight the value for user_member_level.priviledge_free_freight
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.priviledge_sign_in
     *
     * @return the value of user_member_level.priviledge_sign_in
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.priviledge_sign_in
     *
     * @param priviledgeSignIn the value for user_member_level.priviledge_sign_in
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.priviledge_comment
     *
     * @return the value of user_member_level.priviledge_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.priviledge_comment
     *
     * @param priviledgeComment the value for user_member_level.priviledge_comment
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.priviledge_promotion
     *
     * @return the value of user_member_level.priviledge_promotion
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.priviledge_promotion
     *
     * @param priviledgePromotion the value for user_member_level.priviledge_promotion
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.priviledge_member_price
     *
     * @return the value of user_member_level.priviledge_member_price
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.priviledge_member_price
     *
     * @param priviledgeMemberPrice the value for user_member_level.priviledge_member_price
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.priviledge_birthday
     *
     * @return the value of user_member_level.priviledge_birthday
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.priviledge_birthday
     *
     * @param priviledgeBirthday the value for user_member_level.priviledge_birthday
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_level.note
     *
     * @return the value of user_member_level.note
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_level.note
     *
     * @param note the value for user_member_level.note
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_member_level
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", growthPoint=").append(growthPoint);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", freeFreightPoint=").append(freeFreightPoint);
        sb.append(", commentGrowthPoint=").append(commentGrowthPoint);
        sb.append(", priviledgeFreeFreight=").append(priviledgeFreeFreight);
        sb.append(", priviledgeSignIn=").append(priviledgeSignIn);
        sb.append(", priviledgeComment=").append(priviledgeComment);
        sb.append(", priviledgePromotion=").append(priviledgePromotion);
        sb.append(", priviledgeMemberPrice=").append(priviledgeMemberPrice);
        sb.append(", priviledgeBirthday=").append(priviledgeBirthday);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}