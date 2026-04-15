package com.cfs.EmployeeMngt01.service;

import com.cfs.EmployeeMngt01.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(Integer id);
    Employee updateEmployee(Integer id,Employee employee);
    void deleteEmployee(Integer id);
}
