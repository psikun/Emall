package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Lison
 * @Description CategoryMapper
 * @date 2022/09/01/ 17:54
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
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
     * Add.
     *
     * @param category the category
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
