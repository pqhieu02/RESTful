package com.project.controller;

import com.project.entity.EmployeePrivileges;
import com.project.repository.EmployeePrivilegesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePrivilegesController {
    @Autowired
    private EmployeePrivilegesRepository repository;

    @GetMapping("/employeePrivileges")
    public Iterable<EmployeePrivileges> getCustomers() {
        return repository.findAll();
    }

    @PostMapping("/employeePrivileges")
    public EmployeePrivileges save(@RequestBody EmployeePrivileges employeePrivileges) {
        return repository.save(employeePrivileges);
    }

    @PutMapping("/employeePrivileges")
    public EmployeePrivileges update(@RequestBody EmployeePrivileges employeePrivileges) {
        return repository.save(employeePrivileges);
    }

    @DeleteMapping("/employeePrivileges")
    public void delete(@RequestBody EmployeePrivileges employeePrivileges) {
        repository.delete(employeePrivileges);
    }

}
