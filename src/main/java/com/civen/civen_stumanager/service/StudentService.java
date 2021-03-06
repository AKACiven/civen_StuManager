package com.civen.civen_stumanager.service;

import com.civen.civen_stumanager.entity.*;

import java.util.List;

public interface StudentService {

    List<Student> studentOverall();


    Student checkStudent(String sno);

    List<StuCourse> chechStuCourse(String sno);

    void updateStuCoGrade(StuCoGrade stuCoGrade);

    GradeScale gradeScale(String sdept);

    List<DeptGrades> deptofGrades(String sdept);

    List<CourseScale> coursescale();

    void addCourse(Course course);

    void updateCourse(Course course);

    void squeezeCourse();

    List<InCourse> checkInCourse(String cno);

    List<OutCourse> checkOutCourse(String cno);

    void addStuToCo(AddStuToCo addStuToCo);
}
