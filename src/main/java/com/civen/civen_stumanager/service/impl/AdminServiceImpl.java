package com.civen.civen_stumanager.service.impl;

import com.civen.civen_stumanager.entity.Admin;
import com.civen.civen_stumanager.mapper.AdminMapper;
import com.civen.civen_stumanager.service.AdminService;
import com.civen.civen_stumanager.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

/**
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Override
    public Admin getAdminByUsername(String username) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
            return mapper.getAdminByUsername(username);
        }
    }
}
