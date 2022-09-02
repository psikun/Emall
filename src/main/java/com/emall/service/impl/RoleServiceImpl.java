package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.Permissions;
import com.emall.entity.Role;
import com.emall.mapper.RoleMapper;
import com.emall.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Role service.
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{
    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Permissions> getPermissionsList(int id){
        return roleMapper.getPermissionsList(id);
    }


}



