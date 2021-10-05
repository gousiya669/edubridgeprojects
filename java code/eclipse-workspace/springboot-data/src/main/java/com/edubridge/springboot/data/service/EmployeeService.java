package com.edubridge.springboot.data.service;

import java.util.List;

import com.edubridge.springboot.data.entities.Employee;



public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId);
	public void deleteEmployeeById(int empId);
	public Employee updateDepartment(int deptId , Employee employee);
	

}
