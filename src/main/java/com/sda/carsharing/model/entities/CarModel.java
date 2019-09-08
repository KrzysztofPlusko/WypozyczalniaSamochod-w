package com.sda.carsharing.model.entities;

import com.sda.carsharing.model.enums.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
@Table(name = "car_models")
@Getter @Setter
public class CarModel extends BaseEntity {

    @Column(name = "car_class")
    @NotBlank
    private CarClass carClass;

    @NotBlank
    private String mark;

    @NotBlank
    private String model;

    @Column(name = "body_type")
    @NotBlank
    private BodyType bodyType;

    @Column(name="production_date")
    @NotBlank
    private int productionDate;

    @NotBlank
    private Color color;

    @NotBlank
    private Gear gear;

    @NotBlank
    private Fuel fuel;

    @Column(name="air_condition")
    @NotBlank
    private boolean airCondition;

    @NotBlank
    private BigDecimal price;

    @Override
    public String toString() {
        return "CarModel{" +
                "carClass=" + carClass +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", bodyType=" + bodyType +
                ", productionDate=" + productionDate +
                ", color=" + color +
                ", gear=" + gear +
                ", fuel=" + fuel +
                ", airCondition=" + airCondition +
                ", price=" + price +
                "} " + super.toString();
    }
}
