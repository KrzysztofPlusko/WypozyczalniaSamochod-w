package com.sda.carsharing.model.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "Branches")
@Setter @Getter
public class Branches extends BaseEntity{
    private String name;
    @OneToMany
    @Column(name = "cars")
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
