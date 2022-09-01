package com.emall.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SiKun
 * @Description TestController
 * @date 2022/08/31/ 11:13
 */

@Slf4j
@RestController
public class TestController {

    @ApiOperation("这是一个测试类")
    @GetMapping("test")
    public String test(int number, String name) {
        return number + name;
    }
}
