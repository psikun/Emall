package com.emall.service.impl;

import com.emall.entity.Attribute;
import com.emall.mapper.AttributeMapper;
import com.emall.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeServiceImpl implements AttributeService {

    @Autowired
    AttributeMapper attributeMapper;

    @Override
    public Attribute getAttributeById(int id) {
        return attributeMapper.getAttributeById(id);
    }

    @Override
    public List<Attribute> list(){
        return attributeMapper.list();
    }
}
