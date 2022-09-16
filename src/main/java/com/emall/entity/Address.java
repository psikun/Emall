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
 * @Description address
 * @date 2022/09/02/ 11:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="oms_address实体类")
@TableName("oms_address")
public class Address{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("地址id")
    @TableId(value = "id",type = IdType.AUTO)
    public  Integer id;
    @ApiModelProperty("收货地址")
    public String address;
    @ApiModelProperty("收件人")
    public String recipient;
    @ApiModelProperty("收件人电话")
    public String phone;
    @ApiModelProperty("用户id")
    public Integer userId;
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
    @ApiModelProperty("删除")
    public Integer deleted;

}
