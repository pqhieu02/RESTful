package com.project.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.project.northwind.entity.Privileges")
@Table(name = "privileges")
public class Privileges {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"privilege_name\"", nullable = true)
  private String privilegeName;
}