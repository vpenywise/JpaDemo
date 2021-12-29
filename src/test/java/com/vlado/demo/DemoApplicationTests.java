package com.vlado.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vlado.demo.db.Employee;
import com.vlado.demo.db.EmployeeRepository;

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
    
    @Test
    void getAllEmp() {
        List<Employee> all = employeeRepository.findAll();
        System.out.println("***************************************");
        System.out.println(all.size());
    }

}
