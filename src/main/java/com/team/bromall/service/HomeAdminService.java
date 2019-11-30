package com.team.bromall.service;

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
}
