package com.emall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.emall.entity.Brand;

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
}
