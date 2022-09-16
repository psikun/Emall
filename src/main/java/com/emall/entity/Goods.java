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

/**
 * @author Lison
 * @Description Goods
 * @date 2022/09/02/ 10:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "pms_goods实体类")
@TableName("pms_goods")
public class Goods {
    @ApiModelProperty("商品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("一级分类id")
    private Integer firstId;

    @ApiModelProperty("二级分类id")
    private Integer secondId;

    @ApiModelProperty("商品价格")
    private double price;

    @ApiModelProperty("商品折扣")
    private double discount;

    @ApiModelProperty("商品介绍")
    private String information;

    @ApiModelProperty("商品品牌")
    private Integer brandId;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("删除")
    private Integer deleted;

    @ApiModelProperty("销量")
    private  Integer sales;
}
