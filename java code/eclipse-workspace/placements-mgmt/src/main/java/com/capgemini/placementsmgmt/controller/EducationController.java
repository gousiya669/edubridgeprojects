package com.capgemini.placementsmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.placementsmgmt.entities.Education;
import com.capgemini.placementsmgmt.service.EducationService;

@RestController 
public class EducationController {
	@Autowired
	EducationService  EducationService;
	@PostMapping("/edu/add")
	public Education  saveEducation(@RequestBody Education education) {
		return EducationService.saveEducation(education);
	}


@GetMapping("/edu/data")
public List<Education> getAllEducation(){
	return EducationService.getAllEducation();
	
}

}
