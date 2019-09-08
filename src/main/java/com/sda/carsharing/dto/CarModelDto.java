package com.sda.carsharing.dto;

import com.sda.carsharing.model.enums.BodyType;
import com.sda.carsharing.model.enums.CarClass;
import com.sda.carsharing.model.enums.Fuel;
import com.sda.carsharing.model.enums.Gear;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class CarModelDto {

    private Long id;

    private CarClass carClass;

    @NotBlank
    private String mark;

    @NotBlank
    private String model;

    private BodyType bodyType;

    private Gear gear;

    private Fuel fuel;

    private boolean airCondition;

    private BigDecimal price;
}
