package com.project.controller;

import com.project.entity.Strings;
import com.project.repository.StringsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringsController {
    @Autowired
    private StringsRepository repository;

    @GetMapping("/strings")
    public Iterable<Strings> getStrings() {
        return repository.findAll();
    }

    @PostMapping("/strings")
    public Strings save(@RequestBody Strings string) {
        return repository.save(string);
    }

    @PutMapping("/strings")
    public Strings update(@RequestBody Strings string) {
        return repository.save(string);
    }

    @DeleteMapping("/strings")
    public void delete(@RequestBody Strings string) {
        repository.delete(string);
    }

}
