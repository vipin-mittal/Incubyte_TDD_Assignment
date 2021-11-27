package com.vipin;

public class Calculator {
	public static int add(String numbers){
		if (numbers == "") {
			return 0;
		} else {
			String delimiter = ",";
			if (numbers.matches("[/]{2}(.*)\n(.*)")) {
				delimiter = Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
			}
			String num = numbers.replaceAll("\n", delimiter);
			String numberList[] = num.split(delimiter);
				return addNumberList(numberList);
		}
	}

	private static int addNumberList(String[] numberList) {
		int addition = 0;
		for (String digits : numberList) {
			int digit = Integer.parseInt(digits);
			if (digit < 0) {
				throw new IllegalArgumentException("negatives not allowed "+digit);
			}
			addition += digit;
		}
		return addition;
	}
}
