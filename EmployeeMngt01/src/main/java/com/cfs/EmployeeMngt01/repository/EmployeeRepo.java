package com.cfs.EmployeeMngt01.repository;

import com.cfs.EmployeeMngt01.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
