package com.civen.civen_stumanager.service;

import com.civen.civen_stumanager.entity.GradeScale;
import com.civen.civen_stumanager.entity.StuCoGrade;
import com.civen.civen_stumanager.entity.StuCourse;
import com.civen.civen_stumanager.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> studentOverall();


    Student checkStudent(String sno);

    List<StuCourse> chechStuCourse(String sno);

    void updateStuCoGrade(StuCoGrade stuCoGrade);

    GradeScale gradeScale(String sdept);
}
