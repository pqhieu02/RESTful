package com.project.repository;

import com.project.entity.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
