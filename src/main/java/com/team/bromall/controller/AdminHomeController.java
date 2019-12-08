package com.team.bromall.controller;

import com.team.bromall.service.HomeAdminService;
import com.team.bromall.service.OrderAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台管理系统-首页
 *
 * @author team
 * @version v1.0
 * @date 2019/12/1 23:08
 */
@Controller
public class AdminHomeController {

    @Autowired
    private HomeAdminService homeAdminService;
    @Autowired
    private OrderAdminService orderAdminService;

    @RequestMapping(value = "/admin/home", method = RequestMethod.POST)
    public String getPage(@RequestBody HashMap manageMap) {
        String pageName = (String) manageMap.get("manage_name");
        String uri = homeAdminService.getPageURI(pageName);
        return "redirect:" + uri;
    }

    @RequestMapping(value = "/admin/home", method = RequestMethod.GET)
    public String home(Model model)
    {
        String startDate = "2018-01-01";
        String endDate = "2019-12-31";
        Map<String, List> orders = orderAdminService.getOrderSum(startDate, endDate);
        Map<String, BigDecimal> orderNum = new HashMap<>(16);
        Map<String, BigDecimal> orderMoney = new HashMap<>(16);
        for (String date: orders.keySet()) {
            orderNum.put(date, (BigDecimal) orders.get(date).get(0));
            orderMoney.put(date, (BigDecimal) orders.get(date).get(1));
        }

        model.addAttribute("order_num", orderNum);
        model.addAttribute("order_money", orderMoney);
        return "home";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index(Model model)
    {
        String startDate = "2018-01-02";
        String endDate = "2019-12-31";
        Map<String, List> orders = orderAdminService.getOrderSum(startDate, endDate);
        Map<String, BigDecimal> orderNum = new HashMap<>(16);
        Map<String, BigDecimal> orderMoney = new HashMap<>(16);
        for (String date: orders.keySet()) {
            orderNum.put(date, (BigDecimal) orders.get(date).get(0));
            orderMoney.put(date, (BigDecimal) orders.get(date).get(1));
        }

        model.addAttribute("order_num", orderNum);
        model.addAttribute("order_money", orderMoney);
        return "home";
    }

    @RequestMapping(value = "/admin/shopadding", method = RequestMethod.GET)
    public String shopAdding()
    {
        return "shopadding";
    }

    @RequestMapping(value = "/admin/shoplist", method = RequestMethod.GET)
    public String shopList()
    {
        return "shoplist";
    }

    @RequestMapping(value = "/admin/shopclassify", method = RequestMethod.GET)
    public String shopClassify()
    {
        return "shopclassify";
    }

    @RequestMapping(value = "/admin/shoptype", method = RequestMethod.GET)
    public String shopType()
    {
        return "shoptype";
    }

    @RequestMapping(value = "/admin/shopbrand", method = RequestMethod.GET)
    public String shopBrand()
    {
        return "shopbrand";
    }

    @RequestMapping(value = "/admin/spikelist", method = RequestMethod.GET)
    public String spikeList()
    {
        return "spikelist";
    }

    @RequestMapping(value = "/admin/couponlist", method = RequestMethod.GET)
    public String couponList()
    {
        return "couponlist";
    }

    @RequestMapping(value = "/admin/recommendbrand", method = RequestMethod.GET)
    public String recommendBrand()
    {
        return "recommendbrand";
    }

    @RequestMapping(value = "/admin/recommendnew", method = RequestMethod.GET)
    public String recommendNew()
    {
        return "recommendnew";
    }

    @RequestMapping(value = "/admin/recommendpopular", method = RequestMethod.GET)
    public String recommendPopular()
    {
        return "recommendpopular";
    }

    @RequestMapping(value = "/admin/recommendspecial", method = RequestMethod.GET)
    public String recommendSpecial()
    {
        return "recommendspecial";
    }

    @RequestMapping(value = "/admin/adlist", method = RequestMethod.GET)
    public String adList()
    {
        return "adlist";
    }
}
