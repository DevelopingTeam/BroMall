package com.team.bromall.mapper;

import com.team.bromall.dto.OrderDeliveryParam;
import com.team.bromall.dto.OrderDetail;
import com.team.bromall.dto.OrderQueryParam;
import com.team.bromall.model.OmsOrder;
import com.team.bromall.model.OmsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    long countByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insert(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int insertSelective(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    List<OmsOrder> selectByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    OmsOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByExample(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKeySelective(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    int updateByPrimaryKey(OmsOrder record);

    /**
     * 按天汇总订单总量及其金额（首页）
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 查询结果
     */
    List<OmsOrder> getOmsOrderByDate(@Param("startDate")String startDate, @Param("endDate")String endDate);

    /**
     * 条件查询订单
     * @param queryParam 查询参数
     * @return 查询结果
     */
    List<OmsOrder> getList(@Param("queryParam") OrderQueryParam queryParam);

    /**
     * 批量发货
     * @param deliveryParamList 设置参数
     * @return 操作状态
     */
    int delivery(@Param("list") List<OrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     * @param id 订单ID
     * @return 查询结果
     */
    OrderDetail getDetail(@Param("id") Long id);
}