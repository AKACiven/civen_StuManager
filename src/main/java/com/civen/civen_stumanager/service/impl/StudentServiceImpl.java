package com.civen.civen_stumanager.service.impl;

import com.civen.civen_stumanager.entity.*;
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

    @Override
    public void updateStuCoGrade(StuCoGrade stuCoGrade) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            mapper.updateStuCoGrade(stuCoGrade);
            sqlSession.commit();
        }
    }

    @Override
    public GradeScale gradeScale(String sdept) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            return mapper.gradeScale(sdept);
        }
    }

    @Override
    public List<DeptGrades> deptofGrades(String sdept) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            return mapper.deptofGrades(sdept);
        }
    }

    @Override
    public List<CourseScale> coursescale() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            return mapper.coursescale();
        }
    }

    @Override
    public void addCourse(Course course) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            mapper.addCourse(course);
            sqlSession.commit();
        }
    }

    @Override
    public void updateCourse(Course course) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            mapper.updateCourse(course);
            sqlSession.commit();
        }
    }
}
