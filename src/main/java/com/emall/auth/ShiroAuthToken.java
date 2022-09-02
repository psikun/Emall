package com.emall.auth;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.realm.AuthorizingRealm;

/**
 * @author SiKun
 * @Description ShiroAuthToken
 * @date 2022/09/02/ 14:19
 */

public class ShiroAuthToken implements AuthenticationToken {

    private String token;

    public ShiroAuthToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
