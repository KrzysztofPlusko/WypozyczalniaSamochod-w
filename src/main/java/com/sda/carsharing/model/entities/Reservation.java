package com.sda.carsharing.model.entities;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@Getter @Setter

public class Reservation extends BaseEntity{

    @Column(name = "date_of_reservation")
    @NotBlank
    private LocalDate dateOfReservation;

    @Column(name = "starting_date")
    @NotBlank
    private LocalDate startingDate;

    @Column(name = "end_date")
    @NotBlank
    private LocalDate endDate;

    @Column(name = "reservation_branch")
    @NotBlank
    private Long reservationBranch;

    @Column(name = "return_branch")
    @NotBlank
    private Long returnBranch;

    @NotBlank
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "car_model", nullable = false)
    @NotBlank
    private CarModel carModel;

    @ManyToOne
    @JoinColumn(name = "client", nullable = false)
    @NotBlank
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
