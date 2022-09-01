package com.emall.service;

import com.emall.entity.Category;

/**
 * @author Lisonn
 * @Description CategoryService
 * @date 2022/09/01/ 18:03
 */
public interface CategoryService {
    /**
     * 根据id获取分类
     *
     * @param id id
     * @return Category
     */
    Category getCategoryById(int id);
}
