package com.emall.auth;

import com.emall.entity.Permissions;
import com.emall.entity.Role;
import com.emall.entity.User;
import com.emall.service.RoleService;
import com.emall.service.UserService;
import com.emall.utils.JwtTokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author SiKun
 * @Description ShiroRealm
 * @date 2022/09/01/ 20:48
 */
@Slf4j
public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private JwtTokenUtils jwtTokenUtils;


    @Override
    public boolean supports(AuthenticationToken token) {
        //这个token就是从过滤器中传入的jwtToken
        return token instanceof ShiroAuthToken;
    }


    /**
     * 权限配置类
     * 只有当需要检测用户权限的时候才会调用此方法，例如@RequiresRoles,@RequiresPermissions之类的
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 进入到这里，用户已经通过验证
        // 获取登录用户名
        String token = principalCollection.toString();
        String username = jwtTokenUtils.getUserNameFromToken(token);
        // 查询用户
        User user = userService.getUserByName(username);
        // 获取角色
        user.setRoles(userService.getRolesList(user.getId()));
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        for (Role role : user.getRoles()) {
            // 添加角色
            simpleAuthorizationInfo.addRole(role.getName());
            // 获取角色对应权限
            role.setPermission(roleService.getPermissionsList(role.getId()));
            // 添加权限
            for (Permissions permission : role.getPermission()) {
                simpleAuthorizationInfo.addStringPermission(permission.getName());
            }
        }
        return simpleAuthorizationInfo;
    }

    /**
     * 认证配置类,进行用户认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 封装token
        ShiroAuthToken shiroAuthToken = (ShiroAuthToken) authenticationToken;
        // 获取token
        String token = (String) shiroAuthToken.getCredentials();
        // 验证token
        String username = jwtTokenUtils.getUserNameFromToken(token);

        // 验证用户信息
        if (username != null) {
            // 获取用户信息
            User user = userService.getUserByName(username);
        }
        //验证authenticationToken和simpleAuthenticationInfo的信息
        SimpleAuthenticationInfo simpleAuthenticationInfo = null;
        try {
            simpleAuthenticationInfo = new SimpleAuthenticationInfo(token, token, getName());
        } catch (Exception e) {
        }
        return simpleAuthenticationInfo;
    }

}
