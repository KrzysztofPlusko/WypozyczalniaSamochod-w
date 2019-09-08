package com.sda.carsharing.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class ClientDto {


    private Long id;

    @NotBlank
    private String first_name;

    @NotBlank
    private String last_name;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String adres;
}
