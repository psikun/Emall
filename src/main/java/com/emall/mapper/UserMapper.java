package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Attribute;
import com.emall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author SiKun
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
