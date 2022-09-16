package com.emall.dto.request;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.emall.entity.Goods;
import lombok.Data;
import net.bytebuddy.asm.Advice;

/**
 * @author SiKun
 * @Description SearchGoodsRequest
 * @date 2022/09/16/ 22:18
 */

@Data
public class SearchGoodsRequest {
    private int id;
    private int deleted;
    private String name;
    private int categoryId;
    private IPage<Goods> page;
}
