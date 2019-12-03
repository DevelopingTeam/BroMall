package com.team.bromall.utils;

import cn.hutool.json.JSONUtil;
import com.team.bromall.common.CommonResult;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 未登录或者token失效访问接口时，自定义的返回结果
 *
 * @author team
 * @version v1.0
 * @date 2019/11/29 21:09
 */
public class UserAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void  commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/javascript;charset=utf-8");
        response.getWriter().println(JSONUtil.parse(CommonResult.unauthorized(authException.getMessage())));
    }
}
