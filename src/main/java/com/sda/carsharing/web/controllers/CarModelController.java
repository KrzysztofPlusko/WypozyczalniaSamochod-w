package com.sda.carsharing.web.controllers;

import com.sda.carsharing.services.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CarModelController {
    private CarModelService carModelService;

    @Autowired
    public CarModelController(CarModelService carModelService) {
        this.carModelService = carModelService;
    }

    @RequestMapping(value = "/admin/carmodel", method = RequestMethod.GET)
    public String showAll(Model model) {

        model.addAttribute("carmodels", carModelService.findAll());
        return "admin/showcarmodellist";
    }
}
