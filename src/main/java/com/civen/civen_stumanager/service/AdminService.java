package com.civen.civen_stumanager.service;

import com.civen.civen_stumanager.entity.Admin;

public interface AdminService {

    Admin getAdminByUsername(String username);
}
