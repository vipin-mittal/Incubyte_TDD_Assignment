package com.vipin;

public class Calculator {
	public static int add(String numbers) {
		if(numbers=="") {
			return 0;
		}else {
			String num = numbers.replaceAll("\n", ",");
			String numberList[]=num.split(",");
			return addNumberList(numberList);
		}
	}

	private static int addNumberList(String[] numberList) {
		int addition=0;
		for(String digits : numberList) {
			int digit=Integer.parseInt(digits);
			addition+=digit;
		}
		return addition;
	}
	public static void main(String args[]) {
		System.out.println(add("1\n2,3"));
	}
}
