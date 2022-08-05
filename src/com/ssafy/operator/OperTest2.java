package com.ssafy.operator;


// 가위(0), 바위(1), 보(2)
public class OperTest2 {
	public static void main(String[] args) {
		int my = 2;
		int com = 1;
//		String[] gbbSt = {"가위", "바위", "보"};
		
		int result = (my - com + 2) % 3;
		
		String str = result == 0 ? "이겼다" : result == 1? "졌다": "비겼다";
		
		System.out.println(str);
	}

}
