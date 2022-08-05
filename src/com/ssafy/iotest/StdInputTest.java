package com.ssafy.iotest;

import java.io.IOException;
import java.util.Arrays;

// 표준 입출력.
public class StdInputTest {
	
	public static void main(String[] args) {
		try {
			System.out.print("입력 : ");
//			int x = System.in.read();
//			System.out.println("x : " + x);
//			System.out.println("x : " + (char)x);
			
			byte[] b = new byte[100];
			int x = System.in.read(b);
			System.out.println("x : " + x + "bytes read");
			String s = new String(b, 0, x - 2);
			System.out.println(s);
			System.out.println(s.length());
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
