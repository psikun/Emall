package com.emall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.emall.entity.Brand;
import com.emall.entity.Order;

import java.util.List;

public interface OrderService extends IService<Order> {
    /**
     * 根据id获取订单信息
     *
     * @param id id
     * @return Order
     */
    Order getOrderById(int id);

    List<Order> list();
    int add(Order order);
    int update(Order order);
    int delete(int id);
    String getUserNameByUserId(int UserId);
}
