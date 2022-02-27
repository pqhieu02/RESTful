package com.project.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.project.northwind.entity.EmployeePrivileges")
@Table(name = "employee_privileges")
@IdClass(EmployeePrivileges.PrimaryKeys.class)
public class EmployeePrivileges {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer employeeId;
    private Integer privilegeId;
  }

  @Id
  @Column(name = "\"employee_id\"", nullable = false)
  private Integer employeeId;
  @Id
  @Column(name = "\"privilege_id\"", nullable = false)
  private Integer privilegeId;
}