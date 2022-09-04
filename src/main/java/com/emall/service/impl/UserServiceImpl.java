package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.Permissions;
import com.emall.entity.Role;
import com.emall.entity.User;
import com.emall.mapper.RoleMapper;
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

    @Autowired
    RoleMapper roleMapper;

    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<Role> getRolesList(int id) {
        return userMapper.getRolesList(id);
    }

    @Override
    public User getUserByName(String username) {
        // 根据用户名获取user
        User user = userMapper.getUserByName(username);
        if (user != null) {
            // 设置用户角色
            user.setRoles(userMapper.getRolesList(user.getId()));
            for (Role role : user.getRoles()) {
                // 设置角色权限
                List<Permissions> permissionsList = roleMapper.getPermissionsList(role.getId());
                if (permissionsList != null) {
                    role.setPermission(permissionsList);
                }
            }
        }
        return user;
    }
}
