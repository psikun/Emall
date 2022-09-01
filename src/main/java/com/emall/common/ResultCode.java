package com.emall.common;

/**
 * @author SiKun
 * @date 2021/10/19/ 20:34
 */

public enum ResultCode {
    // 操作成功
    SUCCESS(200, "操作成功"),
    // 操作失败
    FAILED(500, "操作失败"),
    // 登陆失败
    VALIDATE_FAILED(404, "参数检验失败"),
    // 未登录
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    // 无权限
    FORBIDDEN(403, "没有相关权限");;
    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
