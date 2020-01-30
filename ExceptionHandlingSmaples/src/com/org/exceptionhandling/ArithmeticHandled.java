package com.org.exceptionhandling;

public class ArithmeticHandled {

	public static void main(String[] args) {

		ArithmeticHandled a1 = new ArithmeticHandled();
		a1.case1(10, 0);
	}

	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println(x / y);
		} else {
			System.out.println("Value of Y cannot be zero");
		}       

	}

}
