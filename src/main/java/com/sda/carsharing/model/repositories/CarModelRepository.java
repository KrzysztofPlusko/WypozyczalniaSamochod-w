package com.sda.carsharing.model.repositories;

import com.sda.carsharing.model.entities.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarModelRepository extends JpaRepository<CarModel, Long> {
}
