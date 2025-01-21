package org.example.bootdockercomposemysql.dao;

import org.example.bootdockercomposemysql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
