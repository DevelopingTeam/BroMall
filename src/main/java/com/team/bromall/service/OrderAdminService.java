package com.team.bromall.service;

import java.util.List;
import java.util.Map;

/**
 * 订单管理Service
 *
 * @author team
 * @version v1.0
 * @date 2019/12/5 11:37
 */
public interface OrderAdminService {

    /**
     * 根据起止时间对订单的数量和金额做统计(首页)
     * @param startDate 起始日期
     * @param endDate 结束日期
     * @return 统计分组结果
     */
    Map<String, List> getOrderSum(String startDate, String endDate);

    /**
     * 根据订单状态统计未完成的订单数据(首页)
     * @return 统计分组结果
     */
    Map<String, List> getOrderStatus();

    /**
     * 获取订单的销售额
     * @return
     */
    Map<String, List> getOrderTotalSales();
}
