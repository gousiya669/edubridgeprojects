package com.shoppingmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingmart.entities.MyBooking;
import com.shoppingmart.entities.MyProfile;
import com.shoppingmart.service.MyProfileService;



@Controller
public class MyProfileViewController {
	@Autowired
	MyProfileService myprofileservice;
	
	
//	@RequestMapping("/")
//	public String viewHomePage(Model model) {
//		List<MyBooking> mybookingList = mybookingservice.getAllMyBookings();
//		model.addAttribute("mybookingList", mybookingList);
//		return "index";
//	}
	
	
	
	
	
	@RequestMapping("/")
	public String viewprofilepage(Model model) {
		List<MyProfile> myprofileList = myprofileservice.getAllMyProfiles();
		model.addAttribute("myprofileList", myprofileList);
		return "index";
	}
	
	
	
	
	@RequestMapping(value = "/saveprofile", method = RequestMethod.POST)
	public String saveMyProfile(@ModelAttribute("myprofile") MyProfile myprofile) {
		myprofileservice.saveMyProfile(myprofile);
		return "redirect:/";
	}
	
	
	@RequestMapping("/myprofile/{id}")
	public ModelAndView showEditMyProfilePage(@PathVariable(name="id") int regid) {
		 ModelAndView mav=new  ModelAndView("edit_myprofile");
		 MyProfile myprofile =myprofileservice.getMyProfileById(regid);
		 mav.addObject("myprofile", myprofile);
		 return mav;
		 
		 }
	
	
}
