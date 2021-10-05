package com.capgemini.placementsmgmt.service;

import java.util.List;

import com.capgemini.placementsmgmt.entities.ApplyJobs;


public interface ApplyJobsService {
	public ApplyJobs  saveApplyJobs(ApplyJobs applyjobs);
	public List<ApplyJobs> getAllApplyJobs();

}
