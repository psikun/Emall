package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Category;
import com.emall.entity.Goods;
import com.emall.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lison
 * @Description GoodsController
 * @date 2022/09/02/ 11:55
 */
@Slf4j
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @ApiOperation("通过商品id获取商品信息")
    @GetMapping("/{goodsId}")
    public Result<Goods> getGoodsById(int goodsId) {
        //Category category = categoryService.getCategoryById(categoryId);
        Goods goods = goodsService.getGoodsById(goodsId);
        if (goods == null) {
            return Result.failed();
        }
        return Result.success(goods, "成功了");

    }
    @ApiOperation("展示商品表的所有信息")
    @GetMapping("/list")
    public Result<List<Goods>> list() {
        List<Goods> list = goodsService.list();
        if (list == null) {
            return Result.failed();
        }
        return Result.success(list, "成功了");
    }

    @ApiOperation("增加商品信息")
    @PostMapping("/add")
    public Result<String> add(@RequestBody Goods goods) {
        if (goodsService.add(goods) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }
    @ApiOperation("更新商品信息")
    @PostMapping("/update")
    public Result<String> update(@RequestBody  Goods goods){
        if(goodsService.update(goods)!=0){
            return Result.success("更新成功");

        }
        return  Result.failed("更新失败");
    }


}
