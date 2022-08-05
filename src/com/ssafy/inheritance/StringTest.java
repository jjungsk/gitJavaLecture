package com.ssafy.inheritance;

public class StringTest {
	
	public static void main(String[] args) {
		String s1 = "SSAFY";
		String s2 = "SSAFY";
		String s3 = new String("SSAFY");
		String s4 = new String("SSAFY");
		
		if (s1 == s2)
			System.out.println("s1와 s2는 주소값이 같다"); // O
		if (s1 == s3)
			System.out.println("s1, s3같다"); // X
		if (s1 == s4)
			System.out.println("s1, s4같다"); // X
		if (s2 == s3)
			System.out.println("s2, s3같다"); // X
		if (s2 == s4)
			System.out.println("s2, s4같다"); // X
		if (s3 == s4)
			System.out.println("s3, s4같다"); // X
		
		System.out.println("-------------------------------------");
		
		if (s1.equals(s2))
			System.out.println("s1, s2 문자열이 같다"); // O
		if (s1.equals(s3))
			System.out.println("s1, s3 문자열이 같다"); // O
		if (s1.equals(s4))
			System.out.println("s1, s4 문자열이 같다"); // O
		if (s2.equals(s2))
			System.out.println("s2, s3 문자열이 같다"); // O
		if (s2.equals(s3))
			System.out.println("s2, s4 문자열이 같다"); // O
		if (s3.equals(s4))
			System.out.println("s3, s4 문자열이 같다"); // O
		
		
	}

}
