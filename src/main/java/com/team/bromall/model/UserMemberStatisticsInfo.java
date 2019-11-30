package com.team.bromall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserMemberStatisticsInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.member_id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.consume_amount
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private BigDecimal consumeAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.order_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer orderCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.coupon_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer couponCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.comment_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.return_order_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer returnOrderCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.login_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer loginCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.attend_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer attendCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.fans_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer fansCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.collect_product_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer collectProductCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.collect_subject_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer collectSubjectCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.collect_topic_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer collectTopicCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.collect_comment_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer collectCommentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.invite_friend_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Integer inviteFriendCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_member_statistics_info.recent_order_time
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Date recentOrderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_member_statistics_info
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.id
     *
     * @return the value of user_member_statistics_info.id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.id
     *
     * @param id the value for user_member_statistics_info.id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.member_id
     *
     * @return the value of user_member_statistics_info.member_id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.member_id
     *
     * @param memberId the value for user_member_statistics_info.member_id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.consume_amount
     *
     * @return the value of user_member_statistics_info.consume_amount
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.consume_amount
     *
     * @param consumeAmount the value for user_member_statistics_info.consume_amount
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.order_count
     *
     * @return the value of user_member_statistics_info.order_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.order_count
     *
     * @param orderCount the value for user_member_statistics_info.order_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.coupon_count
     *
     * @return the value of user_member_statistics_info.coupon_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getCouponCount() {
        return couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.coupon_count
     *
     * @param couponCount the value for user_member_statistics_info.coupon_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.comment_count
     *
     * @return the value of user_member_statistics_info.comment_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.comment_count
     *
     * @param commentCount the value for user_member_statistics_info.comment_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.return_order_count
     *
     * @return the value of user_member_statistics_info.return_order_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.return_order_count
     *
     * @param returnOrderCount the value for user_member_statistics_info.return_order_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.login_count
     *
     * @return the value of user_member_statistics_info.login_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.login_count
     *
     * @param loginCount the value for user_member_statistics_info.login_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.attend_count
     *
     * @return the value of user_member_statistics_info.attend_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getAttendCount() {
        return attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.attend_count
     *
     * @param attendCount the value for user_member_statistics_info.attend_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.fans_count
     *
     * @return the value of user_member_statistics_info.fans_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.fans_count
     *
     * @param fansCount the value for user_member_statistics_info.fans_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.collect_product_count
     *
     * @return the value of user_member_statistics_info.collect_product_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.collect_product_count
     *
     * @param collectProductCount the value for user_member_statistics_info.collect_product_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.collect_subject_count
     *
     * @return the value of user_member_statistics_info.collect_subject_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.collect_subject_count
     *
     * @param collectSubjectCount the value for user_member_statistics_info.collect_subject_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.collect_topic_count
     *
     * @return the value of user_member_statistics_info.collect_topic_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.collect_topic_count
     *
     * @param collectTopicCount the value for user_member_statistics_info.collect_topic_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.collect_comment_count
     *
     * @return the value of user_member_statistics_info.collect_comment_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.collect_comment_count
     *
     * @param collectCommentCount the value for user_member_statistics_info.collect_comment_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.invite_friend_count
     *
     * @return the value of user_member_statistics_info.invite_friend_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.invite_friend_count
     *
     * @param inviteFriendCount the value for user_member_statistics_info.invite_friend_count
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_member_statistics_info.recent_order_time
     *
     * @return the value of user_member_statistics_info.recent_order_time
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Date getRecentOrderTime() {
        return recentOrderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_member_statistics_info.recent_order_time
     *
     * @param recentOrderTime the value for user_member_statistics_info.recent_order_time
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setRecentOrderTime(Date recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_member_statistics_info
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
        sb.append(", memberId=").append(memberId);
        sb.append(", consumeAmount=").append(consumeAmount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", couponCount=").append(couponCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", returnOrderCount=").append(returnOrderCount);
        sb.append(", loginCount=").append(loginCount);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", fansCount=").append(fansCount);
        sb.append(", collectProductCount=").append(collectProductCount);
        sb.append(", collectSubjectCount=").append(collectSubjectCount);
        sb.append(", collectTopicCount=").append(collectTopicCount);
        sb.append(", collectCommentCount=").append(collectCommentCount);
        sb.append(", inviteFriendCount=").append(inviteFriendCount);
        sb.append(", recentOrderTime=").append(recentOrderTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}