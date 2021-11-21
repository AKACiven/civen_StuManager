package com.civen.civen_stumanager.service;

import com.civen.civen_stumanager.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> studentOverall();

    void updateStudent(Student student);

    Student checkStudent(String sno);
}
