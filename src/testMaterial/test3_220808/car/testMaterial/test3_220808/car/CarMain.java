package testMaterial.test3_220808.car.testMaterial.test3_220808.car;

import java.util.List;

public class CarMain {
	
	public static void main(String[] args) {
		
		/*
		 현재는 CarManager 하나만 implements 하므로 크게 상관은 없지만 추후 여러개의 interface를 implements 할때 최적화를 위해
		 
		 CarManagerImpl implements CarManager(method a&b&c), BusManager(method d&e&f), TaxiManager(method g&h&i)
		data type을 CarManagerImpl로 cm 을 받을 경우 abc 필요한 method 이외의 불필요한 def ghi 까지 받아오므로
		최적화를 위해 해당 필요한 데이터 타입으로 방아올것
		 */
		// 질문 CarManager - CarManagerImpl
		CarManager cm = CarManagerImpl.getInstance(); // singletone pattern
		
		System.out.println("[자동차 등록]");
		
		try {
			cm.add(new Car(1111, "쏘나타"));
			cm.add(new Car(2222, "K5"));
			cm.add(new Taxi(8888, "SM6", 7000));
//			cm.add(new Car(8888, "SM6"));
			cm.add(new Car(3333, "그랜저"));
			cm.add(new Car(5555, "토레스"));
			cm.add(new Taxi(7777, "아이오닉", 3800));
		} catch (SameNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		---------------------------------------------------------------------------------		
		System.out.println("\n[자동차 목록]");
		List<Car> list = cm.searchAll();
		System.out.println("등록된 자동차 수 : " +list.size());
		for (Car c: list)
			System.out.println(c);
//		---------------------------------------------------------------------------------
		int carNum = 7777;
		System.out.println("[차 번호가 (" + carNum + ") 인 자동차 검색!!!");
		Car car = null;
		try {
			car = cm.searchByNum(carNum);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(car);
		
//		---------------------------------------------------------------------------------
		// 자동차 목록을 car.dat 저장
		cm.save();
		System.out.println("[car.dat]에 자동차 목록 저장!!");
		
//		---------------------------------------------------------------------------------
		// car.dat에서 자동차 목록 불러오기
		System.out.println("\n[car.dat]에 자동차 목록 불러오기.");
		List<Car> carList = cm.load();
		if(carList.isEmpty()) {
			System.out.println("파일을 찾을 수 없습니다.");
			return;
		}
		for (Car c: carList) {
			System.out.println(c);
		}
		
	}
	

}
