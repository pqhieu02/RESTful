package com.project.repository;

import com.project.entity.OrdersTaxStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrdersTaxStatusRepository
        extends CrudRepository<OrdersTaxStatus, Byte> {

}
