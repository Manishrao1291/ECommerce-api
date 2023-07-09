package com.example.ecommerce.repo;

import com.example.ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer>{
}
