package com.project.controller;

import com.project.entity.Shippers;
import com.project.repository.ShippersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippersController {
    @Autowired
    private ShippersRepository repository;

    @GetMapping("/shippers")
    public Iterable<Shippers> getShippers() {
        return repository.findAll();
    }

    @PostMapping("/shippers")
    public Shippers save(@RequestBody Shippers shipper) {
        return repository.save(shipper);
    }

    @PutMapping("/shippers")
    public Shippers update(@RequestBody Shippers shipper) {
        return repository.save(shipper);
    }

    @DeleteMapping("/shippers")
    public void delete(@RequestBody Shippers shipper) {
        repository.delete(shipper);
    }

}
