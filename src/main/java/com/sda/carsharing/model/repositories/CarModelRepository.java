package com.sda.carsharing.model.repositories;

import com.sda.carsharing.model.entities.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarModelRepository extends JpaRepository<CarModel, Long> {
    @Override
    @Query("SELECT c FROM CarModel c WHERE c.isDeleted = false")
    List<CarModel> findAll();

    @Modifying
    @Query("UPDATE CarModel c SET c.isDeleted = true where c.id = ?1")
    void hideById(Long id);
}
