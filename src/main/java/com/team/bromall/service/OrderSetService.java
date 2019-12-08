package com.team.bromall.service;

import com.team.bromall.model.OmsOrderSetting;

/**
 * OrderSetService接口
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 01:14
 */
public interface OrderSetService {
    /**
     * 获取指定订单设置
     * @param id 设置ID
     * @return 查询结果
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     * @param id 设置ID
     * @param orderSetting 设置参数
     * @return 修改状态
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
