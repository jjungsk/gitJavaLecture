package com.ssafy.exception.runtime;

import java.util.Random;

public class NullPointerExceptionTest {
	
	Random random = new Random();
	
	public static void main(String[] args) {
		NullPointerExceptionTest npet = new NullPointerExceptionTest();
		
		String msg = npet.getMessage();
		if (msg != null)
			System.out.println("msg의 길이 : " + msg.length());
	}
	
	private String getMessage() {
		int num = random.nextInt();
		if (num % 2 == 0)
			return "짝수입니다.";
		return null;
	}

}
