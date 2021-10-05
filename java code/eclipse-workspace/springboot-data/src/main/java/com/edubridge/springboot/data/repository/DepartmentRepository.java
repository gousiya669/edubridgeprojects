package com.edubridge.springboot.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.springboot.data.entities.Department;
@Repository

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
