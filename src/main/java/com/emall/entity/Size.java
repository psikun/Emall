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
 * @Description Size
 * @date 2022/09/01/ 11:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "pms_size实体类")
@TableName("pms_size")
public class Size {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("尺寸id")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("尺寸名称")
    private String name;

    @ApiModelProperty("属性id")
    private Integer attributeId;

    @ApiModelProperty("库存")
    private Integer inventory;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    @ApiModelProperty("删除")
    private Integer deleted;



}
