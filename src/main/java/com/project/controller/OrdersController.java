package com.project.controller;

import com.project.entity.Orders;
import com.project.repository.OrdersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
    @Autowired
    private OrdersRepository repository;

    @GetMapping("/orders")
    public Iterable<Orders> getOrders() {
        return repository.findAll();
    }

    @PostMapping("/orders")
    public Orders save(@RequestBody Orders order) {
        return repository.save(order);
    }

    @PutMapping("/orders")
    public Orders update(@RequestBody Orders order) {
        return repository.save(order);
    }

    @DeleteMapping("/orders")
    public void delete(@RequestBody Orders order) {
        repository.delete(order);
    }

}
