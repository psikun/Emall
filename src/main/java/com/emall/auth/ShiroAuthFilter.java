package com.emall.auth;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.emall.common.Result;
import com.emall.utils.JwtTokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author SiKun
 * @Description ShiroAuthFilter
 * @date 2022/09/02/ 15:27
 */

@Slf4j
@Component
public class ShiroAuthFilter extends BasicHttpAuthenticationFilter {

    private static final String TOKEN_HEAD = "Authorization";

    @Autowired
    JwtTokenUtils jwtTokenUtils;

    /**
     * 1. 返回true，shiro就直接允许访问url
     * 2. 返回false，shiro才会根据onAccessDenied的方法的返回值决定是否允许访问url
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        return false;
    }

    /**
     * 返回结果为true表明登录通过
     */
    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        // 请求时需要在Header中存放一个Authorization，值就是对应的Token
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        try {
            String jwt = request.getHeader(TOKEN_HEAD);
            ShiroAuthToken shiroToken = new ShiroAuthToken(jwt);
            // 委托 realm 进行登录认证，调用ShiroRealm进行的认证,即subject.login(token)
            getSubject(servletRequest, servletResponse).login(shiroToken);
        } catch (Exception e) {
            onLoginFail(servletResponse);
            //调用下面的方法向客户端返回错误信息
            return false;
        }
        return true;
        //执行方法中没有抛出异常就表示登录成功
    }

    /**
     * 登录失败时默认返回 401 状态码
     */
    private void onLoginFail(ServletResponse response) throws IOException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        JSONObject json = JSONUtil.parseObj(Result.unauthorized(), false);
        httpResponse.setCharacterEncoding("utf-8");
        httpResponse.getWriter().write(json.toString());
    }
}
