package com.example.ecommerce.repo;

import com.example.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Integer> {
}
