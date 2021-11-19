package com.civen.civen_stumanager.mapper;

import com.civen.civen_stumanager.entity.Admin;

public interface AdminMapper {
    /**
     * 通过用户名获取管理员
     */
    Admin getAdminByUsername(String username);
}
