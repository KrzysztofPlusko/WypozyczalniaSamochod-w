package com.sda.carsharing.services;

import com.sda.carsharing.dto.ReservationDto;
import com.sda.carsharing.mappers.ReservationMapper;

import com.sda.carsharing.model.entities.Reservation;
import com.sda.carsharing.model.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReservationService {
    private ReservationRepository reservationRepository;

    @Autowired

    public ReservationService(ReservationRepository reservationRepository) { this.reservationRepository = reservationRepository; }

    @Transactional
    public List<Reservation> findAll(){return reservationRepository.findAll();
    }

    @Transactional
    public void addReservation(ReservationDto reservationDto){reservationRepository.save(ReservationMapper.toEntity(reservationDto));}
    public void deleteReservationById(Long id) { reservationRepository.deleteById(id); }
    public Reservation findById(Long id) {
        return reservationRepository.findById(id).get();
    }



}
