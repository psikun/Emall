package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.Role;
import com.emall.mapper.RoleMapper;
import com.emall.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * The type Role service.
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
        implements RoleService {

}
