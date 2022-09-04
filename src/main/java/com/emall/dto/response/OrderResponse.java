package com.emall.dto.response;

import com.emall.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author SiKun
 * @Description OrderResponse
 * @date 2022/09/04/ 16:41
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private List<Order> list;
    private Integer total;
}
