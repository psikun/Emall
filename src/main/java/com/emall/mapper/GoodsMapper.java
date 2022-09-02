package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Lison
 * @Description GoodsMapper
 * @date 2022/09/02/ 11:37
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
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
}
