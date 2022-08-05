package com.ssafy.abstracttest;

import java.io.IOException;

public class ProcessTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// 3. 외부 클래스 사용.
		Runtime r = Runtime.getRuntime();
		Process p1 = r.exec("calc.exe");
		
		Process p2 = Runtime.getRuntime().exec("notepad.exe");
		
		
	}

}
