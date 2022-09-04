package com.emall.controller;

import com.emall.common.Result;
import com.emall.dto.OrderList;
import com.emall.entity.Order;
import com.emall.service.OrderService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @ApiOperation("通过订单id获取订单信息")
    @GetMapping("/{orderId}")
    public Result<Order> getOrderById(@PathVariable("orderId") int orderId) {
        Order order = orderService.getOrderById(orderId);
        if (order == null) {
            return Result.failed();
        }
        return Result.success(order, "你成功啦");
    }

    @ApiOperation("展示订单表所有信息")
    @GetMapping()
    public Result<OrderList> list() {
        List<Order> list = orderService.list();
        OrderList orderList = new OrderList();
        orderList.setList(list);
        Integer total = Math.toIntExact(orderService.count());
        orderList.setTotal(total);
        if (list == null) {
            return Result.failed();
        } else {
            return Result.success(orderList, "成功了");
        }
    }

    @ApiOperation("添加订单信息")
    @PostMapping("/add")
    public Result<String> add(@RequestBody Order order) {
        if (orderService.add(order) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }

    @ApiOperation("订单的修改方法")
    @PostMapping("/update")
    public Result<String> update(@RequestBody Order order) {
        if (orderService.update(order) != 0) {
            return Result.success("修改成功");
        }
        return Result.failed("修改失败");
    }
}
