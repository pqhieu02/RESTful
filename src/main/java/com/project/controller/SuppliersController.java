package com.project.controller;

import com.project.entity.Suppliers;
import com.project.repository.SuppliersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuppliersController {
    @Autowired
    private SuppliersRepository repository;

    @GetMapping("/suppliers")
    public Iterable<Suppliers> getSuppliers() {
        return repository.findAll();
    }

    @PostMapping("/suppliers")
    public Suppliers save(@RequestBody Suppliers supplier) {
        return repository.save(supplier);
    }

    @PutMapping("/suppliers")
    public Suppliers update(@RequestBody Suppliers supplier) {
        return repository.save(supplier);
    }

    @DeleteMapping("/suppliers")
    public void delete(@RequestBody Suppliers supplier) {
        repository.delete(supplier);
    }

}
