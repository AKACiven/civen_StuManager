package com.civen.civen_stumanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private String Sno;

    private String Sname;

    private String Ssex;

    private int Sage;

    private String Sdept;
}
