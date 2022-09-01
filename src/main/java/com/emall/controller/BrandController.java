package com.emall.controller;

import com.emall.entity.Brand;
import com.emall.service.BrandService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SiKun
 * @Description BrandController
 * @date 2022/09/01/ 10:40
 */

@Slf4j
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    BrandService brandService;

    @ApiOperation("通过品牌id获取品牌信息")
    @GetMapping("/{brandId}")
    public String getBrandById(@PathVariable("brandId") int brandId) {
        Brand brand = brandService.getBrandById(brandId);
        if (brand == null) {
            return "404";
        }
        return brand.toString();
    }
}
