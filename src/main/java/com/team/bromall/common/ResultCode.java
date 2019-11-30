package com.team.bromall.common;

/**
 * 常用API操作码 ResultCode 枚举类型
 *
 * @author team
 * @version v1.0
 * @date 2019/11/25 14:59
 */
public enum ResultCode implements IErrorCode {
    /**
     * SUCCESS
     */
    SUCCESS(200, "操作成功"),
    /**
     * FAILED
     */
    FAILED(500, "操作失败"),
    /**
     * VALIDATE_FAILED
     */
    VALIDATE_FAILED(404, "参数检验失败"),
    /**
     * UNAUTHORIZED
     */
    UNAUTHORIZED(401, "暂未登录或token已经过期!"),
    /**
     * FORBIDDEN
     */
    FORBIDDEN(403, "没有相关权限");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
