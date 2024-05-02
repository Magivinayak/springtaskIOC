package com.example.productsWithThymeleaf.service;

import com.example.productsWithThymeleaf.entity.Products;
import com.example.productsWithThymeleaf.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public List<Products> getAllProducts(){
        return repository.findAll();
    }

    public Products addProduct(Products products){
        return repository.save(products);
    }
}
