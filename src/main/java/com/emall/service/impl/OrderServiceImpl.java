package com.emall.service.impl;

import com.emall.entity.Order;
import com.emall.mapper.OrderMapper;
import com.emall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public Order getOrderById(int id) { return orderMapper.getOrderById(id);}

    @Override
    public List<Order> list(){
        return orderMapper.list();
    }

    @Override
    public int add(Order order) {
        return orderMapper.add(order);
    }
    @Override
    public int update(Order order){ return orderMapper.update(order);}
    @Override
    public  int delete(int id){ return orderMapper.deleteById(id);}
}
