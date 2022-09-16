package com.emall.service.impl;

import com.emall.entity.Attribute;
import com.emall.entity.Size;
import com.emall.mapper.AttributeMapper;
import com.emall.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AttributeServiceImpl implements AttributeService {

    @Autowired
    AttributeMapper attributeMapper;

    @Override
    public Attribute getAttributeById(int id) { return attributeMapper.getAttributeById(id);}

    @Override
    public List<Attribute> list(){
        return attributeMapper.list();
    }

    @Override
    public int add(Attribute attribute) {
        return attributeMapper.add(attribute);
    }

    @Override
    public int update(Attribute attribute){ return attributeMapper.update(attribute);}

    @Override
    public int delete(int id){ return attributeMapper.deleteById(id);}

    @Override
    public List<Size> getSizeByAttributeId(int id) {
        return attributeMapper.getSizeByAttributeId(id);
    }

}
