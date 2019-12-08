package com.team.bromall.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 修改订单费用信息参数
 *
 * @author zhangbocheng
 * @version v1.0
 * @date 2019/12/5 22:32
 */
@Getter
@Setter
public class OrderMoneyInfoParam {
    private Long orderId;
    private BigDecimal freightAmount;
    private BigDecimal discountAmount;
    private Integer status;
}
