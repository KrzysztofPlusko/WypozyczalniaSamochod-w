package com.sda.carsharing.web.controllers;


import com.sda.carsharing.dto.BranchesDto;
import com.sda.carsharing.dto.ReservationDto;
import com.sda.carsharing.services.BranchesService;
import com.sda.carsharing.services.CarModelService;
import com.sda.carsharing.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/reservation")
public class ReservationController {
    private ReservationService reservationService;
    private BranchesService branchesService;
    private CarModelService carModelService;
    @Autowired

    public ReservationController(ReservationService reservationService, BranchesService branchesService, CarModelService carModelService) {
        this.reservationService = reservationService;
        this.branchesService = branchesService;
        this.carModelService = carModelService;

    }

    //wyswietl listę wszystkich rezerwacji
    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("reservation", reservationService.findAll());
        return "admin/reservation-list";
    }

    //widok dodania nowej rezerwacji
    @GetMapping("/add")
    public String addmodelView(Model model) {
        model.addAttribute("reservationDto", new ReservationDto());
        model.addAttribute("branches", branchesService.findAll());
        model.addAttribute("carModel",carModelService.findAll());
        return "reservation-form";
    }


    @PostMapping
    public String addReservation(Model model, @Valid @ModelAttribute("reservationDto") ReservationDto reservationDto) {
        reservationDto.setCarModel(carModelService.findById(reservationDto.getCarModel()));

        this.reservationService.addReservation(reservationDto);
        model.addAttribute("reservation", reservationService.findAll());
        if(reservationDto.getId() == null){
            model.addAttribute("msg", "Rezerwacja dodana");
        }else{
            model.addAttribute("msg", "Rezerwacja zaktualizowana");
        }
        return "admin/reservation-list";


    }

    @PostMapping("/del")
    public String delReservation(@RequestParam(required = true)Long id, Model model){
        this.reservationService.deleteReservationById(id);
        model.addAttribute("msg", "rezerwacja usunieta");
        model.addAttribute("rezerwacje", reservationService.findAll());
        return "/admin/reservation-list";
    }


}

