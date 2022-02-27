package com.project.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.project.northwind.entity.InventoryTransactionTypes")
@Table(name = "inventory_transaction_types")
public class InventoryTransactionTypes {

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Byte id;
  @Column(name = "\"type_name\"", nullable = false)
  private String typeName;
}