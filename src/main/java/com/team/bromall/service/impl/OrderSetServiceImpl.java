package com.team.bromall.service.impl;

import com.team.bromall.mapper.OmsOrderSettingMapper;
import com.team.bromall.model.OmsOrderSetting;
import com.team.bromall.service.OrderSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单设置Service
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 01:17
 */
@Service
public class OrderSetServiceImpl implements OrderSetService {

    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
