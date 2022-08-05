package com.ssafy.jcf;

public class Car {
	
	// attributes
	private String carName;
	private String carColor;
	
	// constructor
	public Car(String carName, String carColor){
		super();
		this.carName = carName;
		this.carColor = carColor;
	}

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

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + "]";
	}
	
}
