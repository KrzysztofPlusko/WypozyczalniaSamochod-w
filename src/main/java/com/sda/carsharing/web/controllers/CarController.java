package com.sda.carsharing.web.controllers;

import com.sda.carsharing.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/car")
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    //wyświetl listę wszystkich aut
    @GetMapping
    public String findAll(Model model){
        model.addAttribute("cars", carService.findAll());
        return "admin/car-list";
    }
}
