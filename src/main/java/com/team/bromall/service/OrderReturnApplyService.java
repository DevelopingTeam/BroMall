package com.team.bromall.service;

import com.team.bromall.dto.OrderReturnApplyQueryParam;
import com.team.bromall.dto.OrderReturnDetail;
import com.team.bromall.dto.OrderUpdateStatusParam;

import com.team.bromall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * OrderReturnApplyService 接口
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 12:18
 */
public interface OrderReturnApplyService {

    /**
     * 分页查询申请
     * @param queryParam 查询参数
     * @param pageSize 页大小
     * @param pageNum 页数
     * @return 查询结果
     */
    List<OmsOrderReturnApply> list(OrderReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     * @param ids 订单IDs
     * @return 删除状态
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     * @param statusParam 状态参数
     * @return 修改状态
     */
    int updateStatus(OrderUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     * @param id 订单ID
     * @return 查询结果
     */
    OrderReturnDetail getItem(Long id);
}
