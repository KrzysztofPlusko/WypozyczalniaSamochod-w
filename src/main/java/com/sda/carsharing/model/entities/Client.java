package com.sda.carsharing.model.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "clients")

@Getter
@Setter


public class Client extends BaseEntity {



    @NotBlank
    @Column(name = "first_name", updatable = false, nullable = false)
    private String firstName;

    @NotBlank
    @Column(name = "last_name", updatable = false, nullable = false)
    private String lastName;

    @Email
    @NotBlank
    @Column(name = "email", updatable = false, nullable = false)
    private String email;

    @NotBlank
    @Column(name = "adres", updatable = false, nullable = false)
    private String address;

    @NotBlank
    @Column(name="password",updatable = true, nullable = false)
    private String password;


    @Override
    public String toString() {
        return super.toString();
    }
}

