package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Attribute;
import com.emall.entity.Role;
import com.emall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author SiKun
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取角色集合
     *
     * @param id
     * @return
     */
    List<Role> getRolesList(@PathVariable("id") int id);
    User getUserByName(@PathVariable("username") String username);
}
