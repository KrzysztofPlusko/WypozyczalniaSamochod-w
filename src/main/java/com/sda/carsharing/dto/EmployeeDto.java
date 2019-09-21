package com.sda.carsharing.dto;

import com.sda.carsharing.model.entities.Branches;
import com.sda.carsharing.model.enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
@Data
@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private Long branchId;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String login;


    private String password;

    //@NotBlank
    private Role role;

    //@NotBlank
    private Branches branches;

}
