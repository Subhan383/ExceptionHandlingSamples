package com.org.exceptionhandling;

import java.io.FileNotFoundException;

public class UserdefinedException extends Throwable {

	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException is handled");
		} catch (UserdefinedException e) {
			System.out.println("UserdefinedException is handled");
		}

		catch (Exception e) {
			System.out.println("Exception is handled");
		}

	}

	public static void method() throws Exception,UserdefinedException {
		int x = 3;
		switch (x) {
		case 1:
			throw new FileNotFoundException();
		case 2:
			throw new Exception();
			
			default:
				throw new UserdefinedException();
		}
	}

}
