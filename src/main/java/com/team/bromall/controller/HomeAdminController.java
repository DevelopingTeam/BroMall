package com.team.bromall.controller;

import com.team.bromall.service.HomeAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "/admin/layout", method = RequestMethod.GET)
    public String getPage(@RequestParam(value = "product-manage") String pageName) {
        return homeAdminService.getPageURI(pageName);
    }
}
