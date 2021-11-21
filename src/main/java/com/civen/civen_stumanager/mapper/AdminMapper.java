package com.civen.civen_stumanager.mapper;

import com.civen.civen_stumanager.entity.Admin;

public interface AdminMapper {

    Admin getAdminByUsername(String username);
}
