package com.project.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.project.northwind.entity.OrdersStatus")
@Table(name = "orders_status")
public class OrdersStatus {

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Byte id;
  @Column(name = "\"status_name\"", nullable = false)
  private String statusName;
}