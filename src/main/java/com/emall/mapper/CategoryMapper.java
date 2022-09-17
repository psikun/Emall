package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.emall.entity.Category;
import com.emall.entity.Goods;
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
    IPage list(Page<?> page);

    /**
     * Add.
     *
     * @param category the category
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
