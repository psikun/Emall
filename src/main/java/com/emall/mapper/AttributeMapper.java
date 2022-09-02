package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Attribute;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface AttributeMapper extends BaseMapper<Attribute> {

    /**
     * 根据id获取属性
     *
     * @param id id
     * @return Attribute
     */

    Attribute getAttributeById(@PathVariable("id") int id);

    /**
     * List list
     * @return the list
     */
    List<Attribute> list();
    /**
     * Add.
     *
     * @param attribute the attribute
     */
    int add(Attribute attribute);
}
