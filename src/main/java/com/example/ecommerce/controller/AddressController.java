package com.example.ecommerce.controller;


import com.example.ecommerce.model.Address;
import com.example.ecommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    // create a address
    @PostMapping("address")
    public void createAddress(@RequestBody Address address){
        addressService.createAddress(address);
    }

}
