package com.sda.carsharing.model.repositories;

import com.sda.carsharing.model.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
