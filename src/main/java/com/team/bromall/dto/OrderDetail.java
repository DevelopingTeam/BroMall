package com.team.bromall.dto;

import com.team.bromall.model.OmsOrder;
import com.team.bromall.model.OmsOrderItem;
import com.team.bromall.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 *
 * @author team
 * @version v1.0
 * @date 2019/12/5 23:09
 */
@Getter
@Setter
public class OrderDetail extends OmsOrder {
    public List<OmsOrderItem> orderItemList;
    private List<OmsOrderOperateHistory> historyList;
}
