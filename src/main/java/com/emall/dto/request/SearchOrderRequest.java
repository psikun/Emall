package com.emall.dto.request;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.emall.entity.Goods;
import lombok.Data;

/**
 * @author Lison
 * @Description SearchOrderRequest
 * @date 2022/09/17/ 15:10
 */
@Data
public class SearchOrderRequest {
    private int id;
    private int status;
    private int userId;
}
