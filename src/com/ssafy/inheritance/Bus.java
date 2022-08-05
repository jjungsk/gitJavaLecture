package com.ssafy.inheritance;

public class Bus extends Car {
	
//	Car(인자) 를 이미 선언 했으므로 Car()를 다시 선언 해줘야 한다.
//	public Bus() {
//		super(); // 상위 클래스  constructor
//	}
	
	// attributes
	private int price;
	
	// generator
	public Bus() {
		price = 3800;
	}
	
	public int calcPrice(int km) {
		return price += km * 100;
	}
	
}
