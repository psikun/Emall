package com.emall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Lison
 * @Description Status
 * @date 2022/09/02/ 13:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "oms_status实体类")
@TableName("oms_status")
public class Status {
    @ApiParam("订单状态id")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiParam("订单状态")
    private String status;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("删除")
    private Integer deleted;

}
