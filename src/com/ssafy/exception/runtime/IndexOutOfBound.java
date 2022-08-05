package com.ssafy.exception.runtime;

public class IndexOutOfBound {
	
	public static void main(String[] args) {
		// ArrayIndexOfBoundsException
//		int[] x = new int[3];
//		for (int i = 0; i <= 3; i++)
//			System.out.println(x[i]);
		
		// StringIndexOutOfBoundsException
		String s = "abc";
		int len = s.length();
		for (int i = 0; i <= 3; i++) {
			System.out.println(s.charAt(i));
			
		}
	}

}
