package com.sda.carsharing.mappers;

import com.sda.carsharing.dto.CarModelDto;
import com.sda.carsharing.model.entities.CarModel;

public class CarModelMapper {
    public static CarModel toEntity(CarModelDto carModelDto){
        CarModel carModel = new CarModel();
        carModel.setId(carModelDto.getId());
        carModel.setCarClass(carModelDto.getCarClass());
        carModel.setMark(carModelDto.getMark());
        carModel.setModel(carModelDto.getModel());
        carModel.setBodyType(carModelDto.getBodyType());
        carModel.setGear(carModelDto.getGear());
        carModel.setFuel(carModelDto.getFuel());
        carModel.setAirCondition(carModelDto.isAirCondition());
        carModel.setPrice(carModelDto.getPrice());
        return carModel;
    }
}
