package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Attribute;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper
public interface AttributeMapper extends BaseMapper<Attribute> {

    /**
     * 根据id获取属性
     *
     * @param id id
     * @return Brand
     */
    Attribute getAttributeById(@PathVariable("id") int id);

}
