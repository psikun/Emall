package com.emall.controller;

import com.emall.common.Result;
import com.emall.dto.request.SearchOrderRequest;
import com.emall.dto.response.OrderInformationResponse;
import com.emall.dto.response.OrderResponse;
import com.emall.entity.Address;
import com.emall.entity.Order;
import com.emall.service.OrderService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Or;
import org.jetbrains.annotations.NotNull;
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
    public Result<OrderInformationResponse> getOrderById(@PathVariable("orderId") int orderId) {
        Order order = orderService.getOrderById(orderId);
        Address address=orderService.getDzxxByAddress(order.getAddressId());
        String uName=orderService.getUserNameByUserId(order.getUserId());
        OrderInformationResponse oIR=new OrderInformationResponse();
        oIR.setOrder(order);
        oIR.setAddress(address);
        oIR.setUsername(uName);
        if (order == null) {
            return Result.failed();
        }
        return Result.success(oIR, "你成功啦");
    }

    @ApiOperation("展示订单表所有信息")
    @GetMapping()
    public Result<OrderResponse> list() {
        List<Order> list = orderService.list();
        OrderResponse orderList = new OrderResponse();
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

    @ApiOperation("查询订单")
    @PostMapping("/search")
    public Result<OrderResponse> searchOrder(@RequestBody SearchOrderRequest searchOrderRequest){
        log.info(searchOrderRequest.toString());
        List<Order> list = orderService.searchOrder(searchOrderRequest);
        return getOrderResponseResult(list);
    }

    @NotNull
    private  Result<OrderResponse> getOrderResponseResult(List<Order> list){
//        OrderResponse orderResponse =new OrderResponse();
//
//        if(list!=null){
//            orderResponse.setList(list);
//        }
//        long total =orderService.count();
//        orderResponse.setTotal((int)total);
//        if(orderResponse == null){
//            return  Result.failed();
//        }
//        return Result.success(orderResponse,"我也成功了");
        OrderResponse orderList = new OrderResponse();
        orderList.setList(list);
        Integer total = Math.toIntExact(orderService.count());
        orderList.setTotal(total);
        if (list == null) {
            return Result.failed();
        } else {
//            for (Order order : list) {
//                System.out.println(list);
//            }
            return Result.success(orderList, "成功了");
        }
    }

}
