package com.sda.carsharing.mappers;


import com.sda.carsharing.dto.CarDto;
import com.sda.carsharing.dto.EmployeeDto;

import com.sda.carsharing.model.entities.Car;
import com.sda.carsharing.model.entities.Employee;

public class EmployeeMapper {
    public static Employee toEntity(EmployeeDto employeeDto){
    Employee employee = new Employee();
    employee.setId(employeeDto.getId());
    employee.setFirstName(employeeDto.getFirstName());
    employee.setLastName(employeeDto.getLastName());
    employee.setLogin(employeeDto.getLogin());
    employee.setRole(employeeDto.getRole());
    employee.setBranches(employeeDto.getBranches());
    return employee;
    }

    public static EmployeeDto toDto (Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setLogin(employee.getLogin());
        employeeDto.setRole(employee.getRole());
        employeeDto.setBranches(employee.getBranches());
        employeeDto.setBranchId(employee.getBranches().getId());
        return employeeDto;
    }


}


//    public static CarDto toDto(Car car){
//        CarDto carDto = new CarDto();
//        carDto.setId(car.getId());
//        carDto.setCarModel(car.getCarModel());
//        carDto.setCarModelId(car.getCarModel().getId());
//        carDto.setBranches(car.getBranches());
//        carDto.setBranchId(car.getBranches().getId());
//        carDto.setColor(car.getColor());
//        carDto.setMileage(car.getMileage());
//        carDto.setPlateNumber(car.getPlateNumber());
//        carDto.setProductionDate(car.getProductionDate());
//        carDto.setStatus(car.getStatus());
//        return carDto;
//    }


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