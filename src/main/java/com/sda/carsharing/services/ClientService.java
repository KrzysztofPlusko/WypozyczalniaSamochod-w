package com.sda.carsharing.services;

import com.sda.carsharing.dto.ClientDto;
import com.sda.carsharing.model.entities.Client;
import com.sda.carsharing.model.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.sda.carsharing.mappers.ClientMapper.toEntity;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) { this.clientRepository = clientRepository; }

    @Transactional(readOnly = false)
    public void createClient(ClientDto clientDto){
        Client client = toEntity(clientDto);
        this.clientRepository.save(client);
    }

   @Transactional(readOnly = true)
    public List<Client> FindAllByUsername(String email) {   // jako username używany email
        return this.clientRepository.FindAllByUsername(email);

   }
    }


