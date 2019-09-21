package com.sda.carsharing.model.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "branches")
@Setter
@Getter
public class Branches extends BaseEntity {

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "branches")
    private List<Car> cars;

    @Column(name = "address")
    @NotBlank
    private String address;
    @NotBlank
    private String city;
    @OneToMany
    @Column(name = "employees")
    private List<Employee> employees;

}
