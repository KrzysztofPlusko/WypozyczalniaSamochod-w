package com.sda.carsharing.model.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "Branches")
@Setter @Getter
public class Branches extends BaseEntity{
    private String name;
    @Column(name = "cars")
    @NotBlank
    private List<Car> cars;

    @Column(name = "adress")
    @NotBlank
    private String Adress;

    @Column(name = "employees")
    @NotBlank
    private List<Employee> employees;

}
