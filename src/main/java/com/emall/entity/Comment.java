package com.emall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author GJ
 * @Description Comment
 * @date 2022/09/02/ 15:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="pms_comment实体类")
@TableName("pms_comment")
public class Comment {
   @ApiModelProperty("评论id")
    @TableId(value = "id",type= IdType.AUTO)
    private Integer id;

   @ApiModelProperty("商品id")
    private  Integer goodsId;

   @ApiModelProperty("评论")
    private  String comment;

   @ApiModelProperty("会员id")
    private  Integer userId;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    @ApiModelProperty("删除")
    private Integer deleted;


}
