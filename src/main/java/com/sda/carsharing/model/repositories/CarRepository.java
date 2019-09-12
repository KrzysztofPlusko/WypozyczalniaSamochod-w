package com.sda.carsharing.model.repositories;

import com.sda.carsharing.model.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
