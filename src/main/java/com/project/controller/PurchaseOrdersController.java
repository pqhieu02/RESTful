package com.project.controller;

import com.project.entity.PurchaseOrders;
import com.project.repository.PurchaseOrdersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseOrdersController {
    @Autowired
    private PurchaseOrdersRepository repository;

    @GetMapping("/purchaseOrder")
    public Iterable<PurchaseOrders> getPurchaseOrders() {
        return repository.findAll();
    }

    @PostMapping("/purchaseOrder")
    public PurchaseOrders save(@RequestBody PurchaseOrders purchaseOrder) {
        return repository.save(purchaseOrder);
    }

    @PutMapping("/purchaseOrder")
    public PurchaseOrders update(@RequestBody PurchaseOrders purchaseOrder) {
        return repository.save(purchaseOrder);
    }

    @DeleteMapping("/purchaseOrder")
    public void delete(@RequestBody PurchaseOrders purchaseOrder) {
        repository.delete(purchaseOrder);
    }

}
