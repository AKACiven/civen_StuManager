package com.civen.civen_stumanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String Sno;

    private String Sname;

    private String Ssex;

    private int Sage;

    private String Sdept;
}
