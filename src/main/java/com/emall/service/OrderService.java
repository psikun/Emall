package com.emall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.emall.entity.Address;
import com.emall.entity.Brand;
import com.emall.entity.Order;

import java.util.List;

/**
 * The interface Order service.
 */
public interface OrderService extends IService<Order> {
    /**
     * 根据id获取订单信息
     *
     * @param id id
     * @return Order order by id
     */
    Order getOrderById(int id);

    List<Order> list();

    /**
     * Add int.
     *
     * @param order the order
     * @return the int
     */
    int add(Order order);

    /**
     * Update int.
     *
     * @param order the order
     * @return the int
     */
    int update(Order order);

    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    int delete(int id);

    /**
     * Gets user name by user id.
     *
     * @param UserId the user id
     * @return the user name by user id
     */
    String getUserNameByUserId(int UserId);


    Address getDzxxByAddress(int AddressId);


}
