package com.ssafy.inheritance;

//Car - 이름, 색상, 제어, 속도 |
//Taxi - 요금 | 요금 계산())
//Bus - 승객수 | 승차(), 하차()
//Truck - 

public class Car {
	
	// attributes
	private String carName;
	private String carColor;
	private String maker;
	private int speed;
	
	// generator 생성자
	public Car() {};
	
	public Car(String carName, String carColor, String maker) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.maker = maker;
	}

	// getter & setter
	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public String getCarColor() {
		return carColor;
	}


	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}


	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// functions
	public int speedUp(int speed) {
		return this.speed += speed;
	}
	
	public int speedDown(int speed) {
		this.speed -= speed;
		if (this.speed < 0)
			stop();
		return this.speed;
	}
	
	public void stop() {
		this.speed = 0;
	}
	
	@Override
	public String toString() {
		return this.maker + "에서 만든 " + carName + "(" +carColor + ")";		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Car car = (Car) obj;
		if (this.carName.equals(car.carName)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
}
