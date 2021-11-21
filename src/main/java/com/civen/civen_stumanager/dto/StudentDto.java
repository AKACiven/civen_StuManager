package com.civen.civen_stumanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private String sno;

    private String sname;

    private String ssex;

    private int sage;

    private String sdept;
}
