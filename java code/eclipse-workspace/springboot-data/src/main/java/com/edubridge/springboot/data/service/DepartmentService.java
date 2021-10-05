package com.edubridge.springboot.data.service;

import java.util.List;

import com.edubridge.springboot.data.entities.Department;

public interface DepartmentService {
	public Department saveDepartment(Department department);
	public List<Department> getAllDepartments();
	public Department getDepartmentById(int deptId);
	public void deleteDepartmentById(int deptId);
	public Department updateDepartment(int deptId , Department department);
	
	

}
