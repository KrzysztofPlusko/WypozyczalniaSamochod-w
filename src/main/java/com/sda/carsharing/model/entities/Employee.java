package com.sda.carsharing.model.entities;

import com.sda.carsharing.model.enums.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
@Table(name = "employess")

public class Employee extends BaseEntity {

    @NotBlank
    @Column(name = "first_name", updatable = false, nullable = false)
    private String firstName;

    @NotBlank
    @Column(name = "last_name", updatable = false, nullable = false)
    private String lastName;

    //@NotBlank
    @Column(name = "role", updatable = false, nullable = false)
    private Role role; //popraw na Enum

    @NotBlank
    @Column(name = "branch", updatable = false, nullable = false)
    private int branch;
}
