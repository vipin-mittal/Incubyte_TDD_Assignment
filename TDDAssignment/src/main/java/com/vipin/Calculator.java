package com.vipin;

public class Calculator {
	public static int add(String numbers) {
		if(numbers=="") {
			return 0;
		}
		return Integer.parseInt(numbers);
	}
}
