package com.team.bromall.mapper;

import com.team.bromall.model.OmsOrderReturnReason;
import com.team.bromall.model.OmsOrderReturnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderReturnReasonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    long countByExample(OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByExample(OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insert(OmsOrderReturnReason record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insertSelective(OmsOrderReturnReason record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    List<OmsOrderReturnReason> selectByExample(OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    OmsOrderReturnReason selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") OmsOrderReturnReason record, @Param("example") OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExample(@Param("record") OmsOrderReturnReason record, @Param("example") OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKey(OmsOrderReturnReason record);
}