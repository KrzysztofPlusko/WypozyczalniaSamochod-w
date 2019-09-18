package com.sda.carsharing.web.controllers;


import com.sda.carsharing.dto.EmployeeDto;
import com.sda.carsharing.model.entities.Employee;

import com.sda.carsharing.services.BranchesService;
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
    private BranchesService branchesService;


    @Autowired
    public EmployeeController(EmployeeService employeeService, BranchesService branchesService) {
        this.employeeService = employeeService;
        this.branchesService = branchesService;
    }

    //wyświetl listę wszyskich pracowników
    @GetMapping
    public String showAllView(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "admin/employee-list";
    }




    //logika dodania nowego pracownika do bazy
    @PostMapping
    public String addEmployee(@Valid @ModelAttribute("employeeDto") EmployeeDto employeeDto, Model model) {
        employeeDto.setBranches(branchesService.findById(employeeDto.getBranchId()));
        this.employeeService.addEmployee(employeeDto);

        model.addAttribute("msg", "Pracownik dodany");
        model.addAttribute("employees", employeeService.findAll());
        return "admin/employee-list";
    }

    @GetMapping(value = "/add")
    public String addEmployeeView(Model model) {

        model.addAttribute("employeeDto", new EmployeeDto());
        model.addAttribute("branches", branchesService.findAll());
        return "admin/employee-form";

        }

    @PostMapping(value = "/del")
    public String delEmployee(@RequestParam(required = true) Long id, Model model) {
        this.employeeService.deleteEmployeeById(id);
        model.addAttribute("msg", "Pracownik usunięty");
        model.addAttribute("employees", employeeService.findAll());
        return "admin/employee-list";
    }

    @PostMapping(value = "/edit")
    public String editEmployee(@RequestParam(required = true) Long id, Model model){
        model.addAttribute("employeeDto", employeeService.findById(id));
        return "admin/employee-form";
    }


}


