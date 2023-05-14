package com.employee.service;

import com.employee.dto.EmployeeDTO;
import com.employee.exception.EmployeeException;

public interface EmployeeService {
//public void insertEmployee(EmployeeDTO employee);
public void removeEmployee();
public EmployeeDTO getEmployee(Integer id) throws EmployeeException;


}
