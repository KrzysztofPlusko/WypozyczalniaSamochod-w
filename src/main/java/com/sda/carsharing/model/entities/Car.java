package com.sda.carsharing.model.entities;

import com.sda.carsharing.model.enums.Color;
import com.sda.carsharing.model.enums.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cars")
@Getter @Setter
public class Car extends BaseEntity {


    @NotNull
    @ManyToOne
    private CarModel carModel;

    @Column(name = "plate_number")
    @NotBlank
    private String plateNumber;

    @Column(name = "production_date")
    private Integer productionDate;

    @Column
    private Color color;

    @Column
    private Integer mileage;

    @Column
    private Status status;

    //@Column
    //private Branches branches;

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
