package com.project.controller;

import com.project.entity.Customers;
import com.project.repository.CustomersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomersController {
    @Autowired
    private CustomersRepository repository;

    @GetMapping("/customers")
    public Iterable<Customers> getCustomers() {
        return repository.findAll();
    }

    @PostMapping("/customers")
    public Customers save(@RequestBody Customers customer) {
        return repository.save(customer);
    }

    @PutMapping("/customers")
    public Customers update(@RequestBody Customers customer) {
        return repository.save(customer);
    }

    @DeleteMapping("/customers")
    public void delete(@RequestBody Customers customer) {
        repository.delete(customer);
    }

}
