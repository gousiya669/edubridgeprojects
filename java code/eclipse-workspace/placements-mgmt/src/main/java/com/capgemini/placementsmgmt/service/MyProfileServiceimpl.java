package com.capgemini.placementsmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.placementsmgmt.entities.MyProfile;
import com.capgemini.placementsmgmt.repository.MyProfileRepository;

@Service
public class MyProfileServiceimpl implements MyProfileService {
	@Autowired
	MyProfileRepository myprofileRepo;

	@Override
	public MyProfile saveMyProfile(MyProfile myprofile) {
		
		return myprofileRepo.save(myprofile);
	}

	@Override
	public List<MyProfile> getAllMyProfile() {
		
		return myprofileRepo.findAll();
	}

	

}
