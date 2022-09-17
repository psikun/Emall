package com.emall.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.emall.common.Result;
import com.emall.entity.Category;

import com.emall.entity.Goods;
import com.emall.service.CategoryService;
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
    @GetMapping()
    public Result<List<Category>> list(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "10") Integer pageSize) {
        List<Category> list = categoryService.list(new Page<>(pageNum, pageSize));
        if (list == null) {
            return Result.failed();
        }
        return Result.success(list, "成功了");
    }

    @ApiOperation("增加一级分类信息")
    @PostMapping("/add1")
    public Result<String> add1(@RequestBody Category category) {
        if (categoryService.add1(category) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }
    @ApiOperation("增加二级分类信息")
    @PostMapping("/add2")
    public Result<String> add2(@RequestBody Category category) {
        if (categoryService.add2(category) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }
    @ApiOperation("更新分类信息")
    @PutMapping("/update")
    public Result<String> update(@RequestBody  Category category){
        if(categoryService.update(category)!=0){
            return Result.success("更新成功");

        }
        return  Result.failed("更新失败");
    }
    @ApiOperation(("通过父id查询分类信息"))
    @GetMapping("/listCategoryByParentId")
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


    @ApiOperation("根据分类删除商品")
    @DeleteMapping("/delete")
    public Result<String> deleteById(int id){
        int delete = categoryService.delete(id);
        if(delete == 1){
            return Result.success(null,"删除成功");
        }
        return Result.failed("删除失败");
    }

    @ApiOperation("查看二级类目表")
    @GetMapping("/show")
    public Result<List<Category>> show(@RequestParam("id") int id) {
        log.info(String.valueOf(id));
      List<Category> list=categoryService.show(id);
        if (list == null) {
            return Result.failed();
        }
        return Result.success(list, "成功");
    }


}
