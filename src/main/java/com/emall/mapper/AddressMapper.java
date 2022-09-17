package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface AddressMapper extends BaseMapper<Address> {


    Address getAddressById(@PathVariable("id") int id);


    List<Address> list();


    int add(Address address);


    int update(Address address);

    List<String> getAddressByUserId(int userId);

}
