package com.edubridge.springboot.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.springboot.hello.entities.Employee;
import com.edubridge.springboot.hello.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/emp/add")
	public String saveEmployee(@RequestBody Employee emp) {
		employeeService.saveEmployee(emp);
		return "Emp Added";
	}
	
	@GetMapping("/emp/allEmp")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

}
