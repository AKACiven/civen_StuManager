package com.civen.civen_stumanager.mapper;

import com.civen.civen_stumanager.entity.*;

import java.util.List;

public interface StudentMapper {

    List<Student> studentOverall();

    void updateStudent(Student student);

    Student checkStudent(String sno);

    void addStudent(Student student);

    List<StuCourse> chechStuCourse(String sno);

    void updateStuCoGrade(StuCoGrade stuCoGrade);

    GradeScale gradeScale(String sdept);

    List<DeptGrades> deptofGrades(String sdept);

    List<CourseScale> coursescale();

    void addCourse(Course course);

    void updateCourse(Course course);
}
