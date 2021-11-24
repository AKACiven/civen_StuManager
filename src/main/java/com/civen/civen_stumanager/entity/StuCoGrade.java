package com.civen.civen_stumanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StuCoGrade {

    private String sno;

    private String cno;

    private int grade;
}
