package com.team.bromall.service;

import com.team.bromall.model.OmsOrderReturnReason;

import java.util.List;

/**
 * OrderReturnReasonService接口
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 17:08
 */
public interface OrderReturnReasonService {
    /**
     * 添加订单原因
     * @param returnReason 退货原因
     * @return 添加状态
     */
    int create(OmsOrderReturnReason returnReason);

    /**
     * 修改退货原因
     * @param id 原因ID
     * @param returnReason 退货原因
     * @return 修改状态
     */
    int update(Long id, OmsOrderReturnReason returnReason);

    /**
     * 删除退货原因
     * @param id 原因ID
     * @return 删除状态
     */
    int delete(Long id);

    /**
     * 分页获取退货原因
     * @param pageSize 页大小
     * @param pageNum 页数
     * @return 查询结果
     */
    List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum);

    /**
     * 获取单个退货原因详情信息
     * @param id 原因ID
     * @return 查询结果
     */
    OmsOrderReturnReason getItem(Long id);
}
