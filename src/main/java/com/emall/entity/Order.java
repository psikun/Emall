package com.emall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "oms_order实体类")
@TableName("oms_order")
public class Order {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("订单ID")
    @TableId(value = "id", type = IdType.AUTO)
    public Integer id;
    @ApiModelProperty("用户ID")
    public Integer userId;
    @ApiModelProperty("地址ID")
    public Integer addressId;

    @ApiModelProperty("支付金额")
    public Double payment;
    @ApiModelProperty("运费")
    public Double freight;
    @ApiModelProperty("订单状态")
    public String orderStatus;
    @ApiModelProperty("支付时间")
    public Date paymentTime;
    @ApiModelProperty("发货时间")
    public Date deliveryTime;
    @ApiModelProperty("订单完成时间")
    public Date finishedTime;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("更新时间")
    private Date updateTime;
    @ApiModelProperty("删除")
    public Integer deleted;


}
