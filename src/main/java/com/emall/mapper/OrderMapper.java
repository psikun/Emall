package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 根据id获取订单信息
     *
     * @param id id
     * @return Order
     */
    Order getOrderById(@PathVariable("id") int id);
    /**
     * List list
     * @return the list
     */
    List<Order> list();
    /**
     * Add.
     *
     * @param order the order
     */
    int add(Order order);
    /**
     *
     * @param order
     * @return
     */
    int update(Order order);


    String getUserNameByUserId(@PathVariable("UserId")int UserId);

}
