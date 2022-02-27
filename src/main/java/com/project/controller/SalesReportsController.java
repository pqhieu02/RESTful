package com.project.controller;

import com.project.entity.SalesReports;
import com.project.repository.SalesReportsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesReportsController {
    @Autowired
    private SalesReportsRepository repository;

    @GetMapping("/salesReports")
    public Iterable<SalesReports> getSalesReports() {
        return repository.findAll();
    }

    @PostMapping("/salesReports")
    public SalesReports save(@RequestBody SalesReports salesReport) {
        return repository.save(salesReport);
    }

    @PutMapping("/salesReports")
    public SalesReports update(@RequestBody SalesReports salesReport) {
        return repository.save(salesReport);
    }

    @DeleteMapping("/salesReports")
    public void delete(@RequestBody SalesReports salesReport) {
        repository.delete(salesReport);
    }

}
