package com.example.ecommerce.service;


import com.example.ecommerce.model.User;
import com.example.ecommerce.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public void createUser(User user) {
        iUserRepo.save(user);

    }
}
