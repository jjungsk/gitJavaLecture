package com.ssafy.exception.runtime;

public class ArithmaticException {
	
	public static void main(String[] args) {
		int x = 10;
//		int n = (int)(Math.random() * 3);
		int n = (int)(Math.random() * 2) + 1;
		int z = x / n;
		System.out.println(z);
		
	}

}
