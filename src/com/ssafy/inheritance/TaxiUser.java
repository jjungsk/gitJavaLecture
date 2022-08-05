package com.ssafy.inheritance;

public class TaxiUser {
	
	public static void main(String[] args) {
		Taxi t1 = new Taxi("쏘나타", "감홍색", "현대");
		
		System.out.println(t1);
		System.out.println(t1.toString());
		
		int speed = t1.speedUp(300);
		System.out.println("t1의 속도 : " + speed);
		System.out.println("t1의 계기판 속도 : " + speed);
		System.out.println("t1의 실제 속도 : " + t1.getSpeed());
		
		int km = 25;
		System.out.println("강남에서 성남까지 " + km + "km 이동!!!");
		int price = t1.calcPrice(km);
		System.out.println("요금 : " + price + "원");
		t1.init();
		
		System.out.println("강남에서 성남까지 " + km + "km 이동!!!");
		price = t1.calcPrice(km);
		System.out.println("요금 : " + price + "원");
		
		System.out.println("--------------------------");
		
		Taxi t2 = new Taxi("쏘나타", "감홍색", "현대");
		System.out.println(t1.hashCode() + " " + t2.hashCode());
		System.out.println(t2);
		if (t1 == t2) {
			System.out.println("t1과 t2는 같은 택시이다.");
		} else 
			System.out.println("t1과 t2는 다른 택시이다.");
		
		System.out.println();
		
		if (t1.equals(t2)) {
			System.out.println("t1과 t2는 이름이 같은 택시이다.");
		} else 
			System.out.println("t1과 t2는 이름이 다른 택시이다.");
		
		Car car = new Car();
		Taxi taxi = new Taxi();
		
		Car car2 = new Taxi();
		
//		Taxi taxi2 = new Car(); // error
		
//		Taxi taxi2 = (Taxi) car;
		Taxi taxi3 = (Taxi) car2;
		
		Bus bus = new Bus();
		Car car3 = bus;
		Bus bus2 = (Bus) car3;
		Taxi taxi4 = (Taxi) car3;
		
		

	}

}
