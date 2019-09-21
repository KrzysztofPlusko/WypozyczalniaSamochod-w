package com.sda.carsharing.dto;

//<<<<<<< reservation
import com.sda.carsharing.model.entities.Car;

import com.sda.carsharing.model.entities.CarModel;
import com.sda.carsharing.model.entities.Client;
//=======
//>>>>>>> master
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ReservationDto {


    private Long id;


    private LocalDate dateOfReservation;


    private LocalDate startingDate;


    private LocalDate endDate;


    private Long reservationBranch;


    private Long returnBranch;


    private BigDecimal price;

    
//<<<<<<< reservation

  private Client client;


    private Long carModel;


//=======
    //private Long clientId;

   // @NotBlank
   // private Long carId;
//>>>>>>> master


}
