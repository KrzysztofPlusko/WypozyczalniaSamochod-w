package com.sda.carsharing.web.controllers;

//<<<<<<< reservation

import com.sda.carsharing.dto.ReservationDto;
import com.sda.carsharing.model.entities.Reservation;
import com.sda.carsharing.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/admin/reservation")
public class ReservationController {
    private ReservationService reservationService;

    @Autowired

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    //wyswietl listę wszystkich rezerwacji
    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("reservation", reservationService.findAll());
        return "admin/reservation-list";
    }

    //widok dodania nowej rezerwacji
    @PostMapping(value = "add")
    public String addmodelView(Model model, @RequestParam(required = true) Long id) {
        model.addAttribute("reservationDto", new ReservationDto());
        return "/admin/reservation-form";
    }

    @PostMapping
    public String saveReservation(@Valid @ModelAttribute("reservationDto") ReservationDto reservationDto, Model model) {
        this.reservationService.addReservation(reservationDto);
        if (reservationDto.getId() == null) {
            model.addAttribute("msg", "rezerwacja dodana");
        } else {
            model.addAttribute("msg", "rezerwacja zaktualizowana");
        }
        model.addAttribute("rezerwacje", reservationService.findAll());
        return "/admin/reservation-list";

    }

    @PostMapping(value = "del")
    public String delReservation(@RequestParam(required = true)Long id, Model model){
        this.reservationService.deleteReservationById(id);
        model.addAttribute("msg", "rezerwacja usunieta");
        model.addAttribute("rezerwacje", reservationService.findAll());
        return "/admin/reservation-list";
    }
    @PostMapping(value = "edit")
    public String editReservation(@RequestParam(required = true)Long id, Model model){
        model.addAttribute("reservationDto",reservationService.findById(id));
        return "/admin/reservation-form";
    }
}
//=======
//public class ReservationController {
//}
//>>>>>>> master
