package com.capgemini.placementsmgmt.service;

import java.util.List;



import com.capgemini.placementsmgmt.entities.Education;


public interface EducationService {
	public Education  saveEducation(Education education);
	public List<Education> getAllEducation();


}
