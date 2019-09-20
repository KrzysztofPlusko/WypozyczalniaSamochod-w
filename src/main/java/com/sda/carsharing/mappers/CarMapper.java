package com.sda.carsharing.mappers;

import com.sda.carsharing.dto.CarDto;
import com.sda.carsharing.model.entities.Car;

public class CarMapper {
    public static Car toEntity(CarDto carDto){
        Car car = new Car();
        car.setId(carDto.getId());
        car.setCarModel(carDto.getCarModel());
        car.setBranches(carDto.getBranches());
        car.setColor(carDto.getColor());
        car.setMileage(carDto.getMileage());
        car.setPlateNumber(carDto.getPlateNumber());
        car.setProductionDate(carDto.getProductionDate());
        car.setStatus(carDto.getStatus());
        return car;
    }

    public static CarDto toDto(Car car){
        CarDto carDto = new CarDto();
        carDto.setId(car.getId());
        carDto.setCarModel(car.getCarModel());
        carDto.setCarModelId(car.getCarModel().getId());
        carDto.setBranches(car.getBranches());
        carDto.setBranchId(car.getBranches().getId());
        carDto.setColor(car.getColor());
        carDto.setMileage(car.getMileage());
        carDto.setPlateNumber(car.getPlateNumber());
        carDto.setProductionDate(car.getProductionDate());
        carDto.setStatus(car.getStatus());
        return carDto;
    }
}
