package com.civen.civen_stumanager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeScale {

    private Integer avggrade;

    private Integer highistgrade;

    private Integer lowistgrade;

    private double greatper;

    private Integer countLow;
}
