package com.project.controller;

import com.project.entity.InventoryTransactionTypes;
import com.project.repository.InventoryTransactionTypesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryTransactionTypesController {
    @Autowired
    private InventoryTransactionTypesRepository repository;

    @GetMapping("/inventoryTransactionTypes")
    public Iterable<InventoryTransactionTypes> getCustomers() {
        return repository.findAll();
    }

    @PostMapping("/inventoryTransactionTypes")
    public InventoryTransactionTypes save(@RequestBody InventoryTransactionTypes inventoryTransactionTypes) {
        return repository.save(inventoryTransactionTypes);
    }

    @PutMapping("/inventoryTransactionTypes")
    public InventoryTransactionTypes update(@RequestBody InventoryTransactionTypes inventoryTransactionTypes) {
        return repository.save(inventoryTransactionTypes);
    }

    @DeleteMapping("/inventoryTransactionTypes")
    public void delete(@RequestBody InventoryTransactionTypes inventoryTransactionTypes) {
        repository.delete(inventoryTransactionTypes);
    }

}
