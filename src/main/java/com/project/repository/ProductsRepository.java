package com.project.repository;

import com.project.entity.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Integer> {

}
