package com.project.repository;

import com.project.entity.PurchaseOrderDetails;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderDetailsRepository
        extends CrudRepository<PurchaseOrderDetails, Integer> {

}
