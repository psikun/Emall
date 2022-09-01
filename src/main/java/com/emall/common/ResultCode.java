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
    ;
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
