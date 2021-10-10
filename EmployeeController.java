package com.poc.poconjwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.poconjwt.model.Employee;
import com.poc.poconjwt.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;

	@GetMapping(path="/employees", produces = "application/json")
	public Employee[] getEmployees( ) {
		return empService.getAllEmployees(); //String.format("Hello %s!");
	}
	
	@GetMapping(path="/employee", produces = "application/json")
	public Employee getEmployee( ) {
		return empService.getEmployee(); //String.format("Hello %s!");
	}
}
