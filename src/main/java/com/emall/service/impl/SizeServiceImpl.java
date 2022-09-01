package com.emall.service.impl;

import com.emall.entity.Size;
import com.emall.mapper.SizeMapper;
import com.emall.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author GJ
 * @Description SizeServiceImpl
 * @date 2022/09/01/ 16:30
 */
@Service
public class SizeServiceImpl implements SizeService {

    @Autowired
    SizeMapper sizeMapper;

    public Size getSizeById(int id){
        return sizeMapper.getSizeById(id);
    }
}
