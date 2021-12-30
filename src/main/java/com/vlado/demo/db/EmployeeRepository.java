package com.vlado.demo.db;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Employee getEmployeeByName(String name);

    public Employee getEmployeeByDept(String dept);

    public List<Employee> findAllByDept(String dept);

    public List<Employee> findAllByDeptAndName(String dept, String name);

}
