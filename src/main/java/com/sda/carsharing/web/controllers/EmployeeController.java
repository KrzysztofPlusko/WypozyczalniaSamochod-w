package com.sda.carsharing.web.controllers;


import com.sda.carsharing.dto.EmployeeDto;
import com.sda.carsharing.model.entities.Employee;

import com.sda.carsharing.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Controller
@RequestMapping(value = "/admin/employee")
public class EmployeeController {

    private EmployeeService employeeService;


    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //wyświetl listę wszyskich pracowników
    @GetMapping
    public String showAllView(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "admin/employee-list";
    }

    //widok dla dodania nowego pracownika do bazy
    @GetMapping(value = "add")
    public String addEmployeeViev(Model model) {
        model.addAttribute("employeeDto", new EmployeeDto());
        return "admin/employee-form";
    }

    //logika dodania nowego pracownika do bazy
    @PostMapping
    public String addEmployee(@Valid @ModelAttribute("employeeDto") EmployeeDto employeeDto, Model model) {

        this.employeeService.addEmployee(employeeDto);

        model.addAttribute("msg", "Pracownik dodany");
        model.addAttribute("employee", employeeService.findAll());
        return "admin/employee-list";
    }

    @PostMapping(value = "delp")
    public String delpEmployee(@RequestParam(required = true) Long id, Model model) {
        this.employeeService.deleteEmployeeById(id);
        model.addAttribute("msg", "Pracownik usunięty");
        model.addAttribute("employees", employeeService.findAll());
        return "admin/employee-list";
    }


}


