package com.edubridge.springboot.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hello, Spring Boot!!";
	}
	@RequestMapping("/Gayathri")
	public String sayGayathri() {
		return "Hello, Gayathri!";
	}
	@GetMapping("/hello")
	public String sayHelloUser(@RequestParam(name="userName") String name,@RequestParam(name="id") String id) {
		return "Hello, "+name+",your id is:"+id+"!!";
	}
	
	@GetMapping("/addition")
	public String additionOfTwo(@RequestParam(name="num1")int num1,@RequestParam (name="num2") int num2){
		return "Addition is :"+(num1+num2);
		
	}
	
}

