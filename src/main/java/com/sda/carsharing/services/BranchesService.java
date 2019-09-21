package com.sda.carsharing.services;

import com.sda.carsharing.dto.BranchesDto;
import com.sda.carsharing.mappers.BranchesMapper;
import com.sda.carsharing.model.entities.Branches;
import com.sda.carsharing.model.repositories.BranchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BranchesService {
    private BranchesRepository branchesRepository;

    @Autowired

    public BranchesService(BranchesRepository branchesRepository) {
        this.branchesRepository = branchesRepository;
    }

    @Transactional
    public List<Branches> findAll() {
        return branchesRepository.findAll();
    }

    @Transactional
    public void addBranches(BranchesDto branchesDto) {
        branchesRepository.save(BranchesMapper.toEntity(branchesDto));
    }

    public void deleteBranchesById(Long id) {
        branchesRepository.deleteById(id);
    }

    public Branches findById(Long id) {
        return branchesRepository.findById(id).get();
    }


}
