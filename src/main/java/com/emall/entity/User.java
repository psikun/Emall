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
import java.util.List;

/**
 * @author SiKun
 * @Description User
 * @date 2022/09/01/ 18:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ums_user实体类")
@TableName("ums_user")
public class User {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户名称")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("删除")
    private Integer deleted;

    @ApiModelProperty("用户拥有多种角色")
    private List<Role> roles;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
