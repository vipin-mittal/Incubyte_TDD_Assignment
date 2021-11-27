package com.vipin.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vipin.Calculator;

public class CalculatorTest {

	@Test
	public void test1() {
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testForOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void testForTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void testForFourNumbers() {
		assertEquals(10, Calculator.add("1,2,3,4"));
	}

}
