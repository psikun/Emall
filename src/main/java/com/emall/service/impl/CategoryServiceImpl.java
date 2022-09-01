package com.emall.service.impl;

import com.emall.entity.Category;
import com.emall.mapper.CategoryMapper;
import com.emall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lison
 * @Description CategoryServiceImpl
 * @date 2022/09/01/ 18:05
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public Category getCategoryById(int id){
        return categoryMapper.getCategoryById(id);
    }
}