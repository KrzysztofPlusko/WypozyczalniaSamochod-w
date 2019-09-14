package com.sda.carsharing.model.repositories;

import com.sda.carsharing.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {

    List<Client> FindAllByUsername(String email);
}
