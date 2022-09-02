package com.emall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.emall.entity.Permissions;
import com.emall.entity.Role;

import java.util.List;


/**
 * @author SiKun
 */
public interface RoleService extends IService<Role> {

    List<Permissions> getPermissionsList(int id);

}
