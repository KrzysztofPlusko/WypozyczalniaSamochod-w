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
public class                    CarModelController {
    private CarModelService carModelService;

    @Autowired
    public CarModelController(CarModelService carModelService) {
        this.carModelService = carModelService;
    }

    //wyświetl listę wszyskich modeli aut
    @GetMapping
    public String showAllView(Model model) {
        model.addAttribute("carmodels", carModelService.findAll());
        return "admin/car-model-list";
    }

    //widok dodania nowego medelu do bazy
    @GetMapping(value = "add")
    public String addCarModelViev(Model model){
        model.addAttribute("carModelDto", new CarModelDto());
        return "admin/car-model-form";
    }

    //logika dodania nowego modelu auta do bazy
    @PostMapping
    public String saveCarModel(@Valid @ModelAttribute("carModelDto") CarModelDto carModelDto, Model model) {

        this.carModelService.addCarModel(carModelDto);
        if (carModelDto.getId() == null){
            model.addAttribute("msg", "Model auta dodany");
        }else{
            model.addAttribute("msg", "Model auta zaktualizowany");
        }

        model.addAttribute("carmodels", carModelService.findAll());
        return "admin/car-model-list";
    }

    @PostMapping(value = "del")
    public String delCarModel(@RequestParam(required = true) Long id, Model model){
        this.carModelService.deleteCarModelById(id);
        model.addAttribute("msg", "Model auta usunięty");
        model.addAttribute("carmodels", carModelService.findAll());
        return "admin/car-model-list";
    }

    @PostMapping(value = "edit")
    public String editCarModel(@RequestParam(required = true) Long id, Model model){
        model.addAttribute("carModelDto", carModelService.findById(id));
        return "admin/car-model-form";
    }
}
