package com.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.exception.EmployeeException;
import com.employee.repository.EmployeeRepository;

import jakarta.persistence.Id;

@Service(value="employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	private EmployeeRepository empRepo;
    
	@Override
	public EmployeeDTO getEmployee(Integer id) throws EmployeeException {
	    Optional<Employee> optional = empRepo.findById(id);
	    
	         Employee employee = optional.orElseThrow(()-> new EmployeeException("Service.EMPLOYEE_NOT_FOUND"));
	         EmployeeDTO employee2= new EmployeeDTO();
	         employee2.setEmpId(employee.getEmpId());
	         employee2.setDob(employee.getDob()); 
	         employee2.setEmpName(employee.getEmpName());
	         employee2.setEmpRole(employee.getEmpRole());
	         employee2.setGender(employee.getGender());
	         employee2.setSalary(employee.getSalary());
	         if(employee2==null) {
	        	 
	         }
		return employee2;
	}

	@Override
	public Integer addEmployee(EmployeeDTO employee) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee employeeEntity = new Employee();
		employeeEntity.setEmpId(employee.getEmpId());
		employeeEntity.setEmpName(employee.getEmpName());
		employeeEntity.setDob(employee.getDob());
		employeeEntity.setEmpRole(employee.getEmpRole());
		employeeEntity.setSalary(employee.getSalary());
		employeeEntity.setGender(employee.getGender());
		
	
		Employee empEntity = empRepo.save(employeeEntity);
		return empEntity.getEmpId() ;
	}

	@Override
	public void removeEmployee(Integer id) throws EmployeeException {
		empRepo.deleteById(id);
		
	}

	

}
