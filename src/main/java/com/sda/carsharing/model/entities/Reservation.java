package com.sda.carsharing.model.entities;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@Getter @Setter

public class Reservation extends BaseEntity{

    @Column(name = "date_of_reservation")
    private LocalDate dateOfReservation;
    @Column(name = "starting_date")
    private LocalDate startingDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "reservation_branch")
    private LocalDate reservationBranch;
    @Column(name = "return_branch")
    private LocalDate returnBranch;
    private double price;
    @OneToOne
    @JoinColumn(name = "car_id", nullable = false)
    @NonNull
    private int carId;
    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    @NonNull
    private int clientId;
    @Override
    public String toString() {
        return "Reservation{" +
                "dateOfReservation=" + dateOfReservation +
                ", startingDate=" + startingDate +
                ", endDate=" + endDate +
                ", reservationBranch=" + reservationBranch +
                ", returnBranch=" + returnBranch +
                ", price=" + price +
                ", carId=" + carId +
                ", clientId=" + clientId +
                "} " + super.toString();
    }



}
