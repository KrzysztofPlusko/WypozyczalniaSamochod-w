package com.sda.carsharing.converters;

import com.sda.carsharing.model.entities.Client;
import com.sda.carsharing.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class ClientConverter implements Converter<String, Client> {

    private ClientService clientService;

    @Override
    public Client convert(String s) {
        return clientService.findByEmail(s);
    }

    @Autowired
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }
}
