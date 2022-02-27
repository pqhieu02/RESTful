package com.project.controller;

import com.project.entity.InventoryTransactions;
import com.project.repository.InventoryTransactionsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryTransactionsController {
    @Autowired
    private InventoryTransactionsRepository repository;

    @GetMapping("/inventoryTransaction")
    public Iterable<InventoryTransactions> getCustomers() {
        return repository.findAll();
    }

    @PostMapping("/inventoryTransaction")
    public InventoryTransactions save(@RequestBody InventoryTransactions inventoryTransaction) {
        return repository.save(inventoryTransaction);
    }

    @PutMapping("/inventoryTransaction")
    public InventoryTransactions update(@RequestBody InventoryTransactions inventoryTransaction) {
        return repository.save(inventoryTransaction);
    }

    @DeleteMapping("/inventoryTransaction")
    public void delete(@RequestBody InventoryTransactions inventoryTransaction) {
        repository.delete(inventoryTransaction);
    }

}
