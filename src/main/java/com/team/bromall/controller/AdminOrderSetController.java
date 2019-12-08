package com.team.bromall.controller;

import com.team.bromall.model.OmsOrderSetting;
import com.team.bromall.service.OrderSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 后台管理系统-订单设置
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 01:04
 */
@Controller
public class AdminOrderSetController {

    @Autowired
    private OrderSetService orderSetService;

    @RequestMapping(value = "/admin/ordersetting", method = RequestMethod.GET)
    public String orderSetting(@RequestParam(required = false, defaultValue = "1", value = "id") Long id,
                               Model model) {
        OmsOrderSetting orderSetting = orderSetService.getItem(id);
        if (orderSetting == null) {
            String msg = "请求参数有误，请检查！";
            model.addAttribute("msg", msg);
            orderSetting = orderSetService.getItem(Long.parseLong(String.valueOf(1)));
            model.addAttribute("orderSetting", orderSetting);
            return "ordersetting";
        }
        model.addAttribute("orderSetting", orderSetting);
        return "ordersetting";
    }

    @RequestMapping(value = "/admin/ordersetting", method = RequestMethod.POST)
    public String orderSettingPost(OmsOrderSetting orderSetting, Model model) {
        int flag = orderSetService.update(orderSetting.getId(), orderSetting);
        if (flag > 0) {
            model.addAttribute("msg", "修改成功！");
        }
        else {
            model.addAttribute("msg", "修改失败！");
        }
        model.addAttribute("orderSetting", orderSetting);
        return "ordersetting";
    }
}
