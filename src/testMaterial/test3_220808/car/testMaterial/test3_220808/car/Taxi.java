package testMaterial.test3_220808.car.testMaterial.test3_220808.car;

public class Taxi extends Car {
	
	private int price;
	
	// Constructor
	public Taxi() {
		super();
	}
	
	public Taxi(int carNum, String carName, int price) {
		super(carNum, carName);
		this.price = price;
	}

}
