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
@ApiModel(value = "pms_attribute实体类")
@TableName("pms_attribute")
public class Attribute {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("属性ID")
    @TableId(value = "id", type = IdType.AUTO)
    public Integer id;
    @ApiModelProperty("属性名称")
    private String name;
    @ApiModelProperty("商品ID")
    public Integer goodsId;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("更新时间")
    private Date updateTime;
    @ApiModelProperty("删除")
    public Integer deleted;
}
