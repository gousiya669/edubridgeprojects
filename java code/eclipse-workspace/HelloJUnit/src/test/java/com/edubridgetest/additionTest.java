package com.edubridgetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.edubridge.add.addition;


class additionTest {

	@Test
	void test() {
		assertEquals("hellow","hellow");
		
	}
	@Test
	void test2Numbers() {
		addition objAdd = new addition();
		int sum = objAdd.add(10, 40);
		System.out.println("sum is : " +sum);
	}
}
