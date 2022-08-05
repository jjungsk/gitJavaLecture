package com.ssafy.abstracttest;

public class Student {
	
	public static void main(String[] args) {
		
		double width = 4.0;
		double height = 5.0;
		Rect r1 = new Rect(width, height);
		System.out.println("가로가 " + r1.getWidth() + "이고 세로가 " + r1.getHeight() + "인 사각형의 넓이는 "
				+ Math.round(r1.calcArea()*100/100.0) +"이고 둘레는 " + Math.round(r1.calcRound()*100) / 100.0 + "입니다.");
		
		double radius = 3.0;
		Circle c1 = new Circle(radius);
		System.out.println("반지름의 길이가 " + c1.getRadius() + "인 원의 넓이는 "
				+ Math.round(c1.calcArea()*100) / 100.0 + "이고 둘레는 "+ Math.round(c1.calcRound()*100) / 100.0 + "입니다.");
		
//		Dohyung d1 = new Dohyung();
		Dohyung d1 = new Rect(4, 5); // polymorphism -> 부모가 is a 자식
		// Heap을 지정하는 Dohyung 의 getWidth() 와 getHeight()를 알수가 없다 <-> function은 최적화된 override 된 function을 부르기 때문에 작동 가능
//		System.out.println("가로가 " + d1.getWidth() + "이고 세로가 " + d1.getHeight() + "인 사각형의 넓이는 "
//				+ Math.round(d1.calcArea()*100/100.0) +"이고 둘레는 " + Math.round(d1.calcRound()*100) / 100.0 + "입니다.");
		
		System.out.println("가로가 " + 4 + "이고 세로가 " + 5 + "인 사각형의 넓이는 "
				+ Math.round(d1.calcArea()*100/100.0) +"이고 둘레는 " + Math.round(d1.calcRound()*100) / 100.0 + "입니다.");

		
		Rect r2 = (Rect) d1;
		System.out.println("가로가 " + r2.getWidth() + "이고 세로가 " + r2.getHeight() + "인 사각형의 넓이는 "
				+ Math.round(r2.calcArea()*100/100.0) +"이고 둘레는 " + Math.round(r2.calcRound()*100) / 100.0 + "입니다.");
		
		
		
		
	}

}
