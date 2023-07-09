package com.example.ecommerce.controller;


import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    // create a product
    @PostMapping("product")
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    // get all product
    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getALlProducts();
    }

     // delete a product
    @DeleteMapping("prod/{prodId}")
    public String deleteById(@PathVariable Integer prodId){
        return productService.deleteById(prodId);
    }

}
