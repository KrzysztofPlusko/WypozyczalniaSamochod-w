package com.sda.carsharing.model.entities;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@Getter @Setter

public class Reservation extends BaseEntity{

    @Column(name = "date_of_reservation")
    @NotNull
    private LocalDate dateOfReservation;

    @Column(name = "starting_date")
    @NotNull
    private LocalDate startingDate;

    @Column(name = "end_date")
    @NotNull
    private LocalDate endDate;

    @Column(name = "reservation_branch")
    @NotNull
    private Long reservationBranch;

    @Column(name = "return_branch")
    @NotNull
    private Long returnBranch;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "car_model", nullable = false)
    @NotNull
    private CarModel carModel;

    @ManyToOne
    @JoinColumn(name = "client", nullable = false)
    @NotNull
    private Client client;

    @Override
    public String toString() {
        return "Reservation{" +
                "dateOfReservation=" + dateOfReservation +
                ", startingDate=" + startingDate +
                ", endDate=" + endDate +
                ", reservationBranch=" + reservationBranch +
                ", returnBranch=" + returnBranch +
                ", price=" + price +
                ", carModel=" + carModel +
                ", client=" + client +
                "} " + super.toString();
    }



}
