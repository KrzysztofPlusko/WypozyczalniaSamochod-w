package com.sda.carsharing.services;


import com.sda.carsharing.model.entities.Employee;
import com.sda.carsharing.model.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;
@Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }




}
