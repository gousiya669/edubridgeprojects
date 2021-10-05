package com.edubridge.springboot.hello.service;

import com.edubridge.springboot.hello.entities.CalculateNumbers;

public interface CalculateService {

	public int add(int num1, int num2);
	public int sub(int num1, int num2);
	public int mul(int num1, int num2);
	public int div(int num1, int num2);
	public int add(CalculateNumbers numbers);
}
