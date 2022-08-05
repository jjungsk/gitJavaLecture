package com.ssafy.singletone;

// 1. 생성자를 private으로 지정
// 2. static 으로 자신의 객체 생성
// 3. 2에서 생성된 객체를 return하는 public method 생성.



public class MemberService {
	
	private static MemberService memberService; // 변수명..?
//	private static MemberService memberService = new MemberService();
	
	public static MemberService getMemberService() {
		if (memberService == null)
			memberService = new MemberService();
		return memberService;
	}

	private MemberService() {}
	
	public int registerMember() {
		return 0;
	}

}
