package com.sda.carsharing.model.entities;

import com.sda.carsharing.model.enums.BodyType;
import com.sda.carsharing.model.enums.CarClass;
import com.sda.carsharing.model.enums.Fuel;
import com.sda.carsharing.model.enums.Gear;
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
    private CarClass carClass;

    @NotBlank
    private String mark;

    @NotBlank
    private String model;

    @Column(name = "body_type")
    private BodyType bodyType;

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
                ", gear=" + gear +
                ", fuel=" + fuel +
                ", airCondition=" + airCondition +
                ", price=" + price +
                "} " + super.toString();
    }
}
