package com.civen.civen_stumanager.controller;

import com.civen.civen_stumanager.dto.StudentDto;
import com.civen.civen_stumanager.entity.Student;
import com.civen.civen_stumanager.result.Result;
import com.civen.civen_stumanager.service.StudentService;
import com.civen.civen_stumanager.util.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentService ss;

    @RequestMapping(value = "/getStudent", method = RequestMethod.GET)
    public Result<List<StudentDto>> get_Student() {

        List<Student> patients = ss.studentOverall();
        List<StudentDto> dtos = new ArrayList<>();
        for (Student p : patients) {
            dtos.add(Transfer.patientToDto(p));
        }
        return Result.success(dtos);
    }

    @RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
    public Result<Map<String, Object>> update_Student(@RequestBody Student student){
        Map<String, Object> map = new HashMap<>();

        ss.updateStudent(student);

        map.put("message","success!");
        return Result.success(map);
    }
}
