package com.emall.service;

import com.emall.entity.Category;

import java.util.List;

/**
 * The interface Category service.
 *
 * @author Lisonn
 * @Description CategoryService
 * @date 2022 /09/01/ 18:03
 */
public interface CategoryService {
    /**
     * 根据id获取分类
     *
     * @param id id
     * @return Category
     */
    Category getCategoryById(int id);


    /**
     * List list.
     *
     * @return the list
     */
    List<Category> list();

    /**
     * Add int.
     *
     * @param category the category
     * @return the int
     */
    int add(Category category);
    /**
     * Update int.
     *
     * @param category the category
     * @return the int
     */
    int update(Category category);

}
