package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Attribute;
import com.emall.entity.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author SiKun
 * @Description BrandMapper
 * @date 2022/09/01/ 10:49
 */
@Mapper
public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * 根据id获取品牌
     *
     * @param id id
     * @return Brand
     */
    Brand getBrandById(@PathVariable("id") int id);

    /**
     * List list
     * @return the list
     */
    List<Brand> list();
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

}
