package com.sda.carsharing.model.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "clients")

@Getter
@Setter
public class Client extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @NotBlank
    @Column(name = "first_name", updatable = false, nullable = false)
    private String first_name;

    @NotBlank
    @Column(name = "last_name", updatable = false, nullable = false)
    private String last_name;
    @NotBlank
    @Column(name = "email", updatable = false, nullable = false)
    private String email;
    @NotBlank
    @Column(name = "adres", updatable = false, nullable = false)
    private String adres;


    }

