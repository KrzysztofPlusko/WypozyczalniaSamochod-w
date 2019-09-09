package com.sda.carsharing.services;

import com.sda.carsharing.model.entities.Car;
import com.sda.carsharing.model.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Transactional
    public List<Car> findAll(){
        return carRepository.findAll();
    }
}
