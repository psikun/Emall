package com.emall.service.impl;

import com.emall.entity.Size;
import com.emall.mapper.SizeMapper;
import com.emall.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GJ
 * @Description SizeServiceImpl
 * @date 2022/09/01/ 16:30
 */
@Service
public class SizeServiceImpl implements SizeService {

    @Autowired
    SizeMapper sizeMapper;

    @Override
    public Size getSizeById(int id){
        return sizeMapper.getSizeById(id);
    }

    @Override
    public List<Size> list(){
        return sizeMapper.list();
    }

    @Override
    public int add(Size size){ return sizeMapper.add(size);}

    @Override
    public int update(Size size){ return sizeMapper.update(size);}

    @Override
    public int delete(int id) { return sizeMapper.deleteById(id);}

}
