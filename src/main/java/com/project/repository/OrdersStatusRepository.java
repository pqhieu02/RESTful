package com.project.repository;

import com.project.entity.OrdersStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrdersStatusRepository
        extends CrudRepository<OrdersStatus, Byte> {

}
