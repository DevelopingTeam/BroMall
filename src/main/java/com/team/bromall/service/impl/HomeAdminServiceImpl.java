package com.team.bromall.service.impl;

import com.team.bromall.service.HomeAdminService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * bromall
 *
 * @author zhangbocheng
 * @version v1.0
 * @date 2019/12/2 10:16
 */
@Service
public class HomeAdminServiceImpl implements HomeAdminService {
    private Map<String, String> pageMap = new HashMap<>();

    @Override
    public String getPageURI(String pageName) {
        pageMap.put("shopadding", "shopadding");
        pageMap.put("shoplist", "shoplist");
        pageMap.put("shopclassify", "shopclassify");
        pageMap.put("shoptype", "shoptype");
        pageMap.put("shopbrand", "shopbrand");
        String uri = pageMap.get(pageName);
        if (uri != null) {
            return uri;
        } else {
            return "404";
        }
    }
}
