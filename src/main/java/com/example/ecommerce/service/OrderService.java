package com.example.ecommerce.service;


import com.example.ecommerce.model.Order;
import com.example.ecommerce.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;

    public void placeOrder(Order order) {
        iOrderRepo.save(order);
    }

    public Order getOrderById(Integer id) {
        return iOrderRepo.findById(id).orElse(null);
    }
}
