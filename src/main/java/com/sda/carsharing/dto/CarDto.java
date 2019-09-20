package com.sda.carsharing.dto;

import com.sda.carsharing.model.entities.Branches;
import com.sda.carsharing.model.entities.CarModel;
import com.sda.carsharing.model.enums.Color;
import com.sda.carsharing.model.enums.Status;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CarDto {

    private Long id;

    private CarModel carModel;

    private Long carModelId;

    @NotBlank
    private String plateNumber;

    private Integer productionDate;

    private Color color;

    private Integer mileage;

    private Status status;

    private Branches branches;

    private Long branchId;

}
