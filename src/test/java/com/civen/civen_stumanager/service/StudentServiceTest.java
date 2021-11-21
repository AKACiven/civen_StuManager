package com.civen.civen_stumanager.service;

import com.civen.civen_stumanager.entity.Student;
import com.civen.civen_stumanager.mapper.StudentMapper;
import com.civen.civen_stumanager.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class StudentServiceTest {

    @Test
    void updateStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        mapper.updateStudent(new Student("200215121", "万桑", "男", 21, "CSE"));

        sqlSession.commit();
        sqlSession.close();
    }
}
