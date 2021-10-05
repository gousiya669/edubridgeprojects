package com.edubridgetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.edubridge.Swap.Swap;

class SwapTest {

	@Test
	void testSwapWith2Chars() {
		Swap objSwap = new Swap();
		assertEquals("CD", objSwap.swap("DC"));
	}
	@Test
	void testSwapWith4Chars() {
		Swap objSwap=new Swap();
		assertEquals("ABCD", objSwap.swap("ABCD"));
	}
	@Test
	void testSwapWithMoreChars () {
		Swap objSwap=new Swap();
		assertEquals("AZMINA", objSwap.swap("AZMINA"));
	}
	@Test
	void testSwapWith1Chars () {
		Swap objSwap=new Swap();
		assertEquals("A", objSwap.swap("A"));
	}
	
}
