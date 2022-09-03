package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.Attribute;
import com.emall.entity.Category;
import com.emall.entity.Goods;
import com.emall.mapper.GoodsMapper;
import com.emall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lison
 * @Description GoodsServiceImpl
 * @date 2022/09/02/ 11:39
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods>
        implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public Goods getGoodsById(int id) {
        return goodsMapper.getGoodsById(id);
    }
    public List<Goods> list(){
        return goodsMapper.list();
    }

    @Override
    public int add(Goods goods) {
        return goodsMapper.add(goods);
    }

    @Override
    public int update(Goods goods) {
        return goodsMapper.update(goods);
    }

    @Override
    public int delete(int id) {
        return goodsMapper.deleteById(id);
    }

    @Override
    public List<Attribute> getListAttributeByGoodsId(int id){
        return goodsMapper.getListAttributeByGoodsId(id);
    }


}
