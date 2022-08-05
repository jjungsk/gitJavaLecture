package com.ssafy.abstracttest;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		// abstract class는 자신의 생성자를 이용하여 객체 생성 불가능
//		Calendar cal = new Calendar();
		
		// 1. 하위 클래스를 참조(polymorphism)
		Calendar cal = new GregorianCalendar();
		
		// 2. 자신의 객체를 return 하는 static method 사용
		Calendar cal2 = Calendar.getInstance();
		
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 단, 월은 보통 Jan, Feb~ 식으로 String 이기 때문에 list index 0 부터 시작.
		int day = cal.get(Calendar.DAY_OF_MONTH); 
		int hour = cal.get(Calendar.HOUR_OF_DAY); 
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
		
		
	}
}
