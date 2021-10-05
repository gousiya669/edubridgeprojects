package com.edubridge.springboot.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.springboot.placementmanagement.entities.StudentAttendance;
import com.edubridge.springboot.placementmanagement.service.StudentAttendanceService;

@RestController
public class StudentAttendanceController {

	
	@Autowired
	StudentAttendanceService studentAttendanceService;
	
	@PostMapping("/attend/add")
	public StudentAttendance saveStudentAttendance(@RequestBody StudentAttendance studentAttendance ) {
		return studentAttendanceService.saveStudentAttendance(studentAttendance);
	}
	@GetMapping("/attend/studentAttendance")
	public List<StudentAttendance> getAllStudentAttendance(){
		return studentAttendanceService.getAllStudentAttendances();
	}
	@GetMapping("/attend/{studId}")
	public StudentAttendance getStudentAttendanceById(@PathVariable int studId){
		return studentAttendanceService.getStudentAttendanceById(studId);
	}
	
	@DeleteMapping("/attend/{studId}")
	public String deleteStudentAttendanceById(@PathVariable int studId) {
		studentAttendanceService.deleteStudentAttendanceById(studId);
		return "Student Deleted";
	}

}
