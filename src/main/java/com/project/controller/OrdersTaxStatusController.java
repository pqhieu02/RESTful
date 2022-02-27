package com.project.controller;

import com.project.entity.OrdersTaxStatus;
import com.project.repository.OrdersTaxStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersTaxStatusController {
    @Autowired
    private OrdersTaxStatusRepository repository;

    @GetMapping("/ordersTaxStatus")
    public Iterable<OrdersTaxStatus> getOrdersTaxStatus() {
        return repository.findAll();
    }

    @PostMapping("/ordersTaxStatus")
    public OrdersTaxStatus save(@RequestBody OrdersTaxStatus ordersTaxStatus) {
        return repository.save(ordersTaxStatus);
    }

    @PutMapping("/ordersTaxStatus")
    public OrdersTaxStatus update(@RequestBody OrdersTaxStatus ordersTaxStatus) {
        return repository.save(ordersTaxStatus);
    }

    @DeleteMapping("/ordersTaxStatus")
    public void delete(@RequestBody OrdersTaxStatus ordersTaxStatus) {
        repository.delete(ordersTaxStatus);
    }

}
