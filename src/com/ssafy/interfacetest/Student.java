package com.ssafy.interfacetest;

public class Student {
	
	public static void main(String[] args) {
		
		double width = 4.0;
		double height = 5.0;
		Rect r1 = new Rect(width, height);
		System.out.println("가로가 " + r1.getWidth() + "이고 세로가 " + r1.getHeight() + "인 사각형의 넓이는 "
				+ Math.round(r1.calcArea()*100/100.0) +"이고 둘레는 " + Math.round(r1.calcRound()*100) / 100.0 + "입니다.");
		
		double radius = 3.0;
		Circle c1 = new Circle(radius);
		System.out.println("반지름의 길이가 " + c1.getRadius() + "이고 둘레는 "+ Math.round(c1.calcRound()*100) / 100.0 + "입니다.");
		
	}

}
