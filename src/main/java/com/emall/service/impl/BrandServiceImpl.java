package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.Attribute;
import com.emall.entity.Brand;
import com.emall.mapper.BrandMapper;
import com.emall.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SiKun
 * @Description BrandServiceImpl
 * @date 2022/09/01/ 11:01
 */

@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    BrandMapper brandMapper;

    @Override
    public Brand getBrandById(int id) {
        return brandMapper.getBrandById(id);
    }

    @Override
    public List<Brand> list(Page<Brand> page){
        brandMapper.list();
        return page.getRecords();
    }

    @Override
    public int add(Brand brand) {
        return brandMapper.add(brand);
    }

    @Override
    public int update(Brand brand) { return brandMapper.update(brand);}

    @Override
    public  int delete(int id) { return brandMapper.deleteById(id);}

}
