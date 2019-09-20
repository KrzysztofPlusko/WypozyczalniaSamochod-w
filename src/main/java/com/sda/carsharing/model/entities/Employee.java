package com.sda.carsharing.model.entities;

import com.sda.carsharing.model.enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Data
@Getter
@Setter
@Entity
@Table(name = "employees")

public class Employee extends BaseEntity {

    @NotBlank
    @Column(name = "first_name",  nullable = false)
    private String firstName;

    @NotBlank
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotBlank
    @Column
    private String login;

    @NotBlank
    @Column
    private String password;

    //@NotBlank
    @Column(name = "role", nullable = false)
    private Role role; //popraw na Enum

    //@NotBlank

    @ManyToOne
    private Branches branches;

}
