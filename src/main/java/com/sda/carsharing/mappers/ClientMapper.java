package com.sda.carsharing.mappers;

import com.sda.carsharing.dto.ClientDto;
import com.sda.carsharing.model.entities.Client;

public class ClientMapper {

    public static Client toEntity(ClientDto clientDto) {

        Client client = new Client();
        client.setFirstName(clientDto.getFirst_name());
        client.setLastName(clientDto.getLast_name());
        client.setEmail(clientDto.getEmail());
        client.setAddress(clientDto.getAdres());
       // client.setPassword(clientDto.getPassword());
        return client;
    }
}
