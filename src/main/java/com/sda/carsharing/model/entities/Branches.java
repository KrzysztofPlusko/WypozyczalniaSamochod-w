package com.sda.carsharing.model.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Branches")

public class Branches extends BaseEntity{

    @Column(name = "cars")
    @NotBlank
    private Car car;

    @Column(name = "adress")
    @NotBlank
    private String Adress;

    @Column(name = "employees")
    @NotBlank
    private Employee employee;

}
