package com.vlado.demo.rest;

import com.vlado.demo.db.Employee;
import com.vlado.demo.db.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employee")
    public Object getAllRecords() {
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/employee", params = "id")
    public Object getRecordById(@RequestParam("id") Long id) {
        return employeeRepository.findById(id);
    }

    @PostMapping(value = "/employee")
    public Object addRecord(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }


}
