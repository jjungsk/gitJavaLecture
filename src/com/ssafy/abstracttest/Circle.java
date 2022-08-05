package com.ssafy.abstracttest;

public class Circle extends Dohyung {
	
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
	public double calcArea() {
		area = Math.pow(radius, 2) * Math.PI;
		return area;
	}
	
	@Override
	public double calcRound() {
		round = 2 * radius * Math.PI;
		return round;
	}

}
