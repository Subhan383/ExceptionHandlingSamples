package com.org.exceptionhandling;

public class Arithmetic {

	public static void main(String[] args) {
		int x = 2, y = 0;

		try {
			System.out.println("Division of two values x and y is" + (x / y));
		} catch (ArithmeticException e) {

			System.out.println("Y value cannot be zero");
		} catch (Exception e) {
			System.out.println("Exception handled");
		}

	}

}
