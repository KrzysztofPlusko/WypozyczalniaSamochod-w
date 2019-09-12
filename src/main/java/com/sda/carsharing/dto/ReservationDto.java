package com.sda.carsharing.dto;

import com.sda.carsharing.model.entities.Car;

import com.sda.carsharing.model.entities.CarModel;
import com.sda.carsharing.model.entities.Client;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ReservationDto {

    @NotBlank
    private Long id;

    @NotBlank
    private LocalDate dateOfReservation;

    @NotBlank
    private LocalDate startingReservation;

    @NotBlank
    private LocalDate endDate;

    @NotBlank
    private Long reservationBranch;

    @NotBlank
    private Long returnBranch;

    @NotBlank
    private BigDecimal price;

    @NotBlank
    private Client client;

    @NotBlank
    private CarModel carModel;


}
