package com.ssafy.classtest;

public class StarCraft {
	
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();
		
		// 초기 상태
		System.out.println(" ======= 초기 상태 ======= ");
		printStatus(my, com);
		
		System.out.println(" === 내가 컴을 3회 공격 === ");
		my.attack(com, 3);
		printStatus(my, com);

		
		System.out.println(" === 컴이 나를 4회 공격 === ");
		com.attack(my, 4);
		printStatus(my, com);
		
		System.out.println(" ====== 내가 모드 변경 ====== ");
		my.changeMode();
		printStatus(my, com);
		
		System.out.println(" ===== 내가 컴을 3회 공격 ===== ");
		my.attack(com, 3);
		printStatus(my, com);
		// 나 : 35    컴 : 25
		
		System.out.println(" ==== 내가 모드 변경 ==== ");
		my.changeMode();
		printStatus(my, com);
		
		System.out.println(" ===== 내가 컴을 3회 공격 ===== ");		
		my.attack(com, 3);
		printStatus(my, com);
		
	}

	private static void printStatus(Marine my, Marine com) {
		System.out.println("나 : " + my.getStatus() + "\t컴 : " + com.getStatus());
	}
	
	

}
