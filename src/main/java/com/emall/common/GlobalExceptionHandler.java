package com.emall.common;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SiKun
 * @Description 全局异常处理
 * @date 2022/09/02/ 20:38
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 接口访问权限
     * @param httpServletRequest
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = AuthorizationException.class)
    public Result exceptionHandler(HttpServletRequest httpServletRequest, Exception e) {
        return Result.forbidden("没有权限访问");
    }
}
