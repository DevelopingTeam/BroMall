package com.team.bromall.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * 用户注册参数
 *
 * @author team
 * @version v1.0
 * @date 2019/11/23 11:15
 */
public class AdminParam {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空.")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空.")
    private String password;
    private String icon;
    @Email(message = "邮箱格式不合法")
    private String email;
    private String nickname;
    private String note;
}
