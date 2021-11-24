package com.civen.civen_stumanager.util;

import com.civen.civen_stumanager.dto.StudentDto;
import com.civen.civen_stumanager.entity.StuCourse;
import com.civen.civen_stumanager.entity.Student;

public class Transfer {
    public static StudentDto sudentToDto(Student student){
        return new StudentDto(student.getSno(), student.getSname(), student.getSsex(), student.getSage(), student.getSdept());
    }

    public static StuCourse stuCourse(StuCourse scourse){
        return new StuCourse(scourse.getCno(),scourse.getCname(), scourse.getGrade());
    }
}
