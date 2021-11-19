package com.civen.civen_stumanager.service;

import com.civen.civen_stumanager.entity.Admin;

/**
 * 管理员的service层
 */
public interface AdminService {
    /**
     * 根据用户名获得密码
     * @param username
     * @return
     */
    Admin getAdminByUsername(String username);
}
