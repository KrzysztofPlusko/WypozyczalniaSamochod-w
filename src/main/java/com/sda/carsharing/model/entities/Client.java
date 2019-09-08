package com.sda.carsharing.model.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "clients")

@Getter
@Setter
public class Client extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)



    @NotBlank
    @Column(name = "first_name", updatable = false, nullable = false)
    private String firstName;

    @NotBlank
    @Column(name = "last_name", updatable = false, nullable = false)
    private String lastName;
    @NotBlank
    @Column(name = "email", updatable = false, nullable = false)
    private String email;
    @NotBlank
    @Column(name = "address", updatable = false, nullable = false)
    private String address;



    }

