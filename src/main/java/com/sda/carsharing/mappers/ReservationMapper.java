package com.sda.carsharing.mappers;

import com.sda.carsharing.dto.ReservationDto;
import com.sda.carsharing.model.entities.Reservation;
public class ReservationMapper {
   public static Reservation toEntity(ReservationDto reservationDto){
       Reservation reservation = new Reservation();
//<<<<<<< reservation
       reservation.setCarModel(reservationDto.getCarModel());
       reservation.setClient(reservationDto.getClient());
//=======
      // reservation.setCarId(reservationDto.getCarId());
       //reservation.setClientId(reservationDto.getClientId());
//>>>>>>> master
       reservation.setDateOfReservation(reservationDto.getDateOfReservation());
       reservation.setStartingDate(reservationDto.getStartingDate());
       reservation.setEndDate(reservationDto.getEndDate());
       reservation.setPrice(reservationDto.getPrice());
       reservation.setReservationBranch(reservationDto.getReservationBranch());
       reservation.setReturnBranch(reservationDto.getReturnBranch());
       return reservation;
   }
}
