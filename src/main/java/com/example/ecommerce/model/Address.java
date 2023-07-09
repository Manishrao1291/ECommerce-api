package com.example.ecommerce.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;

    private String addName;
    private String addLandmark;
    private String addPhonenumber;
    private String addZipcode;
    private String addState;


    @ManyToOne
    @JoinColumn(name = "fk_userId")
    User user;
}
