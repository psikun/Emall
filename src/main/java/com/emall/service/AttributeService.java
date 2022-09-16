package com.emall.service;

import com.emall.entity.Attribute;
import com.emall.entity.Size;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AttributeService {
    /**
     * 根据id获取属性
     *
     * @param id id
     * @return Attribute
     */
    Attribute getAttributeById(int id);
    /**
     * List list
     * @return the list
     */
    List<Attribute> list();
    int add(Attribute attribute);
    int update(Attribute attribute);
    int delete(int id);
    /**
     * 根据属性id获取尺寸表
     *
     * @param id id
     * @return Attribute
     */

    List<Size> getSizeByAttributeId( int id);
}
