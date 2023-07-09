package com.example.ecommerce.service;


import com.example.ecommerce.model.Product;
import com.example.ecommerce.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    IProductRepo iProductRepo;

    public void createProduct(Product product) {
        iProductRepo.save(product);
    }

    public List<Product> getALlProducts() {
        return (List<Product>) iProductRepo.findAll();
    }

    public String deleteById(Integer prodId) {
        iProductRepo.deleteById(prodId);
        return  " deleted.....";
    }
}
