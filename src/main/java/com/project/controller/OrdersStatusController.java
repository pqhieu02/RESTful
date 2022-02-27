package com.project.controller;

import com.project.entity.OrdersStatus;
import com.project.repository.OrdersStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersStatusController {
    @Autowired
    private OrdersStatusRepository repository;

    @GetMapping("/ordersStatus")
    public Iterable<OrdersStatus> getOrdersStatus() {
        return repository.findAll();
    }

    @PostMapping("/ordersStatus")
    public OrdersStatus save(@RequestBody OrdersStatus ordersStatus) {
        return repository.save(ordersStatus);
    }

    @PutMapping("/ordersStatus")
    public OrdersStatus update(@RequestBody OrdersStatus ordersStatus) {
        return repository.save(ordersStatus);
    }

    @DeleteMapping("/ordersStatus")
    public void delete(@RequestBody OrdersStatus ordersStatus) {
        repository.delete(ordersStatus);
    }

}
