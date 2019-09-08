package com.sda.carsharing.rest.controllers;


import com.sda.carsharing.model.repositories.entities.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private ClientRepository clientRepository;


}
