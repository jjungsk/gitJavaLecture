package com.ssafy.abstracttest;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {
	
	public static void main(String[] args) {
		double num = 1236258.15843;
		
		// 1. 하위 클래스를 참조 (Polymorphism)
		// abstract class 이므로 객체 생성 X
//		Format d = new Foramat();
//		Format f = new DecimalFormat("000,000,000,000.00");
		Format f = new DecimalFormat("###,###,###,###.##");
		String str = f.format(num);
		System.out.println(str);
		
		// Wrapper class
		int i = 10;
		Integer it = i; // boxing
		i = it; // unboxing (int) = (reference class)
		
		DateFormat df = new SimpleDateFormat("yy.MM.dd HH:mm:ss w");
		String date = df.format(new Date());
		System.out.println(date);
		
		
		
	}

}
