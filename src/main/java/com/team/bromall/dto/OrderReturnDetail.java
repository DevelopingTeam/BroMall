package com.team.bromall.dto;

import com.team.bromall.model.OmsCompanyAddress;
import com.team.bromall.model.OmsOrderItem;
import com.team.bromall.model.OmsOrderOperateHistory;
import com.team.bromall.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * bromall
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 15:52
 */
@Getter
@Setter
public class OrderReturnDetail extends OmsOrderReturnApply {
    private List<OmsCompanyAddress> companyAddressList;
}
