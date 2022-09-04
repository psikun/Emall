package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Attribute;
import com.emall.entity.Brand;
import com.emall.service.BrandService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Result<Brand> getBrandById(@PathVariable("brandId") int brandId) {
        Brand brand = brandService.getBrandById(brandId);
        if (brand == null) {
            return Result.failed();
        }
        return Result.success(brand, "你成功啦");
    }
    @ApiOperation("展示品牌表所有信息")
    @RequiresPermissions("查看商品")
    @GetMapping("/list")
    public Result<List<Brand>> list(){
        List<Brand> list = brandService.list();
        if (list==null) {
            return Result.failed();
        } else {
            return Result.success(list,"成功了");
        }
    }
    @ApiOperation("添加品牌信息")
    @PostMapping("/add")
    public Result<String> add(@RequestBody Brand brand) {
        if (brandService.add(brand) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }
    @ApiOperation("品牌的修改方法")
    @PostMapping("/update")
    public Result<String > update(@RequestBody Brand brand){
        if (brandService.update(brand) != 0){
            return Result.success("修改成功");
        }
        return Result.failed("修改失败");
    }
}
