package com.emall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author GJ
 * @Description Member
 * @date 2022/09/17/ 14:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "pms_member实体类")
@TableName("pms_member")
public class Member {

    @ApiModelProperty("会员ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员名称")
    private String name;

    @ApiModelProperty("会员电话")
    private String phone;

    @ApiModelProperty("会员地址id")
    private Integer addressId;

    @ApiModelProperty("订单数量")
    private Integer orderCount;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    @ApiModelProperty("删除")
    private Integer deleted;


}
