package org.example.bootdockercomposemysql;

import org.example.bootdockercomposemysql.controller.EmployeeController;
import org.example.bootdockercomposemysql.dao.EmployeeDao;
import org.example.bootdockercomposemysql.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class BootDockerComposeMysqlApplication {

    @Autowired
    public final EmployeeDao employeeDao;

    public BootDockerComposeMysqlApplication(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    @Bean
    @Profile("dev")
    public ApplicationRunner runner() {
        return args -> {
            Employee e1 = new Employee("KOKO","ko@email.com","33333");
            employeeDao.save(e1);
        };
    }


    public static void main(String[] args) {
        SpringApplication.run(BootDockerComposeMysqlApplication.class, args);
    }

}
