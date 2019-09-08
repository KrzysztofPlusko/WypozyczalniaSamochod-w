package com.sda.carsharing.model.entities;

import com.sda.carsharing.model.enums.*;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "car_models")
@Getter @Setter
public class CarModel {
    @Id
    private int id;
    private CarClass carClass;
    private String mark;
    private String model;
    private BodyType bodyType;
    private int productionDate;
    private Color color;
    private Gear gear;
    private Fuel fule;
    private boolean airCondition;
    private BigDecimal price;

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", carClass=" + carClass +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", bodyType=" + bodyType +
                ", productionDate=" + productionDate +
                ", color=" + color +
                ", gear=" + gear +
                ", fule=" + fule +
                ", airCondition=" + airCondition +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel = (CarModel) o;
        return id == carModel.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}