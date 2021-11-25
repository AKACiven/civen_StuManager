package com.civen.civen_stumanager.controller;

import com.civen.civen_stumanager.dto.StudentDto;
import com.civen.civen_stumanager.entity.*;
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
            dtos.add(Transfer.sudentToDto(p));
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
//        map.put("message","success!");
        map.put("sno", student.getSno());
        map.put("sname", student.getSname());
        map.put("ssex", student.getSsex());
        map.put("sdept", student.getSdept());
        map.put("sage", student.getSage());
        return Result.success(map);
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public Result<Map<String, Object>> add_Student(@RequestBody Student student){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        mapper.addStudent(new Student(student.getSno(), student.getSname(), student.getSsex(), student.getSage(), student.getSdept()));

        sqlSession.commit();
        sqlSession.close();
        Map<String,Object> map = new HashMap<>();
        map.put("message","success!");
        return Result.success(map);
    }

    @RequestMapping(value = "/checkStuCourse", method = RequestMethod.GET)
    public Result<List<StuCourse>> check_StuCourse(@RequestParam String sno) {

        List<StuCourse> stuCourse = ss.chechStuCourse(sno);
        List<StuCourse> dtos = new ArrayList<>();
        for (StuCourse p : stuCourse) {
            dtos.add(Transfer.stuCourse(p));
        }
        return Result.success(dtos);
    }

    @RequestMapping(value = "/editGrade", method = RequestMethod.GET)
    public Result<Map<String, Object>> update_StuCoGrade(@RequestParam String sno, String cno, int grade) {
        Map<String,Object> map = new HashMap<>();

        ss.updateStuCoGrade(new StuCoGrade(sno, cno, grade));

        map.put("message","success!");
        return Result.success(map);

    }

    @RequestMapping(value = "/gradeScale", method = RequestMethod.GET)
    public Result<GradeScale> grade_Scale(@RequestParam String sdept) {
        GradeScale gradeScale = ss.gradeScale(sdept);
        return Result.success(gradeScale);
    }

    @RequestMapping(value = "/deptGrades", method = RequestMethod.GET)
    public Result<List<DeptGrades>> dept_Grades(@RequestParam String sdept) {
        List<DeptGrades> deptGrades = ss.deptofGrades(sdept);
        return Result.success(deptGrades);
    }

    @RequestMapping(value = "/courseScale", method = RequestMethod.GET)
    public Result<List<CourseScale>> course_Scale() {
        List<CourseScale> courseScales = ss.coursescale();
        return Result.success(courseScales);
    }

    @RequestMapping(value = "/addCourse", method = RequestMethod.POST)
    public Result<Map<String, Object>> update_StuCoGrade(@RequestBody Course course) {
        Map<String,Object> map = new HashMap<>();

        ss.addCourse(new Course(course.getCno(), course.getCname(), course.getCcredit()));

        map.put("message","success!");
        return Result.success(map);

    }

    @RequestMapping(value = "/updateCourse", method = RequestMethod.GET)
    public Result<Map<String, Object>> update_Course(@RequestParam String cno, Integer ccredit, String cname) {
        ss.updateCourse(new Course(cno, cname, ccredit));
        Map<String,Object> map = new HashMap<>();
        map.put("message","success!");
        return Result.success(map);
    }
}
