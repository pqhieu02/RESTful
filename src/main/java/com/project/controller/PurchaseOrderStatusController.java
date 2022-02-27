package com.project.controller;

import com.project.entity.PurchaseOrderStatus;
import com.project.repository.PurchaseOrderStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseOrderStatusController {
    @Autowired
    private PurchaseOrderStatusRepository repository;

    @GetMapping("/purchaseOrdersStatus")
    public Iterable<PurchaseOrderStatus> getPurchaseOrderStatus() {
        return repository.findAll();
    }

    @PostMapping("/purchaseOrdersStatus")
    public PurchaseOrderStatus save(@RequestBody PurchaseOrderStatus purchaseOrdersStatus) {
        return repository.save(purchaseOrdersStatus);
    }

    @PutMapping("/purchaseOrdersStatus")
    public PurchaseOrderStatus update(@RequestBody PurchaseOrderStatus purchaseOrdersStatus) {
        return repository.save(purchaseOrdersStatus);
    }

    @DeleteMapping("/purchaseOrdersStatus")
    public void delete(@RequestBody PurchaseOrderStatus purchaseOrdersStatus) {
        repository.delete(purchaseOrdersStatus);
    }

}
