package com.sda.carsharing.model.repositories;

import com.sda.carsharing.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long > {
}
