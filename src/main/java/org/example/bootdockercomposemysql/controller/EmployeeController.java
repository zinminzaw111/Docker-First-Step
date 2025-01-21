package org.example.bootdockercomposemysql.controller;

import org.example.bootdockercomposemysql.dao.EmployeeDao;
import org.example.bootdockercomposemysql.entity.Employee;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeDao employeeDao;

    public EmployeeController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }
}
