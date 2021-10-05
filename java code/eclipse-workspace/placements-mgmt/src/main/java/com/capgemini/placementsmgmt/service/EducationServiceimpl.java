package com.capgemini.placementsmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.placementsmgmt.entities.Education;
import com.capgemini.placementsmgmt.repository.EducationRepository;

@Service 

public class EducationServiceimpl implements EducationService  {
	@Autowired  
	EducationRepository educationRepo;

	@Override
	public Education saveEducation(Education education) {
		
		return  educationRepo.save(education);
	}

	@Override
	public List<Education> getAllEducation() {
		
		return educationRepo.findAll();
	}

}
