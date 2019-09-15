package com.sda.carsharing.dto;

import com.sda.carsharing.model.entities.Car;
import com.sda.carsharing.model.entities.Employee;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;
@Data
public class BranchesDto {


    @NotBlank
    private long id;
    private String name;

    private List<Car> cars;

    private List<Employee> employees;
    @NotBlank
    private String address;
    @NotBlank
    private String city;

}
