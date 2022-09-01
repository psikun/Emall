package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Brand;
import com.emall.entity.Size;
import com.emall.service.SizeService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GJ
 * @Description SizeController
 * @date 2022/09/01/ 16:43
 */
@Slf4j
@RestController
@RequestMapping("/size")
public class SizeController {
    @Autowired
    SizeService sizeService;

    @ApiOperation("通过属性id获取尺寸id")
    @GetMapping("/{sizeId}")
    public Result<Size> getSizeById(@PathVariable("sizeId") int sizeId) {
        Size size = sizeService.getSizeById(sizeId);
        if (size == null) {
            return Result.failed();
        }
        return Result.success(size, "成功获取信息");
    }



    }


