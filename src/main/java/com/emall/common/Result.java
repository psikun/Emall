package com.emall.common;

/**
 * 通用结果类
 *
 * @author SiKun
 * @date 2021/10/19/ 20:35
 */

public class Result<T> {
    /**
     * 状态码
     */
    private long code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据集
     */
    private T data;

    public Result() {
    }

    public Result(long code) {
        this.code = code;
    }

    public Result(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @return 通用结果
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果(重载)
     *
     * @param data    获取的数据
     * @param message 提示的信息
     * @return 通用结果
     */
    public static <T> Result<T> success(T data, String message) {
        return new Result<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    public static <T> Result<T> failed() {
        return new Result<>(ResultCode.FAILED.getCode());
    }

    /**
     * 操作失败返回结果
     *
     * @param data 获取的数据
     * @return 通用结果
     */
    public static <T> Result<T> failed(T data) {
        return new Result<>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), data);
    }

    /**
     * 失败返回结果(重载)
     *
     * @param data    获取的数据
     * @param message 提示的信息
     * @return 通用结果
     */
    public static <T> Result<T> failed(T data, String message) {
        return new Result<>(ResultCode.FAILED.getCode(), message, data);
    }
}
