package com.emall.dto.response;

import com.emall.entity.Goods;
import com.emall.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author SiKun
 * @Description GoodsResponse
 * @date 2022/09/04/ 19:38
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsResponse {

    private List<Goods> list;
    private Integer total;
}
