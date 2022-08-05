package com.ssafy.classtest.constructor;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.info());
//		car1.carName = "쏘나타";
//		car1.carColor = "검정색";
//		car1.maker = "현대";
		
		Car car2 = new Car("쏘나타");
		System.out.println(car2.info());
		
		Car car3 = new Car("그랜저", "검정색");
		System.out.println(car3.info());
		
		Car car4 = new Car("i4", "흰색", "Volov");
		System.out.println(car4.info());
				
		
	}
}
