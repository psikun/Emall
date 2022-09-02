package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Permissions;
import com.emall.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
* @Entity com.emall.entity.Role
*/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 获取权限集合
     * @param id
     * @return
     */
    List<Permissions> getPermissionsList(int id);
}
