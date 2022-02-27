package com.project.repository;

import com.project.entity.InventoryTransactions;

import org.springframework.data.repository.CrudRepository;

public interface InventoryTransactionsRepository
        extends CrudRepository<InventoryTransactions, Integer> {

}
