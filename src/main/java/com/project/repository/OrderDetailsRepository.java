package com.project.repository;

import com.project.entity.OrderDetails;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository
        extends CrudRepository<OrderDetails, Integer> {

}
