package com.sda.carsharing.model.entities;

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

    @NotBlank
    @Column(name = "position", updatable = false, nullable = false)
    private String position; //popraw na Enum

    @NotBlank
    @Column(name = "branch", updatable = false, nullable = false)
    private int branch;
}
