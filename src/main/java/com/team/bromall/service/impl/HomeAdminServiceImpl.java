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
        pageMap.put("shopadding", "product-manage/shopadding");
        pageMap.put("shoplist", "product-manage/shoplist");
        pageMap.put("shopclassify", "product-manage/shopclassify");
        pageMap.put("shoptype", "product-manage/shoptype");
        pageMap.put("shopbrand", "product-manage/shopbrand");
        return pageMap.get(pageName);
    }
}
