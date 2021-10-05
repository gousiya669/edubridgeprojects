package com.capgemini.placementsmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.placementsmgmt.entities.ApplyJobs;
import com.capgemini.placementsmgmt.repository.ApplyJobsRepository;

@Service

public class ApplyJobsServiceimpl implements ApplyJobsService {
	@Autowired 
	ApplyJobsRepository applyjobsRepo;

	@Override
	public ApplyJobs saveApplyJobs(ApplyJobs applyjobs) {
		
		return  applyjobsRepo.save(applyjobs);
	}

	@Override
	public List<ApplyJobs> getAllApplyJobs() {
		
		return applyjobsRepo.findAll();
	}

}
