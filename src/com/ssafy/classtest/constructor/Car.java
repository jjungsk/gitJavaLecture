package com.ssafy.classtest.constructor;

public class Car {

	// 속성 (field)
	private String carName;
	private String carColor;
	private String maker;
	private int speed;

	// Class의 default 생성자가 생략되어 있음
	public Car() {
//		carName = "아반떼";
//		carColor = "흰색";
//		maker = "현대";
//		new Car("아반떼", "흰색", "현대"); // 다 null 로 호출
		this("아반떼", "흰색", "현대");
		System.out.println("기본 생성자 호출 합니다.");
	}
	
	public Car(String carName) {
//		this.carName = carName;
//		carColor = "흰색";
//		maker = "현대";
		this(carName, "흰색", "현대");
	}
	
	public Car(String carName, String carColor) {
//		this.carName = carName;
//		this.carColor = carColor;
//		maker = "현대";
		this(carName, carColor, "현대");
	}
	
	public Car(String carName, String carColor, String maker) {
		this.carName = carName;
		this.carColor = carColor;
		this.maker = maker;
	}
	
	// 자동 생성
	public Car(String carName, String carColor, String maker, int speed) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.maker = maker;
		this.speed = speed;
	}

	// get & set -> 마우스 우클릭 -> source -> generate Getter and Setter // alt + s + r + a + r
	public String getCarName() {
		return carName;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
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

	String info() {
		return this.maker + "에서 만든 " + this.carColor + " " + this.carName;
	}

}
