package com.emall.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author SiKun
 * @Description LoginUser
 * @date 2022/09/02/ 13:54
 */

@Data
@AllArgsConstructor
public class LoginRequest {
    private String username;
    private String password;
}
