package com.project.repository;

import com.project.entity.PurchaseOrders;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrdersRepository
        extends CrudRepository<PurchaseOrders, Integer> {

}
