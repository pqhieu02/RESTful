package com.project.controller;

import com.project.entity.Privileges;
import com.project.repository.PrivilegesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivilegesController {
    @Autowired
    private PrivilegesRepository repository;

    @GetMapping("/privileges")
    public Iterable<Privileges> getPrivileges() {
        return repository.findAll();
    }

    @PostMapping("/privileges")
    public Privileges save(@RequestBody Privileges privileges) {
        return repository.save(privileges);
    }

    @PutMapping("/privileges")
    public Privileges update(@RequestBody Privileges privileges) {
        return repository.save(privileges);
    }

    @DeleteMapping("/privileges")
    public void delete(@RequestBody Privileges privileges) {
        repository.delete(privileges);
    }

}
