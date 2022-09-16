package com.emall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SiKun
 * @Description User
 * @date 2022/09/01/ 18:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ums_permissions实体类")
@TableName("ums_permissions")
public class Permissions implements Serializable {
    /**
     * 权限id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("权限id")
    private Integer id;

    /**
     * 权限名称
     */
    @ApiModelProperty("权限名称")
    private String name;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    /**
     * 软删除
     */
    @ApiModelProperty("是否删除")
    private Integer deleted;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}