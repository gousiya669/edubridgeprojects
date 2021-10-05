package com.shoppingmart.service;

import java.util.List;

import com.shoppingmart.entities.MyBooking;
import com.shoppingmart.entities.MyProfile;


public interface MyProfileService {
public MyProfile saveMyProfile(MyProfile myprofile);
	
	public List<MyProfile> getAllMyProfiles();

	public MyProfile getMyProfileById(int regid);
	
	
	public MyProfile updateMyProfile(int regid , MyProfile myprofile);

}
