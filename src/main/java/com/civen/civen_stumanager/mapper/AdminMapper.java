package com.civen.civen_stumanager.mapper;

import com.civen.civen_stumanager.entity.Admin;

/**
 * @author EdwardXu
 * @description 管理员数据库操作对象
 */
public interface AdminMapper {
    /**
     * 通过用户名获取管理员
     * @param username
     * @return
     */
    Admin getAdminByUsername(String username);
}
