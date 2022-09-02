package com.emall.service;

import com.emall.entity.Order;

import java.util.List;

public interface OrderService {
    /**
     * 根据id获取订单信息
     *
     * @param id id
     * @return Order
     */
    Order getOrderById(int id);
    /**
     * List list
     * @return the list
     */
    List<Order> list();
    int add(Order order);
    int update(Order order);
    int delete(int id);
}
