package com.ssafy.classtest;

public class Car {
	
	// 속성 (field)
	String carName;
	String carColor;
	String maker;
	int speed;
	
	
	// 기능 (method)
	void speedUp() {
		this.speed += 10;
	}
	
	int speedUp(int speed) {
		return this.speed += speed;
	}
	
	void speedDwon() {
		if (this.speed >= 0)
			this.speed -= 10;
		else
			this.speed = 0;
	}
	
	void stop() {
		this.speed = 0;
	}
	
}
