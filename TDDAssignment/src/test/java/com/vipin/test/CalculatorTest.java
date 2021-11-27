package com.vipin.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vipin.Calculator;

public class CalculatorTest {

	@Test
	public void test1() {
		assertEquals(0, Calculator.add(""));
	}

}
