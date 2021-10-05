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

import com.shoppingmart.service.MyBookingService;
@Controller
public class MyBookingViewController {
	@Autowired
	MyBookingService mybookingservice;
	
	

	
	@RequestMapping("/mybooking")
	public String viewbookingpage(Model model) {
		List<MyBooking> mybookingList = mybookingservice.getAllMyBookings();
		model.addAttribute("mybookingList", mybookingList);
		return "mybooking";
	}
	
	
	
	
	@RequestMapping("/new")
	public String showNewMyBookingPage(Model model) {
		MyBooking mybooking = new MyBooking();
		model.addAttribute("mybooking", mybooking);
		return "new_MyBooking";
	}
	
	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveMyBooking(@ModelAttribute("mybooking") MyBooking mybooking) {
		mybookingservice.saveMyBooking(mybooking);
		return "redirect:/mybooking";
	}
	
	
	
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditMyBookingPage(@PathVariable(name="id") int bkgid) {
		 ModelAndView mav=new  ModelAndView("edit_mybooking");
		 MyBooking mybooking =mybookingservice.getMyBookingById(bkgid);
		 mav.addObject("mybooking", mybooking);
		 return mav;
		 
		 }
	
	
	@RequestMapping("/delete/{id}")
	public String deleteMyBooking(@PathVariable(name="id") int bkgid) {
		mybookingservice.deleteMyBookingById(bkgid);
		return "redirect:/mybooking";
	}

	
}
