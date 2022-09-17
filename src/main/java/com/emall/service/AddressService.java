package com.emall.service;

import com.emall.entity.Address;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AddressService{
    /**
     * 根据id获取收货地址
     *
     * @param id id
     * @return Address
     */
    Address getAddressById(@PathVariable("id") int id);

    /**
     * List list
     * @return   list
     */
    List<Address> list();
    /**
     * Add
     *
     * @param
     */
    int add(Address address);

    /**
     *
     * @param
     * @return Address
     */
    int update(Address address);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(int id);
    List<String> getAddressByUserId(int userId);
}
