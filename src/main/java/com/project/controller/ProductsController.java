package com.project.controller;

import com.project.entity.Products;
import com.project.repository.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    @Autowired
    private ProductsRepository repository;

    @GetMapping("/products")
    public Iterable<Products> getProducts() {
        return repository.findAll();
    }

    @PostMapping("/products")
    public Products save(@RequestBody Products product) {
        return repository.save(product);
    }

    @PutMapping("/products")
    public Products update(@RequestBody Products product) {
        return repository.save(product);
    }

    @DeleteMapping("/products")
    public void delete(@RequestBody Products product) {
        repository.delete(product);
    }

}
