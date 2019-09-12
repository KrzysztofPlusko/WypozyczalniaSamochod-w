package com.sda.carsharing.web.controllers;

import com.sda.carsharing.model.entities.Client;
import com.sda.carsharing.model.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
//
//public class RegisterController {
//
//    private ClientRepository clientRepository;
//    private PasswordEncoder passwordEncoder;
//
//
//    @Autowired
//    public RegisterController(ClientRepository clientRepository, PasswordEncoder passwordEncoder) {
//        this.clientRepository = clientRepository;
//        this.passwordEncoder = passwordEncoder;
//
//    }
//
//    @GetMapping
//    public String prepareRegistrationPage(Model model) {
//        Client client = new Client();
//        model.addAttribute("newClient", client);
//        return "registration-form";
//    }
//    @PostMapping
//    public String processRegistrationPage(String )
//
//
//}
