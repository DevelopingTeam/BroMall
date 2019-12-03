package com.team.bromall.controller;

import com.team.bromall.service.HomeAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * bromall
 *
 * @author team
 * @version v1.0
 * @date 2019/12/1 23:08
 */
@Controller
public class HomeAdminController {

    @Autowired
    private HomeAdminService homeAdminService;

    @RequestMapping(value = "/admin/home", method = RequestMethod.POST)
    public String getPage(@RequestBody HashMap manageMap) {
        String pageName = (String) manageMap.get("manage_name");
        System.out.println(homeAdminService.getPageURI(pageName));
        String uri = homeAdminService.getPageURI(pageName);
        return "redirect:" + uri;
    }

    @RequestMapping(value = "/admin/home", method = RequestMethod.GET)
    public String home()
    {
        return "home";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index()
    {
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

    @RequestMapping(value = "/admin/orderlist", method = RequestMethod.GET)
    public String orderList()
    {
        return "orderlist";
    }

    @RequestMapping(value = "/admin/ordersetting", method = RequestMethod.GET)
    public String orderSetting()
    {
        return "ordersetting";
    }

    @RequestMapping(value = "/admin/ordercanceling", method = RequestMethod.GET)
    public String orderCanceling()
    {
        return "ordercanceling";
    }

    @RequestMapping(value = "/admin/ordercancelsetting", method = RequestMethod.GET)
    public String orderCancelSetting()
    {
        return "ordercancelsetting";
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
