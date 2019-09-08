package com.sda.carsharing.services;

import com.sda.carsharing.dto.CarModelDto;
import com.sda.carsharing.mappers.CarModelMapper;
import com.sda.carsharing.model.entities.CarModel;
import com.sda.carsharing.model.repositories.CarModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarModelService {
    private CarModelRepository carModelRepository;

    @Autowired
    public CarModelService(CarModelRepository carModelRepository) {
        this.carModelRepository = carModelRepository;
    }

    @Transactional
    public List<CarModel> findAll(){
        return carModelRepository.findAll();
    }

    @Transactional
    public void addCarModel(CarModelDto carModelDto){
        carModelRepository.save(CarModelMapper.toEntity(carModelDto));
    }
}
