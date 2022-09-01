package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

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

}
