package com.emall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.emall.entity.Attribute;
import com.emall.entity.Brand;

import java.util.List;

/**
 * @author SiKun
 * @Description BrandService
 * @date 2022/09/01/ 10:59
 */


public interface BrandService extends IService<Brand> {
    /**
     * 根据id获取品牌
     *
     * @param id id
     * @return Brand
     */
    Brand getBrandById(int id);
    /**
     * List list
     * @return the list
     */
    List<Brand> list(Page<Brand> page);
    /**
     * Add.
     *
     * @param brand
     */
    int add(Brand brand);

    /**
     *
     * @param brand
     * @return
     */
    int update(Brand brand);

    int delete(int id);
}
