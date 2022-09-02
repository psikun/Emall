package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.Role;
import com.emall.entity.User;
import com.emall.mapper.UserMapper;
import com.emall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Role> getRolesList(int id) {
        return userMapper.getRolesList(id);
    }

    @Override
    public User getUserByName(String username) {
        User user = userMapper.getUserByName(username);
        user.setRoles(userMapper.getRolesList(user.getId()));
        return user;
    }
}
