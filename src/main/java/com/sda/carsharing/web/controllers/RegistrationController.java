package com.sda.carsharing.web.controllers;
import com.sda.carsharing.model.entities.Client;
import com.sda.carsharing.model.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/register")
public class RegistrationController {

    private ClientRepository clientRepository;
    private PasswordEncoder passwordEncoder;


    @Autowired
    public RegistrationController(ClientRepository clientRepository, PasswordEncoder passwordEncoder) {
        this.clientRepository = clientRepository;
        this.passwordEncoder = passwordEncoder;

    }

    @GetMapping
    public String prepareRegistrationPage(Model model) {
        Client client = new Client();
        model.addAttribute("newClient", client);
        return "registration-form";
    }
 @PostMapping
 public String processRegistrationPage(String email, String password, String firstName, String lastName, String address)  {

    Client client = new Client();

    client.setEmail(email);
    String encodedPassword = passwordEncoder.encode(password);
    client.setPassword(password);
    client.setFirstName(firstName);
    client.setLastName(lastName);
    client.setAddress(address);

    List<Client> clients = clientRepository.FindAllByUsername(email);
    if(clients.isEmpty()) {
        clientRepository.save(client);
}
        return "redirect:/index.html";
    }



}
