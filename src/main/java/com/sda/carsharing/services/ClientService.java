package com.sda.carsharing.services;

import com.sda.carsharing.model.entities.Client;
import com.sda.carsharing.model.repositories.entities.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) { this.clientRepository = clientRepository; }

    @Transactional
    public Client save(Client client) {return this.clientRepository.save(client); }



}
