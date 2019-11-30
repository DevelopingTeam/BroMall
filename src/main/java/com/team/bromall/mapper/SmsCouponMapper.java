package com.team.bromall.mapper;

import com.team.bromall.model.SmsCoupon;
import com.team.bromall.model.SmsCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    long countByExample(SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByExample(SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insert(SmsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insertSelective(SmsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    List<SmsCoupon> selectByExample(SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    SmsCoupon selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExample(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKeySelective(SmsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKey(SmsCoupon record);
}