package com.project.controller;

import com.project.entity.OrderDetails;
import com.project.repository.OrderDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsController {
    @Autowired
    private OrderDetailsRepository repository;

    @GetMapping("/orderDetails")
    public Iterable<OrderDetails> getOrderDetails() {
        return repository.findAll();
    }

    @PostMapping("/orderDetails")
    public OrderDetails save(@RequestBody OrderDetails orderDetail) {
        return repository.save(orderDetail);
    }

    @PutMapping("/orderDetails")
    public OrderDetails update(@RequestBody OrderDetails orderDetail) {
        return repository.save(orderDetail);
    }

    @DeleteMapping("/orderDetails")
    public void delete(@RequestBody OrderDetails orderDetail) {
        repository.delete(orderDetail);
    }

}
