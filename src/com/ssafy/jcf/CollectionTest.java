package com.ssafy.jcf;

import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
	
	public static void main(String[] args) {
//		Collection<String> coll = new ArrayList<String>();
		Collection<String> coll = new HashSet<String>();
		coll.add("최재희");
		coll.add("한선희");
		coll.add("주대선");
		coll.add("장윤주");
		coll.add("정세권");
		coll.add("최재희");
//		coll.add(100);
		
//		Object[] obj = coll.toArray();
//		for (int i = 0; i < obj.length; i++) {
//			System.out.println(obj[i]);
//		}
		
		String[] name = coll.toArray(new String[0]); // new String[0] 크기는 의미가 없다 그냥 new String[] 타입인것만 알려주면 되지만 우선 초기화가 필요하여 임의 숫자 입력 필요
		for (int i = 0; i < name.length; i++) {
			System.out.println(i + 1 + ". "+ name[i]);
		}
		
	}

}
