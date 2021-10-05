package com.edubridge.springboot.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.springboot.data.entities.Department;
import com.edubridge.springboot.data.exceptions.InvalidInputException;
import com.edubridge.springboot.data.service.DepartmentService;

@RestController


public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	@PostMapping("/dept/add")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}


@GetMapping("/dept/departments")
public List<Department> getAllDepartment(){
	return departmentService.getAllDepartments();
	
}
@GetMapping("/dept/{deptId}")
public ResponseEntity<Department> getDepartmentById(@PathVariable int deptId) {
	System.out.println(deptId);
	if(deptId <=0) {
		throw new InvalidInputException(deptId+" not a valid Department ID");
	}
	Department department = departmentService.getDepartmentById(deptId);
	return new ResponseEntity<Department>(department,HttpStatus.OK);
	
}

@DeleteMapping("/dept/{deptId}")
public String deleteDepartmentById(@PathVariable int deptId) {
departmentService.deleteDepartmentById(deptId);
return "Department Deleted";
}
@PutMapping("/dept/{id}")
public ResponseEntity<Department> updateDepartment(@PathVariable(value = "id") int deptId,
		@RequestBody Department department){
	Department updateDepartment = departmentService.updateDepartment(deptId, department);
	return new ResponseEntity<Department>(updateDepartment,HttpStatus.OK);
	
}
}