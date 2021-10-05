package com.edubridge.springboot.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.placementmanagement.entities.StudentAttendance;
import com.edubridge.springboot.placementmanagement.repository.StudentAttendanceRepository;

@Service
public class StudentAttendanceServiceImpl  implements StudentAttendanceService{

	@Autowired
	StudentAttendanceRepository studentAttendanceRepo;
	
	@Override
	public StudentAttendance saveStudentAttendance(StudentAttendance studentAttendance) {
		
		return studentAttendanceRepo.save(studentAttendance );
	}

	@Override
	public List<StudentAttendance> getAllStudentAttendances() {
		
		return studentAttendanceRepo.findAll();
	}

	@Override
	public StudentAttendance getStudentAttendanceById(int studId) {
		// TODO Auto-generated method stub
		return studentAttendanceRepo.findById(studId).get();
	}

	@Override
	public void deleteStudentAttendanceById(int studId) {
		
		 studentAttendanceRepo.deleteById(studId);
		
	}

	
}
