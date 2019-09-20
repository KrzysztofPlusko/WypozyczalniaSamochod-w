package com.sda.carsharing.web.controllers;

import com.sda.carsharing.dto.CarDto;
import com.sda.carsharing.mappers.CarMapper;
import com.sda.carsharing.services.BranchesService;
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
    private BranchesService branchesService;

    @Autowired
    public CarController(CarService carService, CarModelService carModelService, BranchesService branchesService) {
        this.carService = carService;
        this.carModelService = carModelService;
        this.branchesService = branchesService;
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
        model.addAttribute("branches", branchesService.findAll());
        model.addAttribute("carModel", id);
        return "admin/car-form";
    }

    //logika dodania nowego pojazdu
    @PostMapping
    public String saveCar(@Valid @ModelAttribute("carDto") CarDto carDto, Model model){
        if(carDto.getId() == null){
            model.addAttribute("msg", "Auto zostalo dodane");
        }else{
            model.addAttribute("msg", "Auto zostalo zmodyfikowane");
        }
        carDto.setCarModel(carModelService.findById(carDto.getCarModelId()));
        carDto.setBranches(branchesService.findById(carDto.getBranchId()));
        carService.saveCar(carDto);
        model.addAttribute("cars", carService.findAll());
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

    //widok edycji pojazdu
    @PostMapping(value = "edit")
    public String editCar(@RequestParam(required = true)Long id, Model model){
        CarDto carDto = CarMapper.toDto(carService.findById(id));
        model.addAttribute("carDto", carDto);
        model.addAttribute("carModel", carDto.getCarModelId());
        model.addAttribute("branches", branchesService.findAll());
        return "admin/car-form";
    }

}
