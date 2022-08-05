package com.ssafy.jcf;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("최재희");
		list.add("한선희");
		list.add("주대선");
		list.add("장윤주");
		list.add("정세권");
		list.add("최재희");
		
//		String[] name = list.toArray(new String[0]); // new String[0] 크기는 의미가 없다 그냥 new String[] 타입인것만 알려주면 되지만 우선 초기화가 필요하여 임의 숫자 입력 필요
//		for (int i = 0; i < name.length; i++) {
//			System.out.println(i + 1 + ". "+ name[i]);
//		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i));
		}
		
	}
}
