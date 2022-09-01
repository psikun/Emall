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
 * @author SiKun
 * @Description Brand
 * @date 2022/09/01/ 10:41
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "pms_brand实体类")
@TableName("pms_brand")
public class Brand {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("品牌ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("品牌名称")
    private String name;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("删除")
    private Integer deleted;
}
