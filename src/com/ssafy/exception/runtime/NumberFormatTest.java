package com.ssafy.exception.runtime;

public class NumberFormatTest {
	public static void main(String[] args) {
//		String numStr = " 1 0 ";
//		String numStr = "10";
		String numStr = null;
		if (isNumber(numStr)) {
			int num = Integer.parseInt(numStr);
			System.out.println("10년 후 나이 : " + (num + 10));			
		}
		else
			System.out.println("나이는 숫자만!");
	}
	
	private static boolean isNumber(String numStr) {
		// NullPointerException 처리.. 왠만하면!!
		if (numStr == null)
			return false;
		
		// 숫자가 아닌 경우 처리
		int len = numStr.length();
		for (int i = 0; i < len; i++) {
			int n = numStr.charAt(i) - 48;
			if (n < 0 || n > 9)
				return false;
		}
		return true;
	}
	
}
