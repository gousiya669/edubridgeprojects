package com.capgemini.placementsmgmt.service;

import java.util.List;

import com.capgemini.placementsmgmt.entities.MyProfile;


public interface MyProfileService {
	

public MyProfile saveMyProfile(MyProfile myprofile);
	public List<MyProfile> getAllMyProfile();
}