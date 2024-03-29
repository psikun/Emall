package com.emall.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.emall.dto.request.SearchGoodsRequest;
import com.emall.entity.Attribute;
import com.emall.entity.Category;
import com.emall.entity.Goods;

import java.util.List;

/**
 * @author Lisonn
 * @Description GoodsService
 * @date 2022/09/02/ 11:39
 */
public interface GoodsService extends IService<Goods> {
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
    List<Goods> list(Page<Goods> page);

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

    /**
     * 通过商品id查询属性集合
     * @param id
     * @return
     */
    List<Attribute> getListAttributeByGoodsId(int id);


    /**
     * 查询商品
     * @param searchGoodsRequest
     * @return
     */
    List<Goods> searchGoods(SearchGoodsRequest searchGoodsRequest);
}
