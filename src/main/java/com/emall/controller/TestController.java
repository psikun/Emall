package com.emall.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
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

    @GetMapping("test")
    public String test() {
        return "这是个测试类";
    }
}
