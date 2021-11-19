package com.civen.civen_stumanager.controller;

import com.civen.civen_stumanager.dto.StudentDto;
import com.civen.civen_stumanager.entity.Student;
import com.civen.civen_stumanager.result.Result;
import com.civen.civen_stumanager.service.StudentService;
import com.civen.civen_stumanager.util.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService ps;

    @RequestMapping(value = "/getStudent", method = RequestMethod.GET)
    public Result<List<StudentDto>> getPatients() {

        List<Student> patients = ps.studentOverall();
        List<StudentDto> dtos = new ArrayList<>();
        for (Student p : patients) {
            dtos.add(Transfer.patientToDto(p));
        }
        return Result.success(dtos);
    }
}
