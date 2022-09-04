package com.emall.dto;

import com.emall.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author SiKun
 * @Description OrderList
 * @date 2022/09/04/ 16:41
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderList {
    private List<Order> list;
    private Integer total;
}
