package com.ssafy.inheritance;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Car - 이름, 색상, 제어, 속도 |
// Taxi - 요금 | 요금 계산())
// Bus - 승객수 | 승차(), 하차()
// Truck - 

public class Taxi extends Car{
	
//	Car(인자) 를 이미 선언 했으므로 Car()를 다시 선언 해줘야 한다.
//	public Bus() {
//		super(); // 상위 클래스  constructor
//	}
	
	// attributes
	private int price;
	private int upMoney;
	
	// generator
	public Taxi() {
//		super();
		init();
	}
	
	public Taxi(String carName, String carColor, String maker) {
		super(carName, carColor, maker);
//		price = 3800;
		init();
//		super.carName = carName;
//		this.carColor = carColor;
//		this.maker = maker;
	}
	
	
	// functions
	public int calcPrice(int km) {
		price = price + km * upMoney;
		return price;
	}
	
	@Override
	public int speedUp(int speed) {
		speed = super.speedUp(speed);
		if (speed > 150) {
			setSpeed(150);
		}
		return getSpeed();
	}
	
	@Override
	public String toString() {
//		return maker + "에서 만든 " + carName + "(" +carColor + ") 택시";		
		return super.toString() + " 택시";
	}

	public void init() {
		// TODO Auto-generated method stub
		Calendar cal = new GregorianCalendar();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		if (hour < 5 || hour > 23) {
			price = 5500;
			upMoney = 200;
			
		} else {
			price = 3800;
			upMoney = 100;
			
		}
	}
	
	
	
}
