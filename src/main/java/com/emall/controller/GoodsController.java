package com.emall.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.emall.common.Result;
import com.emall.dto.request.SearchGoodsRequest;
import com.emall.dto.response.GoodsResponse;
import com.emall.entity.Attribute;
import com.emall.entity.Goods;
import com.emall.service.AttributeService;
import com.emall.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
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
    AttributeService attributeService;

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
    @GetMapping()
    public Result<GoodsResponse> list(@RequestParam(defaultValue = "1") Integer pageNum,
                                      @RequestParam(defaultValue = "10") Integer pageSize) {
        List<Goods> list = goodsService.list(new Page<>(pageNum, pageSize));
        return getGoodsResponseResult(list);
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
    public Result<String> update(@RequestBody Goods goods) {
        if (goodsService.update(goods) != 0) {
            return Result.success("更新成功");

        }
        return Result.failed("更新失败");
    }

    @ApiOperation("通过商品id查询属性集合")
    @GetMapping("/getListAttributeByGoodsId")
    public Result<List<Attribute>> getListAttributeByGoodsId(int id) {
        List<Attribute> list = goodsService.getListAttributeByGoodsId(id);
        if (list != null) {
            return Result.success(list, "查询成功");
        }
        return Result.failed();

    }

    @ApiOperation("根据id删除商品")
    @DeleteMapping("/delete")
    public Result<String> deleteById(int id) {
        int delete = goodsService.delete(id);
        if (delete == 1) {
            return Result.success(null, "删除成功");
        }
        return Result.failed("删除失败");
    }

    @PostMapping("/search")
    public Result<GoodsResponse> searchGoods(@RequestBody SearchGoodsRequest searchGoodsRequest) {
        log.info(searchGoodsRequest.toString());
        List<Goods> list = goodsService.searchGoods(searchGoodsRequest);
        return getGoodsResponseResult(list);
    }

    @NotNull
    private Result<GoodsResponse> getGoodsResponseResult(List<Goods> list) {
        GoodsResponse goodsResponse = new GoodsResponse();

        if (list != null) {
            goodsResponse.setList(list);
        }
        long total = goodsService.count();
        goodsResponse.setTotal((int) total);
        if (goodsResponse == null) {
            return Result.failed();
        }
        return Result.success(goodsResponse, "成功了");
    }
}
