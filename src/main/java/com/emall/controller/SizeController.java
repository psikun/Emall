package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Size;
import com.emall.service.SizeService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
   @ApiOperation("展示尺寸表所有信息")
    @GetMapping()
    public Result<List<Size>> list(){
        List<Size> list=sizeService.list();
        if(list==null){
            return  Result.failed();
        }
        return Result.success(list,"展示成功");
   }

    @ApiOperation("添加尺寸信息")
    @PostMapping ("/add")
    public Result<String> add(@RequestBody Size size){
    if(sizeService.add(size) != 0){
        return Result.success("添加成功");
    }
        return Result.failed("添加失败");
    }
    @ApiOperation("尺寸修改方法")
    @PostMapping("/update")
    public Result<String> update(@RequestBody Size size){
        if(sizeService.update(size) != 0) {
            return Result.success("修改成功");
        }
        return Result.failed("修改失败");
        }
    }




