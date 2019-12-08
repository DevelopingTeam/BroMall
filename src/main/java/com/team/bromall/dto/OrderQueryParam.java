package com.team.bromall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单查询参数
 *
 * @author team
 * @version v1.0
 * @date 2019/12/5 22:09
 */
@Getter
@Setter
public class OrderQueryParam {
    private String orderSn;
    private String receiverKey;
    private String status;
    private String orderType;
    private String createTime;
    private String memberUsername;
}
