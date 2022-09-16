package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.Address;
import com.emall.entity.Brand;
import com.emall.entity.Order;
import com.emall.entity.Status;
import com.emall.mapper.BrandMapper;
import com.emall.mapper.OrderMapper;
import com.emall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {
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
    public int delete(int id){ return orderMapper.deleteById(id);}
    @Override
    public String getUserNameByUserId(int UserId){
        return orderMapper.getUserNameByUserId(UserId);
    }

    @Override
    public Address getDzxxByAddress(int AddressId) {
        return  orderMapper.getDzxxByAddress(AddressId);
    }
}
