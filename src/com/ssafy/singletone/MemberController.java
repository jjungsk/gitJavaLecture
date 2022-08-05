package com.ssafy.singletone;

public class MemberController {
	
	public static void main(String[] args) {
//		MemberService memberService1 = new MemberService();
//		MemberService memberService2 = new MemberService();
		
		Runtime ru = Runtime.getRuntime();
		
		// singletone pattern
		MemberService memberService1 = MemberService.getMemberService();
		MemberService memberService2 = MemberService.getMemberService(); 
		
		System.out.println(memberService1 + " : " + memberService2);
		
	}

}
