package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Category;

import com.emall.entity.Goods;
import com.emall.service.CategoryService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    CategoryService categoryService;

    @ApiOperation("通过分类id获取分类信息")
    @GetMapping("/{categoryId}")
    public Result<Category> getCategoryById(int categoryId) {
        Category category = categoryService.getCategoryById(categoryId);
        if (category == null) {
            return Result.failed();
        }
        return Result.success(category, "成功了");

    }

    @ApiOperation("展示分类表的所有信息")
    @GetMapping("/list")
    public Result<List<Category>> list() {
        List<Category> list = categoryService.list();
        if (list == null) {
            return Result.failed();
        }
        return Result.success(list, "成功了");
    }

    @ApiOperation("增加分类信息")
    @PostMapping("/add")
    public Result<String> add(@RequestBody Category category) {
        if (categoryService.add(category) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }
    @ApiOperation("更新分类信息")
    @PostMapping("/update")
    public Result<String> update(@RequestBody  Category category){
        if(categoryService.update(category)!=0){
            return Result.success("更新成功");

        }
        return  Result.failed("更新失败");
    }
    @ApiOperation(("通过父id查询分类信息"))
    @PostMapping("/listCategoryByParentId")
    public Result<List<Category>> listCategoryByParentId(int id){
        List<Category> list=categoryService.listCategoryByParentId(id);
        if(list!=null){
            return Result.success(list,"查询成功");
        }
        return Result.failed();

    }
    @ApiOperation("根据第一分类id展示商品信息")
    @PostMapping("/listGoodsByFirstId")
    public Result<List<Goods>> listGoodsByFirstId(int id){
        List<Goods> list=categoryService.listGoodsByFirstId(id);
        if(list != null){
            return Result.success(list,"获取成功");
        }
        return Result.failed();
    }



}
