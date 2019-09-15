package com.sda.carsharing.mappers;

import com.sda.carsharing.dto.BranchesDto;
import com.sda.carsharing.model.entities.Branches;

public class BranchesMapper {
    public static Branches toEntity(BranchesDto branchesDto){
        Branches branches = new Branches();
        branches.setCars(branchesDto.getCars());
        branches.setAdress(branchesDto.getAdress());
        branches.setEmployees(branchesDto.getEmployees());
        return branches;

    }
}
