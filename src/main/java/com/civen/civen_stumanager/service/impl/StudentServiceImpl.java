package com.civen.civen_stumanager.service.impl;

import com.civen.civen_stumanager.entity.StuCourse;
import com.civen.civen_stumanager.entity.Student;
import com.civen.civen_stumanager.mapper.StudentMapper;
import com.civen.civen_stumanager.service.StudentService;
import com.civen.civen_stumanager.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> studentOverall() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            return mapper.studentOverall();
        }
    }

    @Override
    public Student checkStudent(String sno) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            return mapper.checkStudent(sno);
        }
    }

    @Override
    public List<StuCourse> chechStuCourse(String sno) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            return mapper.chechStuCourse(sno);
        }
    }
}
