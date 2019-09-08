package com.sda.carsharing.model.repositories;

import com.sda.carsharing.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}