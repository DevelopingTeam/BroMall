package com.team.bromall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单发货参数
 *
 * @author team
 * @version v1.0
 * @date 2019/12/5 22:20
 */
@Getter
@Setter
public class OrderDeliveryParam {
    private Long orderId;
    private String deliveryCompany;
    private String deliverSn;
}
