package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Attribute;
import com.emall.service.AttributeService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/attribute")
public class AttributeController {
    @Autowired
    AttributeService attributeService;

    @ApiOperation("通过属性id获取属性信息")
    @GetMapping("/{attributeId}")
    public Result<Attribute> getAttributeById(@PathVariable("attributeId") int attributeId) {
        Attribute attribute = attributeService.getAttributeById(attributeId);
        if (attribute == null) {
            return Result.failed();
        }
        return Result.success(attribute, "你成功啦");
    }
    @ApiOperation("展示属性表所有信息")
    @GetMapping("/list")
    public Result<List<Attribute>> list(){
        List<Attribute> list = attributeService.list();
        if (list==null)
            return Result.failed();
        else
            return Result.success(list,"成功了");
    }
    @ApiOperation("添加属性信息")
    @PostMapping("/add")
    public Result<String> add(@RequestBody Attribute attribute) {
        if (attributeService.add(attribute) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }
}
