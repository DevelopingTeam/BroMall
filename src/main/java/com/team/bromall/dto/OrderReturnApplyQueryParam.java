package com.team.bromall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单退货申请查询参数
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 12:43
 */
@Getter
@Setter
public class OrderReturnApplyQueryParam {
    private Long id;
    private String receiverKeyword;
    /**
     * 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
     */
    private Integer status;
    private String createTime;
    private String handleMan;
    private String handleTime;
}
