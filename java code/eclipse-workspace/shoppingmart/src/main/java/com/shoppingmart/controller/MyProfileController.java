package com.shoppingmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.shoppingmart.entities.MyProfile;
import com.shoppingmart.service.MyProfileService;



@RestController
public class MyProfileController {
	@Autowired
	MyProfileService myprofileservice;
	
	
	 /*
	  * TODO: adding profile
	  */
	@PostMapping("/profile/add")
	public MyProfile saveMyProfile(@RequestBody MyProfile myprofile) {
		return myprofileservice.saveMyProfile(myprofile);
	}
	
	 /*
	  * TODO: Get my profile
	  */
	@GetMapping("/profile/allprofiles")
	public List<MyProfile> getAllMyProfile(){
		return myprofileservice.getAllMyProfiles();
	}

	 /*
	  * TODO:update profile using  id
	  */
	
	@PutMapping("/profile/{id}")
	public ResponseEntity<MyProfile> updateMyProfile(@PathVariable(value = "id") int regid,
			@RequestBody MyProfile myprofile){
		MyProfile updateMyProfile = myprofileservice.updateMyProfile(regid, myprofile);
		return new ResponseEntity<MyProfile>(updateMyProfile,HttpStatus.OK);
		
	
}
	
}
