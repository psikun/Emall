package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Category;
import com.emall.mapper.CategoryMapper;
import com.emall.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lison
 * @Description CategoryController
 * @date 2022/09/01/ 18:10
 */
@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryMapper categoryMapper;
    @ApiOperation("通过分类id获取分类信息")
    @GetMapping("/{categoryId}")
    public Result<Category> getCategoryById(int categoryId){
        Category category= categoryMapper.getCategoryById(categoryId);
        if(category==null){
            return Result.failed();
        }
        return Result.success(category,"成功了");

    }
}
