package com.capgemini.placementsmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.placementsmgmt.entities.MyProfile;
import com.capgemini.placementsmgmt.service.MyProfileService;

@RestController

public class MyProfileController {
	@Autowired
	MyProfileService MyProfileService;
	@PostMapping("/myprofile/add")
	public MyProfile saveMyProfile(@RequestBody MyProfile myprofile) {
		return MyProfileService.saveMyProfile(myprofile);
	}


@GetMapping("/myprofile/data")
public List<MyProfile> getAllMyProfile(){
	return MyProfileService.getAllMyProfile();
	
}

}

