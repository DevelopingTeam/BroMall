package com.team.bromall.service;

import com.team.bromall.dto.*;
import com.team.bromall.model.OmsOrder;
import com.team.bromall.model.OmsOrderItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * OrderService接口
 *
 * @author team
 * @version v1.0
 * @date 2019/12/5 21:56
 */
public interface OrderService {
    /**
     * 订单查询
     * @param queryParam 查询条件参数
     * @param pageSize 页大小
     * @param pageNum 页数
     * @return 查询结果
     */
    List<OmsOrder> list(OrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量发货
     * @param deliveryParamList 条件参数
     * @return 操作状态
     */
    @Transactional(rollbackFor = Exception.class)
    int delivery(List<OrderDeliveryParam> deliveryParamList);

    /**
     * 批量关闭订单
     * @param ids 订单编号
     * @param note 备注
     * @return 操作状态
     */
    @Transactional(rollbackFor = Exception.class)
    int close(List<Long> ids, String note);

    /**
     * 批量删除订单
     * @param ids 订单编号
     * @return 操作状态
     */
    int delete(List<Long> ids);

    /**
     * 获取指定订单详情
     * @param id 订单ID
     * @return 订单详情
     */
    OrderDetail detail(Long id);

    /**
     * 修改订单收货人信息
     * @param receiverInfoParam 收货人信息参数
     * @return 修改状态
     */
    @Transactional(rollbackFor = Exception.class)
    int updateReceiverInfo(ReceiverInfoParam receiverInfoParam);

    /**
     * 修改订单费用信息
     * @param moneyInfoParam 订单费用参数
     * @return 修改状态
     */
    @Transactional(rollbackFor = Exception.class)
    int updateMoneyInfo(OrderMoneyInfoParam moneyInfoParam);

    /**
     * 修改订单备注
     * @param id 订单ID
     * @param note 备注
     * @param status 状态
     * @return 修改状态
     */
    @Transactional(rollbackFor = Exception.class)
    int updateNote(Long id, String note, Integer status);
}
