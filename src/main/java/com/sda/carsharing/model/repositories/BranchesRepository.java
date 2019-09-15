package com.sda.carsharing.model.repositories;

import com.sda.carsharing.model.entities.Branches;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchesRepository extends JpaRepository<Branches, Long> {
}
