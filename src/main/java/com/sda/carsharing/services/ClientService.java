package com.sda.carsharing.services;

import com.sda.carsharing.model.entities.Client;
import com.sda.carsharing.model.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) { this.clientRepository = clientRepository; }

//    @Transactional(readOnly = false)
//    public void createUser(ClientDto userDto){
//        User user = toEntity(userDto);
//        this.addressService.save(user.getAddress());
//        this.userRepository.save(user);
//    }
//
//
//
//    @Transactional(readOnly = true)
//    public User getById(Long id) {
//        return userRepository.getOne(id);
//    }

}
