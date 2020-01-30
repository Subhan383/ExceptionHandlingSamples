package com.org.exceptionhandling;

import java.io.FileNotFoundException;

public class ThrowandThrows {

	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception is handled");
		}
		
	}
		public static void method() throws Exception {
			System.out.println("This methos is going to execute");
			throw new FileNotFoundException();
		}

	}


