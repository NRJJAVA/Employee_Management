package com.employee.service;

import com.employee.dto.EmployeeDTO;

public interface EmployeeService {
public void insertEmployee(EmployeeDTO employee);
public void removeEmployee();
public EmployeeDTO getEmployee(int id);


}
