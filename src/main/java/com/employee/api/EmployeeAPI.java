package com.employee.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.dto.EmployeeDTO;
import com.employee.exception.EmployeeException;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/employees")
public class EmployeeAPI {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private  Environment environment;
	
	@PostMapping(value="/employee")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDTO employee) throws EmployeeException{
		Integer addEmployee = empService.addEmployee(employee);
		String successMessage= environment.getProperty("API.INSERT_SUCCESS") +addEmployee;
		return new ResponseEntity<>(successMessage,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/employee/{empid}")
	public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer empid) throws EmployeeException{
		
		EmployeeDTO employee = empService.getEmployee(empid);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	@DeleteMapping(value="/employee/{empid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("empid") Integer empid) throws EmployeeException{
	    empService.removeEmployee(empid);
		String message= environment.getProperty("API.DELETE_SUCCESS") +empid;
		return new ResponseEntity<>(message, HttpStatus.OK);
		 
	}

}
