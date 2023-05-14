package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.dto.EmployeeDTO;
import com.employee.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	private EmployeeRepository empRepo;
    
	
    @Override
	public void insertEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
    	empRepo.saveAndFlush(EmployeeDTO)
		
	}
	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeDTO getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
