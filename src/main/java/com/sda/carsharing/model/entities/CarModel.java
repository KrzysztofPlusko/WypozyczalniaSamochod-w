package com.sda.carsharing.model.entities;

import com.sda.carsharing.model.enums.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "car_models")
@Getter
@Setter
public class CarModel extends BaseEntity {

    @Column(name = "car_class")
    private CarClass carClass;

    private String mark;

    private String model;

    @Column(name = "body_type")
    private BodyType bodyType;

    @Column(name="production_date")
    private int productionDate;

    private Color color;

    private Gear gear;

    private Fuel fuel;

    @Column(name="air_condition")
    private boolean airCondition;

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
