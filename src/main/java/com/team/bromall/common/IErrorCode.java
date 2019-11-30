package com.team.bromall.common;

/**
 * 封装API的错误码
 *
 * @author team
 * @version v1.0
 * @date 2019/11/25 14:59
 */
public interface IErrorCode {
    /**
     * 获取代码
     * @return 错误代码
     */
    long getCode();

    /**
     * 获取消息
     * @return 错误消息
     */
    String getMessage();
}
