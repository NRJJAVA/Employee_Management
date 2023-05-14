package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.Employee;

import jakarta.persistence.Id;

public interface EmployeeRepository extends JpaRepository<Employee, Id>{
     
}
