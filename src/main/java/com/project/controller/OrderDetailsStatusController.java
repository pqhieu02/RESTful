package com.project.controller;

import com.project.entity.OrderDetailsStatus;
import com.project.repository.OrderDetailsStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsStatusController {
    @Autowired
    private OrderDetailsStatusRepository repository;

    @GetMapping("/orderDetailsStatus")
    public Iterable<OrderDetailsStatus> getOrderDetailsStatus() {
        return repository.findAll();
    }

    @PostMapping("/orderDetailsStatus")
    public OrderDetailsStatus save(@RequestBody OrderDetailsStatus orderDetailsStatus) {
        return repository.save(orderDetailsStatus);
    }

    @PutMapping("/orderDetailsStatus")
    public OrderDetailsStatus update(@RequestBody OrderDetailsStatus orderDetailsStatus) {
        return repository.save(orderDetailsStatus);
    }

    @DeleteMapping("/orderDetailsStatus")
    public void delete(@RequestBody OrderDetailsStatus orderDetailsStatus) {
        repository.delete(orderDetailsStatus);
    }

}
