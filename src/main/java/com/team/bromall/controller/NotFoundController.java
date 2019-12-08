package com.team.bromall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * bromall
 *
 * @author team
 * @version v1.0
 * @date 2019/12/7 02:17
 */
@Controller
public class NotFoundController {
    @RequestMapping(value = "/admin/404", method = RequestMethod.GET)
    public String get404()
    {
        return "404";
    }

}
