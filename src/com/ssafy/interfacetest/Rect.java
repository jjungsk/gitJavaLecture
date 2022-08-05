package com.ssafy.interfacetest;

public class Rect implements DohyungArea, DohyungRound {
	
	// attributes
	private double width;
	private double height;
	
	
	// constructor
	public Rect(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	// getter, setter
	public double getWidth() {
		return width;
	}
	
	
	public double getHeight() {
		return height;
	}
	
	
	
	// functions
	@Override
	public double calcArea() {
		return width * height;
	}
	
	@Override
	public double calcRound() {
		return (height + width) * 2;
	}



}
