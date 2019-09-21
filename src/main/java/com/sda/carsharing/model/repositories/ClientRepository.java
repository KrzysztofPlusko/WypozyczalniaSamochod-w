package com.sda.carsharing.model.repositories;

import com.sda.carsharing.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {
    @Query("SELECT c FROM Client c WHERE c.email = ?1")
    List<Client> FindAllByUsername(String email);

    Client findByEmail(String email);
}
