package com.sda.carsharing.web.controllers;

import com.sda.carsharing.dto.CarModelDto;
import com.sda.carsharing.services.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class CarModelController {
    private CarModelService carModelService;

    @Autowired
    public CarModelController(CarModelService carModelService) {
        this.carModelService = carModelService;
    }

    //wyświetl listę wszyskich modeli aut
    @RequestMapping(value = "/admin/carmodel", method = RequestMethod.GET)
    public String showAllView(Model model) {
        model.addAttribute("carmodels", carModelService.findAll());
        return "admin/showcarmodellist";
    }

    @RequestMapping(value = "admin/addcarmodel", method = RequestMethod.GET)
    public String addCarModelViev(Model model){
        model.addAttribute("carModelDto", new CarModelDto());
        return "admin/addcarmodel";
    }

    //logika dodania nowegomodelu auta do bazy
    @RequestMapping(value = "/admin/carmodel", method = RequestMethod.POST)
    public String addCarModel(@Valid @ModelAttribute("carModelDto") CarModelDto carModelDto, Model model) {

        this.carModelService.addCarModel(carModelDto);

        model.addAttribute("msg", "Model auta dodany");
        model.addAttribute("carmodels", carModelService.findAll());
        return "admin/showcarmodellist";
    }
}
