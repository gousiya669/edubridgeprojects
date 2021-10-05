package com.capgemini.placementsmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.placementsmgmt.entities.ApplyJobs;
import com.capgemini.placementsmgmt.service.ApplyJobsService;


@RestController 

public class ApplyJobsController {
	@Autowired
	ApplyJobsService applyjobsService;
	
	@PostMapping("/job/add")
	public ApplyJobs saveApplyJobs(@RequestBody ApplyJobs applyjobs) {
		return applyjobsService.saveApplyJobs(applyjobs);
	}


@GetMapping("/job/appjob")
public List<ApplyJobs> getAllApplyJobs(){
	return applyjobsService.getAllApplyJobs();
	
}
	

}
