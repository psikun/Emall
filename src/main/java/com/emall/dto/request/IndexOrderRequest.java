package com.emall.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SiKun
 * @Description IndexOrderRequest
 * @date 2022/09/04/ 18:47
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndexOrderRequest {
    @ApiModelProperty("待付款")
    private Integer pendPay;
    @ApiModelProperty("待发货")
    private Integer payed;
    @ApiModelProperty("配送中")
    private Integer inDelivery;
    @ApiModelProperty("已取消")
    private Integer canceled;
    @ApiModelProperty("已完成")
    private Integer finished;
    @ApiModelProperty("支付金额")
    private Integer payAmount;
}
