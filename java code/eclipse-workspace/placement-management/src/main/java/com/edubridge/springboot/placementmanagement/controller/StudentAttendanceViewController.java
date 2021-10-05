package com.edubridge.springboot.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edubridge.springboot.placementmanagement.entities.StudentAttendance;
import com.edubridge.springboot.placementmanagement.service.StudentAttendanceService;



@Controller
public class StudentAttendanceViewController {

	
	@Autowired
	StudentAttendanceService student_attendanceservice;
	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<StudentAttendance> student_attendanceList = student_attendanceservice.getAllStudentAttendances();
		model.addAttribute("student_attendanceList", student_attendanceList);
		return "index";
	}
	
}
