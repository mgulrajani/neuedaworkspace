package com.training.payments_application.entities;

import jakarta.persistence.*;

@Entity
public class Author {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;

    private String emailId;
}