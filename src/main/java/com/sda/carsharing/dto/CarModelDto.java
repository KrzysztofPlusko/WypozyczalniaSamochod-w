package com.sda.carsharing.dto;

import com.sda.carsharing.model.enums.*;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class CarModelDto {

    @NotBlank
    private Long id;

    @NotBlank
    private CarClass carClass;

    @NotBlank
    private String mark;

    @NotBlank
    private String model;

    @NotBlank
    private BodyType bodyType;

    @NotBlank
    private int productionDate;

    @NotBlank
    private Color color;

    @NotBlank
    private Gear gear;

    @NotBlank
    private Fuel fuel;

    @NotBlank
    private boolean airCondition;

    @NotBlank
    private BigDecimal price;
}
