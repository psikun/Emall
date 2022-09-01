package com.emall.service;

import com.emall.entity.Attribute;

public interface AttributeService {
    /**
     * 根据id获取属性
     *
     * @param id id
     * @return Brand
     */
    Attribute getAttributeById(int id);
}
