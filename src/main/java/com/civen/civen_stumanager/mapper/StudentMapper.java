package com.civen.civen_stumanager.mapper;

import com.civen.civen_stumanager.entity.StuCoGrade;
import com.civen.civen_stumanager.entity.StuCourse;
import com.civen.civen_stumanager.entity.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> studentOverall();

    void updateStudent(Student student);

    Student checkStudent(String sno);

    void addStudent(Student student);

    List<StuCourse> chechStuCourse(String sno);

    void updateStuCoGrade(StuCoGrade stuCoGrade);
}
