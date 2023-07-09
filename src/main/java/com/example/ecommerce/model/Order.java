package com.example.ecommerce.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private Integer prodQuantity;

    @ManyToOne
    @JoinColumn(name = "fk-userId")
    User user;

    @ManyToOne
    @JoinColumn(name = "fk-prodId")
    Product product;

    @ManyToOne
    @JoinColumn(name = "fk-addId")
    Address address;



}
