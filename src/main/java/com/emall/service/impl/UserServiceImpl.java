package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.User;
import com.emall.mapper.UserMapper;
import com.emall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Role service.
 *
 * @author SiKun
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {
    @Autowired
    UserMapper userMapper;

    public int insert(User user) {
        return userMapper.insert(user);
    }
}
