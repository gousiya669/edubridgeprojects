package com.edubridge.springboot.hello.service;

import org.springframework.stereotype.Service;


import com.edubridge.springboot.hello.entities.CalculateNumbers;

@Service
public class CalculateServiceImpl implements CalculateService {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1+num2);
	}
	public int sub(int num1, int num2) {
		return (num1-num2);
	}
	
	public int mul(int num1, int num2) {
		return (num1*num2);
}
	public int div(int num1, int num2) {
		return (num1/num2);
}
	
	public int add(CalculateNumbers numbers) {
		// TODO Auto-generated method stub
		return (numbers.getNum1()+numbers.getNum2());
	}
}