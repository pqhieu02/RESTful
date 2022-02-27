package com.project.repository;

import com.project.entity.PurchaseOrderStatus;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderStatusRepository
        extends CrudRepository<PurchaseOrderStatus, Integer> {

}
