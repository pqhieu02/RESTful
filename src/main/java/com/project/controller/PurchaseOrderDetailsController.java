package com.project.controller;

import com.project.entity.PurchaseOrderDetails;
import com.project.repository.PurchaseOrderDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseOrderDetailsController {
    @Autowired
    private PurchaseOrderDetailsRepository repository;

    @GetMapping("/purchaseOrderDetails")
    public Iterable<PurchaseOrderDetails> getPurchaseOrderDetails() {
        return repository.findAll();
    }

    @PostMapping("/purchaseOrderDetails")
    public PurchaseOrderDetails save(@RequestBody PurchaseOrderDetails purchaseOrderDetail) {
        return repository.save(purchaseOrderDetail);
    }

    @PutMapping("/purchaseOrderDetails")
    public PurchaseOrderDetails update(@RequestBody PurchaseOrderDetails purchaseOrderDetail) {
        return repository.save(purchaseOrderDetail);
    }

    @DeleteMapping("/purchaseOrderDetails")
    public void delete(@RequestBody PurchaseOrderDetails purchaseOrderDetail) {
        repository.delete(purchaseOrderDetail);
    }

}
