package com.edubridge.springboot.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.data.entities.Department;
import com.edubridge.springboot.data.entities.Employee;
import com.edubridge.springboot.data.repository.EmployeeRepository;
@Service 

public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepo;
	@Autowired
	DepartmentService  departmentService;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Department department = employee.getDepartment();
		Department d1 = departmentService.getDepartmentById(department.getDeptId());
		employee.setDepartment(d1);
		return employeeRepo.save(employee);
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}
	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Employee updateDepartment(int deptId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
