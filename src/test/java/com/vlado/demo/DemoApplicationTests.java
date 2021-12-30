package com.vlado.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Random;

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
        employee.setName("GoshYtu663334");
        employee.setSalary(100);

        long leftLimit = 1L;
        long rightLimit = 10L;
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));

        employee.setId(generatedLong);
        Employee save = employeeRepository.save(employee);

        Employee goshYtu = employeeRepository.getEmployeeByName("GoshYtu663334");
        assertNotNull(goshYtu);
        assertNotNull(save);

        List<Employee> dept = employeeRepository.findAllByDept("dept");
        assertNotNull(dept);

        List<Employee> dept2 = employeeRepository.findAllByDeptAndName("dept", "GoshYtu663334");
        assertNotNull(dept2);

    }

    @Test
    void getAllEmp() {
        List<Employee> all = employeeRepository.findAll();
        System.out.println("***************************************");
        System.out.println(all.size());
    }

    @Test
    void duplicateEmp() {
        Employee employee = new Employee();
        employee.setDept("dept");
        employee.setName("GoshYtu663334");
        employee.setSalary(100);

        long leftLimit = 1L;
        long rightLimit = 10L;
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));

        employee.setId(generatedLong);
        Employee save = employeeRepository.save(employee);
        assertNotNull(save);

        Employee save2 = employeeRepository.save(employee);
        assertNotNull(save2);

    }
}
