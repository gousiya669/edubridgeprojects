package com.edubridge.springboot.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.springboot.hello.entities.CalculateNumbers;
import com.edubridge.springboot.hello.service.CalculateService;

@RestController
public class CalculateController {

	@Autowired
	CalculateService calculateService;
	@GetMapping("/calc/additionrp")
	public String additionRP(@RequestParam(name="num1")int num1,@RequestParam (name="num2") int num2){
		return "Addition is :"+(num1+num2);
		
	}
	@GetMapping("/calc/additionpv/{num1}/{num2}")
	public String additionPV(@PathVariable int num1, @PathVariable int num2) {
		return "Addition:"+calculateService.add(num1,num2);
	}
	
	@GetMapping("/calc/subtractionpv/{num1}/{num2}")
	public String subtractionPV(@PathVariable int num1, @PathVariable int num2) {
		return "Subtraction:"+calculateService.sub(num1,num2);
	}
	@GetMapping("/calc/multiplicationpv/{num1}/{num2}")
	public String multiplicationPV(@PathVariable int num1, @PathVariable int num2) {
		return "Multiplication:"+calculateService.mul(num1,num2);
}
	@GetMapping("/calc/divisionpv/{num1}/{num2}")
	public String divisionPV(@PathVariable int num1, @PathVariable int num2) {
		return "Division:"+calculateService.div(num1,num2);
}
	@PostMapping("/calc/addPost")
	public String addUsingMethod(@RequestBody CalculateNumbers numbers) {
		System.out.println(numbers);
		return "Addition:"+calculateService.add(numbers);
	}
}