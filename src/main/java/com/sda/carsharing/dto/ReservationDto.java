package com.sda.carsharing.dto;

//<<<<<<< reservation

import com.sda.carsharing.model.entities.Car;

import com.sda.carsharing.model.entities.CarModel;
import com.sda.carsharing.model.entities.Client;
//=======
//>>>>>>> master
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ReservationDto {


    private Long id;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfReservation;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startingDate;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;


    private Long reservationBranch;


    private Long returnBranch;


    private BigDecimal price;


//<<<<<<< reservation

    private Client client;


    private CarModel carModel;
    private String carModelId;


//=======
    //private Long clientId;

    // @NotBlank
    // private Long carId;
//>>>>>>> master


}
