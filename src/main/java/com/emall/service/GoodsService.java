package com.emall.service;

import com.emall.entity.Category;
import com.emall.entity.Goods;

import java.util.List;

/**
 * @author Lisonn
 * @Description GoodsService
 * @date 2022/09/02/ 11:39
 */
public interface GoodsService {
    /**
     * Gets goods by id.
     *
     * @param id the id
     * @return the goods by id
     */
    Goods getGoodsById(int id);

    /**
     * List list.
     *
     * @return the list
     */
    List<Goods> list();

    /**
     * Add int.
     *
     * @param goods the goods
     * @return the int
     */
    int add(Goods goods);

    /**
     * Update int.
     *
     * @param goods the goods
     * @return the int
     */
    int update(Goods goods);

    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    int delete(int id);


}
