package com.project.controller;

import com.project.entity.Invoices;
import com.project.repository.InvoicesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoicesController {
    @Autowired
    private InvoicesRepository repository;

    @GetMapping("/invoices")
    public Iterable<Invoices> getInvoices() {
        return repository.findAll();
    }

    @PostMapping("/invoices")
    public Invoices save(@RequestBody Invoices invoice) {
        return repository.save(invoice);
    }

    @PutMapping("/invoices")
    public Invoices update(@RequestBody Invoices invoice) {
        return repository.save(invoice);
    }

    @DeleteMapping("/invoices")
    public void delete(@RequestBody Invoices invoice) {
        repository.delete(invoice);
    }

}
