package com.sda.carsharing.dto;

import com.sda.carsharing.model.enums.*;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Data
public class CarModelDto {

    @NotEmpty
    private CarClass carClass;

    @NotEmpty
    private String mark;

    @NotEmpty
    private String model;

    @NotEmpty
    private BodyType bodyType;

    @NotEmpty
    private int productionDate;

    @NotEmpty
    private Color color;

    @NotEmpty
    private Gear gear;

    @NotEmpty
    private Fuel fuel;

    @NotEmpty
    private boolean airCondition;

    @NotEmpty
    private BigDecimal price;
}
