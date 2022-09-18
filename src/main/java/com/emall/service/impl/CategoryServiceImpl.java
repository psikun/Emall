package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.Category;
import com.emall.entity.Goods;
import com.emall.mapper.CategoryMapper;
import com.emall.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lison
 * @Description CategoryServiceImpl
 * @date 2022/09/01/ 18:05
 */
@Service
@Slf4j
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public Category getCategoryById(int id) {
        return categoryMapper.getCategoryById(id);
    }

    @Override
    public List<Category> list(Page<Category> page, Integer parentId) {
        categoryMapper.list(page, parentId);
        log.info(categoryMapper.list(page, parentId).toString());
        return page.getRecords();
    }

    @Override
    public int add1(Category category) {
        return categoryMapper.add1(category);
    }

    @Override
    public int add2(Category category) {
        return categoryMapper.add2(category);
    }

    @Override
    public int update(Category category) {
        return categoryMapper.update(category);
    }

    @Override
    public int delete(int id) {
        return categoryMapper.deleteById(id);
    }

    @Override
    public List<Category> listCategoryByParentId(int id) {
        return categoryMapper.listCategoryByParentId(id);
    }

    @Override
    public List<Goods> listGoodsByFirstId(int id) {
        return categoryMapper.listGoodsByFirstId(id);
    }

    @Override
    public List<Category> show(int id) {
        return categoryMapper.show(id);
    }

}
