package com.sda.carsharing.web.controllers;

import com.sda.carsharing.dto.CarDto;
import com.sda.carsharing.services.CarModelService;
import com.sda.carsharing.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/admin/car")
public class CarController {
    private CarService carService;
    private CarModelService carModelService;

    @Autowired
    public CarController(CarService carService, CarModelService carModelService) {
        this.carService = carService;
        this.carModelService = carModelService;
    }

    //wyświetl listę wszystkich aut
    @GetMapping
    public String findAll(Model model){
        model.addAttribute("cars", carService.findAll());
        return "admin/car-list";
    }

    //widok dodania nowego pojazdu
    @PostMapping(value = "add")
    public String addCarView(Model model, @RequestParam(required = true) Long id){
        model.addAttribute("carDto", new CarDto());
        model.addAttribute("carModel", id);
        return "admin/car-form";
    }

    //logika dodania nowego pojazdu
    @PostMapping
    public String saveCar(@Valid @ModelAttribute("carDto") CarDto carDto, Model model){
        carDto.setCarModel(carModelService.findById(carDto.getCarModelId()));
        carService.saveCar(carDto);
        model.addAttribute("cars", carService.findAll());
        model.addAttribute("msg", "Auto zostalo dodane");
        return "admin/car-list";
    }

    //logika usuwania pojazdu
    @PostMapping(value = "del")
    public String delCar(@RequestParam(required = true) Long id, Model model){
        carService.delCar(id);
        model.addAttribute("cars", carService.findAll());
        model.addAttribute("msg", "Auto zostało usunięte");
        return "admin/car-list";
    }

}
