package com.emall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.emall.entity.Brand;
import com.emall.entity.User;

/**
 * @author SiKun
 * @Description BrandService
 * @date 2022/09/01/ 10:59
 */


public interface UserService extends IService<User> {
    int insert(User user);
}
