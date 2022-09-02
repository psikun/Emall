package com.emall.controller;

import cn.hutool.crypto.SecureUtil;
import com.emall.common.Result;
import com.emall.dto.AuthUser;
import com.emall.entity.User;
import com.emall.service.UserService;
import com.emall.utils.JwtTokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author SiKun
 * @Description LoginController
 * @date 2022/09/01/ 18:57
 */

@Slf4j
@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    UserService userService;
    @Autowired
    JwtTokenUtils jwtTokenUtils;

    @PostMapping("/login")
    public Result<String> login(@RequestBody AuthUser authUser) {
        String username = authUser.getUsername();
        String password = SecureUtil.md5(authUser.getPassword());

        User user = userService.getUserByName(username);
        if (user == null) {
            return Result.failed("用户名不存在！");
        }
        if (!Objects.equals(password, user.getPassword())) {
            return Result.failed("密码错误！");
        }
        String token = jwtTokenUtils.generateToken(user);
        log.info(username + "登陆成功");
        return Result.success("登陆成功！", token);
    }

    @GetMapping("/logout")
    public Result<String> logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return Result.success("退出成功");
    }

    @PostMapping("/register")
    public Result<String> register(@RequestBody AuthUser authUser) {
        String username = authUser.getUsername();
        String password = SecureUtil.md5(authUser.getPassword());
        if (userService.getUserByName(username) == null) {
            userService.insert(new User(username, password));
            return Result.success("");
        }
        return Result.failed("该用户已存在");
    }
}
