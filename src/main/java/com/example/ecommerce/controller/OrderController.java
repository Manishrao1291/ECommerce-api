package com.example.ecommerce.controller;


import com.example.ecommerce.model.Order;
import com.example.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    // place a order
    @PostMapping("order")
    public String placeOrder(@RequestBody Order order){
        orderService.placeOrder(order);
        return " order placed";
    }


    @GetMapping("order/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }


}
