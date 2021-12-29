package com.vlado.demo;

import com.vlado.demo.db.Employee;
import com.vlado.demo.db.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
        Employee employee = new Employee();
        employee.setDept("dept");
        employee.setName("GoshYtu");
        employee.setSalary(100);
        employee.setId(1L);
        Employee save = employeeRepository.save(employee);
        assertNotNull(save);
    }

}
