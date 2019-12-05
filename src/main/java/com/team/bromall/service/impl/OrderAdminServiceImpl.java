package com.team.bromall.service.impl;

import com.team.bromall.mapper.OmsOrderMapper;
import com.team.bromall.model.OmsOrder;
import com.team.bromall.service.OrderAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * bromall
 *
 * @author zhangbocheng
 * @version v1.0
 * @date 2019/12/5 11:50
 */
@Service
public class OrderAdminServiceImpl implements OrderAdminService {

    @Autowired
    private OmsOrderMapper orderMapper;

    @Override
    public Map<String, List> getOrderSum(String startDate, String endDate) {
        Map<String, List> resultMap = new HashMap<>(16);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<OmsOrder> orders = orderMapper.getOmsOrderByDate(startDate, endDate);
        for (OmsOrder order: orders) {
            List<BigDecimal> sums = new LinkedList<>();
            sums.add(order.getTotalAmount());
            sums.add(order.getPayAmount());
            resultMap.put(sdf.format(order.getCreateTime()), sums);
        }
        return resultMap;
    }

    @Override
    public Map<String, List> getOrderStatus() {
        Map<String, List> resultMap = new HashMap<>(16);

        return resultMap;
    }

    @Override
    public Map<String, List> getOrderTotalSales() {
        Map<String, List> resultMap = new HashMap<>(16);

        return resultMap;
    }
}
