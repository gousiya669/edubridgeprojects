package com.edubridge.springboot.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.data.entities.Department;
import com.edubridge.springboot.data.exceptions.RecordNotFoundException;
import com.edubridge.springboot.data.repository.DepartmentRepository;

@Service
public class DepartmentServiceimpl implements DepartmentService {
@Autowired
DepartmentRepository departmentRepo;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepo.findAll();
	}

	
	@Override
	public void deleteDepartmentById(int deptId) {
		Department department = getDepartmentById(deptId);
		departmentRepo.delete(department);
		
	}

	@Override
	public Department getDepartmentById(int deptId) {
		// TODO Auto-generated method stub
		return departmentRepo.findById(deptId)
				.orElseThrow(() -> new RecordNotFoundException("Department with ID"+deptId+" not found"));
	}

	@Override
	public Department updateDepartment(int deptId, Department department) {
		// TODO Auto-generated method stub
		Department d1 = getDepartmentById(deptId);
		d1.setDeptName(department.getDeptName());
		
		return departmentRepo.save(d1);
	}
	

}
