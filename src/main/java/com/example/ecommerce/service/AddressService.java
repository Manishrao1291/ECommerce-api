package com.example.ecommerce.service;

import com.example.ecommerce.model.Address;
import com.example.ecommerce.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public void createAddress(Address address) {
        iAddressRepo.save(address);
    }
}
