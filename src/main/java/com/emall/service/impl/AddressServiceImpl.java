package com.emall.service.impl;

import com.emall.entity.Address;
import com.emall.mapper.AddressMapper;
import com.emall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GJ
 * @Description AddressServiceImpl
 * @date 2022/09/02/ 12:49
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public Address getAddressById(int id){ return addressMapper.getAddressById(id);}

    @Override
    public List<Address> list(){ return addressMapper.list();}

    @Override
    public int add(Address address){ return addressMapper.add(address);}

    @Override
    public int update(Address address){ return addressMapper.update(address);}

    @Override
    public int delete(int id){ return addressMapper.deleteById(id);}
    @Override
    public List<String> getAddressByUserId(int userId){return addressMapper.getAddressByUserId(userId);};
}
