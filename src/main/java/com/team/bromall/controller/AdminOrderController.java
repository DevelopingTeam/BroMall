package com.team.bromall.controller;

import com.github.pagehelper.PageInfo;
import com.team.bromall.dto.OrderDetail;
import com.team.bromall.dto.OrderQueryParam;
import com.team.bromall.model.OmsOrder;
import com.team.bromall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * 后台管理系统-订单列表
 *
 * @author team
 * @version v1.0
 * @date 2019/12/5 23:36
 */
@Controller
public class AdminOrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/admin/orderlist", method = RequestMethod.GET)
    public String orderList(OrderQueryParam queryParam,
                            @RequestParam(required = false, defaultValue = "1", value = "page") int page,
                            @RequestParam(required = false, defaultValue = "10", value = "pageSize") int pageSize,
                            Model model) {
        List<OmsOrder> orderList = orderService.list(queryParam, pageSize, page);
        PageInfo pageInfo = new PageInfo<>(orderList, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("orderList", orderList);
        return "orderlist";
    }

    @RequestMapping(value = "/admin/orderlist", method = RequestMethod.POST)
    public String orderListPost(OrderQueryParam queryParam,
                                @RequestParam(required = false, defaultValue = "1", value = "page") int page,
                                @RequestParam(required = false, defaultValue = "10", value = "pageSize") int pageSize,
                                Model model) {
        List<OmsOrder> orderList = orderService.list(queryParam, pageSize, page);
        PageInfo pageInfo = new PageInfo<>(orderList, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("orderList", orderList);
        return "orderlist";
    }

    @RequestMapping(value = "/admin/orderdetail", method = RequestMethod.GET)
    public String orderDetail(@RequestParam(required = false, defaultValue = "1", value = "id") Long id, Model model) {
        OrderDetail orderDetail = orderService.detail(id);
        model.addAttribute("orderDetail", orderDetail);
        return "orderdetail";
    }
}
