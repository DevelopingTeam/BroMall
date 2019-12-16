package com.team.bromall.controller;

import com.github.pagehelper.PageInfo;
import com.team.bromall.dto.ProductQueryParam;
import com.team.bromall.model.PmsProduct;
import com.team.bromall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value="/admin/shoplist",method = RequestMethod.GET)
    public String productList(ProductQueryParam queryParam,
                              @RequestParam(required = false,defaultValue = "1",value = "page") int page,
                              @RequestParam(required = false,defaultValue = "10",value = "pageSize") int pageSize,
                              Model model){
        List<PmsProduct> productList = productService.list(queryParam,pageSize,page);
        PageInfo pageInfo = new PageInfo<>(productList,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("productList",productList);
        return "shoplist";
    }

    @RequestMapping(value="/admin/shoplist",method = RequestMethod.POST)
    public String productListPost(ProductQueryParam queryParam,
                              @RequestParam(required = false,defaultValue = "1",value = "page") int page,
                              @RequestParam(required = false,defaultValue = "10",value = "pageSize") int pageSize,
                              Model model){
        List<PmsProduct> productList = productService.list(queryParam,pageSize,page);
        PageInfo pageInfo = new PageInfo<>(productList,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("productList",productList);
        return "shoplist";
    }
}
