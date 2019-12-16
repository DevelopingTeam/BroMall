package com.team.bromall.controller;


import com.github.pagehelper.PageInfo;
import com.team.bromall.common.CommonPage;
import com.team.bromall.common.CommonResult;
import com.team.bromall.model.PmsProductCategory;
import com.team.bromall.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;


    @RequestMapping(value = "/admin/shopclassify", method = RequestMethod.GET)
    public String getList(@RequestParam(required = false, defaultValue = "1", value = "parentId") Long parentId,
                                                                @RequestParam(required = false,defaultValue = "1",value = "page") int page,
                                                                @RequestParam(required = false,defaultValue = "10",value = "pageSize") int pageSize,
                                                                Model model) {
        List<PmsProductCategory> productCategoryList = productCategoryService.getList(parentId, pageSize, page);
        PageInfo pageInfo = new PageInfo<>(productCategoryList,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("productCategoryList",productCategoryList);
        return "shopclassify";
    }


}
