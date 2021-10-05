package com.edubridge.springboot.placementmanagement.service;

import java.util.List;


import com.edubridge.springboot.placementmanagement.entities.StudentAttendance;

public interface StudentAttendanceService {

	public StudentAttendance saveStudentAttendance(StudentAttendance studentAttendance);
	
	public List<StudentAttendance> getAllStudentAttendances();
	

	public StudentAttendance getStudentAttendanceById(int studId);

	public void deleteStudentAttendanceById(int studId);
}
