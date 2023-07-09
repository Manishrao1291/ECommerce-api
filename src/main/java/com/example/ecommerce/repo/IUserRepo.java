package com.example.ecommerce.repo;


import com.example.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
