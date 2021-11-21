package com.civen.civen_stumanager.controller;

import com.civen.civen_stumanager.dto.StudentDto;
import com.civen.civen_stumanager.entity.Student;
import com.civen.civen_stumanager.mapper.StudentMapper;
import com.civen.civen_stumanager.result.Result;
import com.civen.civen_stumanager.service.StudentService;
import com.civen.civen_stumanager.util.MybatisUtils;
import com.civen.civen_stumanager.util.Transfer;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        mapper.updateStudent(new Student("200215121", "桑", "男", 21, "CSE"));
        mapper.updateStudent(new Student(student.getSno(), student.getSname(), student.getSsex(), student.getSage(), student.getSdept()));

//        System.out.println(student.getSno());
//        System.out.println(student.getSname());
//        System.out.println(student.getSsex());
//        System.out.println(student.getSage());
//        System.out.println(student.getSdept());
        sqlSession.commit();
        sqlSession.close();
        Map<String,Object> map = new HashMap<>();
        map.put("message","success!");
        return Result.success(map);
    }

    @RequestMapping(value = "/checkStudent", method = RequestMethod.GET)
    public Result<Map<String, Object>> check_Student(@RequestParam String sno) {

        Student student = ss.checkStudent(sno);
        Map<String,Object> map = new HashMap<>();
        map.put("message","success!");
        map.put("sno", student.getSno());
        map.put("sname", student.getSname());
        map.put("ssex", student.getSsex());
        map.put("sdept", student.getSdept());
        map.put("sage", student.getSage());
        return Result.success(map);
    }
}
