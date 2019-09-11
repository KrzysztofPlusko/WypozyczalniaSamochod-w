package com.sda.carsharing.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
@Data
@Getter
@Setter
public class EmployeeDto {
    private int id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;


    @NotBlank
    private String position;

    @NotBlank
    private int branch;
}
