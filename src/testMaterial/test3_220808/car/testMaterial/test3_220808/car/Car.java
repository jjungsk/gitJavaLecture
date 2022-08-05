package testMaterial.test3_220808.car.testMaterial.test3_220808.car;

import java.io.Serializable;

public class Car implements Serializable {
	
	private int carNum;
	private String carName;
	
	// Constructor
	public Car() {
		super();
	}
	
	public Car(int carNum, String carName) {
		super();
		this.carNum = carNum;
		this.carName = carName;
	}

	// Getter Setter
	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	// toString method
	@Override
	public String toString() {
		return "Car [carNum=" + carNum + ", carName=" + carName + "]";
	}
	
	
	
	

}
