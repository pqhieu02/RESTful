package com.project.controller;

import com.project.entity.Employees;
import com.project.repository.EmployeesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {
    @Autowired
    private EmployeesRepository repository;

    @GetMapping("/employees")
    public Iterable<Employees> getCustomers() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    public Employees save(@RequestBody Employees employees) {
        return repository.save(employees);
    }

    @PutMapping("/employees")
    public Employees update(@RequestBody Employees employees) {
        return repository.save(employees);
    }

    @DeleteMapping("/employees")
    public void delete(@RequestBody Employees employees) {
        repository.delete(employees);
    }

}
