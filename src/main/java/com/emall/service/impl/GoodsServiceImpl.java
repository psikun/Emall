package com.emall.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.dto.request.SearchGoodsRequest;
import com.emall.entity.Attribute;
import com.emall.entity.Goods;
import com.emall.mapper.BrandMapper;
import com.emall.mapper.GoodsMapper;
import com.emall.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lison
 * @Description GoodsServiceImpl
 * @date 2022/09/02/ 11:39
 */
@Service
@Slf4j
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods>
        implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    BrandMapper brandMapper;

    @Override
    public Goods getGoodsById(int id) {
        return goodsMapper.getGoodsById(id);
    }

    public List<Goods> list(Page<Goods> page) {
        goodsMapper.list(page);
        return page.getRecords();
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
    public List<Attribute> getListAttributeByGoodsId(int id) {
        return goodsMapper.getListAttributeByGoodsId(id);
    }

    @Override
    public List<Goods> searchGoods(SearchGoodsRequest searchGoodsRequest) {
        log.info(goodsMapper.searchGoods(searchGoodsRequest).toString());
        return goodsMapper.searchGoods(searchGoodsRequest);
    }


}
