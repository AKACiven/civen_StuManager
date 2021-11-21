package com.civen.civen_stumanager.mapper;

import com.civen.civen_stumanager.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    List<Student> studentOverall();

    void updateStudent(Student student);

    Student checkStudent(String sno);
}
