package com.shoppingmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingmart.entities.MyBooking;
import com.shoppingmart.entities.MyProfile;
import com.shoppingmart.repository.MyProfileRepository;


@Service
public class MyProfileServiceImpl implements MyProfileService {

	@Autowired
	MyProfileRepository myprofilerepo;
	
	@Override
	public MyProfile saveMyProfile(MyProfile myprofile) {
		// TODO Auto-generated method stub
		return myprofilerepo.save(myprofile);
	}

	@Override
	public List<MyProfile> getAllMyProfiles() {
		// TODO Auto-generated method stub
		return myprofilerepo.findAll();
	}

	@Override
	public MyProfile getMyProfileById(int regid) {
		// TODO Auto-generated method stub
		return myprofilerepo.findById(regid).get();
	}

	@Override
	public MyProfile updateMyProfile(int regid, MyProfile myprofile) {
		// TODO Auto-generated method stub
		MyProfile p1 = getMyProfileById(regid);
		p1.setFirstname(myprofile.getFirstname());
		p1.setLastname(myprofile.getLastname());
		p1.setEmail(myprofile.getEmail());
		p1.setMobilenumbers(myprofile.getMobilenumbers());
		p1.setGender(myprofile.getGender());
		
		return myprofilerepo.save(p1);
	}

}
