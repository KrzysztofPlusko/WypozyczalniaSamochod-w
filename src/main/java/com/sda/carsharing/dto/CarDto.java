package com.sda.carsharing.dto;

import com.sda.carsharing.model.entities.CarModel;
import com.sda.carsharing.model.enums.Color;
import com.sda.carsharing.model.enums.Status;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CarDto {

    private CarModel carModel;

    @NotBlank
    private String plateNumber;

    private Integer productionDate;

    private Color color;

    private Integer mileage;

    private Status status;
}
