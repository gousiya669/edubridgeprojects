package com.edubridge.springboot.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edubridge.springboot.data.entities.Department;
import com.edubridge.springboot.data.service.DepartmentService;

@Controller

public class DepartmentViewController {
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Department> departmentList = departmentService.getAllDepartments();
		model.addAttribute("departmentList",departmentList);
		return "index";
		
	}
	@RequestMapping("/new")
	public String showNewDepartmentPage(Model model) {
		Department department = new Department();
		model.addAttribute("department",department);
		return "new_Department";
	}
	@RequestMapping(value="/save",method= RequestMethod.POST)
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
	}
	@RequestMapping("/delete/{id}")
	public String deleteDepartment(@PathVariable (name = "id") int deptId) {
		departmentService.deleteDepartmentById(deptId);
		return "redirect:/";
	}

}
