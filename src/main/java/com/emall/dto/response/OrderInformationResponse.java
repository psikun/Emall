package com.emall.dto.response;

import com.emall.entity.Address;
import com.emall.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lison
 * @Description OrderInformationResponse
 * @date 2022/09/16/ 17:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInformationResponse {
    private Order order;
    private Address address;
    private String username;
}
