package com.ssafy.classtest;

// field : hp, mode, velocity, power, defence 
// method : attack, changeMode(power 10->15, health -25, health < 40: can't change), move

public class Marine {
	
	// field & method
	private int hp;
	private int power;
	private int mode; // 1: steamPack, 0: general
	
	// constructor
	public Marine() {
		this.hp = 100;
		this.power = 10;
		this.mode = 0;
	}
	
	public int getHp() {
		return hp;
	}
	
	public String getStatus() {
		return hp == 0 ? "die" : hp + " ";
//		return hp == 0 ? "die" : String.valueOf(hp);
//		return hp == 0 ? "die" : Integer.toString(hp);

	}
	
	
	// method -> call by reference 중요 concept
	public void attack(Marine enemy, int cnt) {
		for (int n = 0; n < cnt; n++) {
			enemy.hp -= this.power;
			if (enemy.hp <= 0) {
				enemy.hp = 0;
				break;
			}
			
		}
		
	}
	
	public int getPower() {
		return this.power;
	}
		
	public void changeMode() {
		if (hp < 40) {
			System.out.println("모드 변경이 불가능 합니다.");
			return; // break는 불가!!!!
		} 
		mode = 1;
		hp -= 25;
		power = 15;			
	}
	
	public void info() {
		System.out.printf("status : hp(%d), power(%d), mode(%d)%n", this.hp, this.power, this.mode);
	}
	
}
