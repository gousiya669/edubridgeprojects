package com.capgemini.placementsmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.placementsmgmt.entities.MyProfile;
import com.capgemini.placementsmgmt.service.MyProfileService;



public class MyProfileViewController {
	@Autowired
	MyProfileService  myprofileService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<MyProfile > myprofileList = myprofileService.getAllMyProfile();
		model.addAttribute("myprofileList",myprofileList);
		return "index";
		
	}
	@RequestMapping("/new")
	public String showNewMyProfilePage(Model model) {
		MyProfile myprofile = new MyProfile();
		model.addAttribute("myprofile",myprofile);
		return "new_MyProfile";
	}
	/*@RequestMapping(value="/save",method= RequestMethod.POST)
	public String saveDepartment(@ModelAttribute("department") Department department) {
		departmentService.saveDepartment(department);
		return "redirect:/";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditDepartmentPage(@PathVariable(name = "id") int deptId) {
		ModelAndView mav = new ModelAndView("edit_department");
		Department department = departmentService.getDepartmentById(deptId);
		mav.addObject("department",department);
		return mav;
	}*/

}
