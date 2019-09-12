package com.sda.carsharing.mappers;

import com.sda.carsharing.dto.CarDto;
import com.sda.carsharing.model.entities.Car;

public class CarMapper {
    public static Car toEntity(CarDto carDto){
        Car car = new Car();
        car.setCarModel(carDto.getCarModel());
        car.setColor(carDto.getColor());
        car.setMileage(carDto.getMileage());
        car.setPlateNumber(carDto.getPlateNumber());
        car.setProductionDate(carDto.getProductionDate());
        car.setStatus(carDto.getStatus());
        return car;
    }
}
