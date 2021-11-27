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
	
	@Test
	public void testForNewLine() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}
	
	@Test
	public void testForDifferentDelimiter() {
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

}
