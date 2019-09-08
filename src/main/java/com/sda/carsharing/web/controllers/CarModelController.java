package com.sda.carsharing.web.controllers;

import com.sda.carsharing.dto.CarModelDto;
import com.sda.carsharing.services.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/admin/carmodel")
public class CarModelController {
    private CarModelService carModelService;

    @Autowired
    public CarModelController(CarModelService carModelService) {
        this.carModelService = carModelService;
    }

    //wyświetl listę wszyskich modeli aut
    @GetMapping
    public String showAllView(Model model) {
        model.addAttribute("carmodels", carModelService.findAll());
        return "admin/showcarmodellist";
    }

    //widok dla dodania nowego medelu do bazy
    @GetMapping(value = "add")
    public String addCarModelViev(Model model){
        model.addAttribute("carModelDto", new CarModelDto());
        return "admin/addcarmodel";
    }

    //logika dodania nowego modelu auta do bazy
    @PostMapping
    public String addCarModel(@Valid @ModelAttribute("carModelDto") CarModelDto carModelDto, Model model) {

        this.carModelService.addCarModel(carModelDto);

        model.addAttribute("msg", "Model auta dodany");
        model.addAttribute("carmodels", carModelService.findAll());
        return "admin/showcarmodellist";
    }

    @PostMapping(value = "del")
    public String delCarModel(@RequestParam(required = true) Long id, Model model){
        this.carModelService.deleteCarModelById(id);
        model.addAttribute("msg", "Model auta usunięty");
        model.addAttribute("carmodels", carModelService.findAll());
        return "admin/showcarmodellist";
    }
}
