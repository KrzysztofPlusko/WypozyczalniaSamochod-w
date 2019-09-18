package com.sda.carsharing.mappers;


import com.sda.carsharing.dto.EmployeeDto;

import com.sda.carsharing.model.entities.Employee;

public class EmployeeMapper {
    public static Employee toEntity(EmployeeDto employeeDto){
    Employee employee = new Employee();
    employee.setId(employeeDto.getId());
    employee.setFirstName(employeeDto.getFirstName());
    employee.setLastName(employeeDto.getLastName());
    employee.setRole(employeeDto.getRole());
    employee.setBranches(employeeDto.getBranch());
    return employee;
    }
}

//}
//    public static CarModel toEntity(CarModelDto carModelDto){
//        CarModel carModel = new CarModel();
//        carModel.setCarClass(carModelDto.getCarClass());
//        carModel.setMark(carModelDto.getMark());
//        carModel.setModel(carModelDto.getModel());
//        carModel.setBodyType(carModelDto.getBodyType());
//        carModel.setGear(carModelDto.getGear());
//        carModel.setFuel(carModelDto.getFuel());
//        carModel.setAirCondition(carModelDto.isAirCondition());
//        carModel.setPrice(carModelDto.getPrice());
//        return carModel;