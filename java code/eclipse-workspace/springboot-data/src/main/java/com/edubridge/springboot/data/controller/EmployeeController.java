package com.edubridge.springboot.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.edubridge.springboot.data.entities.Employee;
import com.edubridge.springboot.data.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/emp/add")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}


@GetMapping("/emp/employees")
public List<Employee> getAllEmployee(){
	return employeeService.getAllEmployee();
	
}
}
