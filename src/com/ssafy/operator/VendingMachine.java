package com.ssafy.operator;

public class VendingMachine {
	
	public static void main(String[] args) {
		int money = 10000;
		int price = 2370;
		int charge = money - price;
		
		int[] remain = {5000, 1000, 500, 100, 50, 10};
		
		while (charge != 0) {
			for (int i: remain) {
				int tmp = charge / i;
				charge -= tmp * i;
				System.out.printf("%d원 : %d장%n", i, tmp);
			}
		}
		
	}

}
