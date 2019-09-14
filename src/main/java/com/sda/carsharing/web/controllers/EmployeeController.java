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
        public String addEmployeeViev(Model model){
            model.addAttribute("employeeDto", new EmployeeDto());
            return "admin/employee-form";
        }

        //logika dodania nowego modelu auta do bazy
        @PostMapping
        public String addEmployee(@Valid @ModelAttribute("employeeDto") EmployeeDto employeeDto, Model model) {

            this.employeeService.addEmployee(employeeDto);

            model.addAttribute("msg", "Pracownik dodany");
            model.addAttribute("employee", employeeService.findAll());
            return "admin/showemployeelist";
        }

        @PostMapping(value = "delp")
        public String delpEmployee(@RequestParam(required = true) Long id, Model model){
            this.employeeService.deleteEmployeeById(id);
            model.addAttribute("msg", "Pracownik usunięty");
            model.addAttribute("employees", employeeService.findAll());
            return "admin/showemployeelist";
        }







//    @RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
//    public String addEmployeeViev(Model model) {
//        model.addAttribute("employeeDto", new EmployeeDto());
//        return "add_employee";
//    }
//
//    @PostMapping(value = "/employee")
//    public String createEmployee(@Valid @ModelAttribute("employeeDto") EmployeeDto employeeDto, Model model) {
//        if (employeeDto.getId() == null) {
//            this.employeeService.createEmployee(employeeDto);
//
//        } else {
//            this.employeeService.updateEmployee(employeeDto);
//        }
//        model.addAttribute("employees", this.employeeService.findAll());
//        return "employess";
//    }
//
//    @PostMapping(value = "/deleteEmployee")
//   public String deleteEmployee(@RequestParam(required = true) Long id, Model model){
//        this.employeeService.deleteEmployeeById(id);
//        model.addAttribute("employees", this.employeeService.findAll());
//
//        return "employess";
//   }
//   @PostMapping(value = "/editEmployess")
//    public String editEmployee(@RequestParam(required = true) Long id, Model model){
//        model.addAttribute("employeeDto", toDto (this.employeeService.getById(id)));
//
//        return "add_employee";




}

//    private UserService userService;
////
////    @Autowired
////    public UserController(UserService userService) {
////        this.userService = userService;
////    }
////
////    @RequestMapping(value = "/adduser", method = RequestMethod.GET)
////    public String addUserView(Model model){
////        model.addAttribute("userDto", new UserDto());
////        return "add_user";
////    }
////
////    @PostMapping(value = "/user")
////    public String createUser(@Valid @ModelAttribute("userDto") UserDto userDto, Model model){
////
////        if(userDto.getId() == null) {
////            this.userService.createUser(userDto);
////        } else {
////            this.userService.updateUser(userDto);
////        }
////
////        model.addAttribute("users", this.userService.findAll());
////        return "users";
////    }
////
////    @PostMapping(value = "/deleteUser")
////    public String deleteUser(@RequestParam(required = true) Long id, Model model){
////        this.userService.deleteUserById(id);
////        model.addAttribute("users", this.userService.findAll());
////
////        return "users";
////    }
////
////    @PostMapping(value = "/editUser")
////    public String editUser(@RequestParam(required = true) Long id, Model model){
////        model.addAttribute("userDto", toDto(this.userService.getById(id)));
////
////        return "add_user";
////    }