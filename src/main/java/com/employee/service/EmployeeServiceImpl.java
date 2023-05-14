package com.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.exception.EmployeeException;
import com.employee.repository.EmployeeRepository;

import jakarta.persistence.Id;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	private EmployeeRepository empRepo;
    
	
    
	
	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		empRepo.deleteById(null);
		
	}

	@Override
	public EmployeeDTO getEmployee(Integer id) throws EmployeeException {
	    Optional<Employee> optional = empRepo.findById(id);
	    
	         Employee employee = optional.orElseThrow(()-> new EmployeeException("Service.EMPLOYEE_NOT_FOUND"));
	         EmployeeDTO employee2= new EmployeeDTO();
	         employee2.setEmpId(employee.getEmpId());
	         employee2.setDob(employee.getDob());
	         employee2.setEmpName(employee.getEmpName());
	         employee.setEmpRole(employee.getEmpRole());
	         employee2.setGender(employee.getGender());
	         employee2.setSalary(employee.getGender());
		return employee2;
	}

	

}
