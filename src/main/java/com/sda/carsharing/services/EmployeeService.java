package com.sda.carsharing.services;



import com.sda.carsharing.dto.EmployeeDto;

import com.sda.carsharing.mappers.EmployeeMapper;

import com.sda.carsharing.model.entities.Employee;
import com.sda.carsharing.model.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Transactional
    public void addEmployee(EmployeeDto employeeDto) {
        employeeRepository.save(EmployeeMapper.toEntity(employeeDto));
    }
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

}