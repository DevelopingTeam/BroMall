package com.team.bromall.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 确认收货提交参数
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 12:28
 */
@Getter
@Setter
public class OrderUpdateStatusParam {
    private Long id;
    private BigDecimal returnAmount;
    private String handleNote;
    private String handleMan;
    private String receiveNote;
    private String receiveMan;
    /**
     * 申请状态：0->待退货；1->退货中；2->已完成；3->已拒绝
     */
    private Integer status;
}
