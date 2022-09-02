package com.emall.service;

import com.emall.entity.Attribute;

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
}
