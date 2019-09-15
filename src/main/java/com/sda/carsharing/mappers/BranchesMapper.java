package com.sda.carsharing.mappers;

import com.sda.carsharing.dto.BranchesDto;
import com.sda.carsharing.model.entities.Branches;

public class BranchesMapper {
    public static Branches toEntity(BranchesDto branchesDto){
        Branches branches = new Branches();
        branches.setName(branchesDto.getName());
        branches.setCars(branchesDto.getCars());
        branches.setAddress(branchesDto.getAddress());
        branches.setCity(branchesDto.getCity());
        branches.setEmployees(branchesDto.getEmployees());
        return branches;

    }
}
