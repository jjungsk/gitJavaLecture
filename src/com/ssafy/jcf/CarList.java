package com.ssafy.jcf;

import java.util.ArrayList;
import java.util.List;

public class CarList {
	
	public static void main(String[] args) {
		// DataBase
		Car car1 = new Car("쏘나타", "흰색");
		Car car2 = new Car("K5", "검정색");
		Car car3 = new Car("SM6", "은색");
		Car car4 = new Car("그랜져", "흰색");
		Car car5 = new Car("SM6", "빨간색");
		Car car6 = new Car("SM6", "빨간색");
		
		List<Car> list = new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		list.add(car5);
		list.add(car6);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i));
		}
		
		System.out.println();
		System.out.println("SM6의 자동차 색을 파란색으로 변경");
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCarName().equals("SM6")) {
				list.get(i).setCarColor("파란색");
				break;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i));
		}
		
		System.out.println();
		System.out.println("SM6 제거");
		
		int len = list.size();
		for (int i = len - 1; i >= 0; i--) {
			if (list.get(i).getCarName().equals("SM6")) {
				list.remove(i);
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i));
		}
		
	}

}
