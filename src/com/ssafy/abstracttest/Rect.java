package com.ssafy.abstracttest;

public class Rect extends Dohyung {
	
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
		area = width * height;
		return area;
	}
	
	@Override
	public double calcRound() {
		round = (height + width) * 2;
		return round;
	}



}
