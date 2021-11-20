package com.civen.civen_stumanager.mapper;

import com.civen.civen_stumanager.entity.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> studentOverall();

    void updateStudent(Student student);
}
