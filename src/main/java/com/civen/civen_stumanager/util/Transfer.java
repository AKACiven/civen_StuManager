package com.civen.civen_stumanager.util;

import com.civen.civen_stumanager.dto.StudentDto;
import com.civen.civen_stumanager.entity.Student;

public class Transfer {
    public static StudentDto patientToDto(Student student){
        return new StudentDto(student.getSno(), student.getSname(), student.getSsex(), student.getSage(), student.getSdept());
    }
}
