package com.edubridge.add.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.edubridge.add.addition;

class AdditionTest {

	@Test
	void test() {
		assertsEquals("hellow","hellow");
	}
	@Test
	Void test2Numbers() {
		addition objAdd = new addition();
		int sum = objAdd.add(10, 40);
		System.out.println("sum is : " +sum);
	}

}
