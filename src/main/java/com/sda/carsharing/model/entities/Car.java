package com.sda.carsharing.model.entities;

import com.sda.carsharing.model.enums.Color;
import com.sda.carsharing.model.enums.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "cars")
@Getter @Setter
public class Car extends BaseEntity {

    @Column(name = "car_model_id")
    @NotBlank
    @ManyToOne
    @JoinColumn(name = "id")
    private CarModel carModel;

    @Column(name = "plate_number")
    @NotBlank
    private String plateNumber;

    @Column(name = "production_date")
    @NotBlank
    private Integer productionDate;

    @Column
    private Color color;

    @Column
    private Integer mileage;

    @Column
    private Status status;

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + plateNumber + '\'' +
                ", productionDate=" + productionDate +
                ", color=" + color +
                ", mileage=" + mileage +
                ", status=" + status +
                "} " + super.toString();
    }
}
