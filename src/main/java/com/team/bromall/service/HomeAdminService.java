package com.team.bromall.service;

import java.util.List;
import java.util.Map;

/**
 * 后台管理首页Service接口
 *
 * @author team
 * @version v1.0
 * @date 2019/12/2 10:12
 */
public interface HomeAdminService {
    /**
     * 根据page名称获取对应的URI
     * @param pageName page名称
     * @return Page URI
     */
    String getPageURI(String pageName);

    /**
     * 获取用户概况（分段新增和总数）
     * @return (今日/昨日/本月新增及会员总数)
     */
    //List<Integer> getUserProfile();

    /**
     * 获取商品概况（分段新增和总数）
     * @return (上架/下架/缺库存)
     */
   // List<Integer> getCommodityProfile();
}
