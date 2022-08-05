package com.ssafy.interfacetest;

public class Circle implements DohyungRound {
	
	// attributes
	private double radius;
	
	// constructor
	Circle(double radius){
		super();
		this.radius = radius;
	}
	
	// getter, setter
	public double getRadius() {
		return this.radius;
	}
	
	// functions
	@Override
	public double calcRound() {
		return 2 * radius * Math.PI;
	}

}
