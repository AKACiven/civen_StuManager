package com.civen.civen_stumanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private String cno;

    private String cname;

    private Integer ccredit;
}
