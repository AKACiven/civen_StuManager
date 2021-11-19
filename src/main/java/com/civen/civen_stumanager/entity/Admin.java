package com.civen.civen_stumanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
