package com.emall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.emall.entity.Brand;
import com.emall.entity.Category;
import com.emall.entity.Goods;

import java.util.List;

/**
 * The interface Category service.
 *
 * @author Lisonn
 * @Description CategoryService
 * @date 2022 /09/01/ 18:03
 */
public interface CategoryService extends IService<Category> {
    /**
     * 根据id获取分类
     *
     * @param id id
     * @return Category
     */
    Category getCategoryById(int id);


    /**
     *
     *
     * @return the list
     */
    List<Category> list(Page<Category> page);

    /**
     * Add int.
     *
     * @param category the category
     * @return the int
     */
    int add1(Category category);
    int add2(Category category);
    /**
     * Update int.
     *
     * @param category the category
     * @return the int
     */

    int update(Category category);

    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    int delete(int id);

    /**
     * List category by parent id list.
     *
     * @param id the id
     * @return the list
     */
    List<Category> listCategoryByParentId(int id);

    /**
     * List goods by first id list.
     *
     * @param id the id
     * @return the list
     */
    List<Goods> listGoodsByFirstId(int id);

    List<Category> show(int id);

}
