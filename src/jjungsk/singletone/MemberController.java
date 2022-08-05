package jjungsk.singletone;


// singleton -> thread?!?
public class MemberController {
	
	public static void main(String[] args) {
		
		MemberService memberService1 = new MemberService(); // 매번 객체를 생성 하면.. 이용자가 많을때 힘들다..?
		MemberService memberService2 = new MemberService();
		
		MemberService memberService = MemberService.memberService();
		
		System.out.println(memberService1 + ", " + memberService2); // Heap 주소가 다 다름 -> 즉, 매번 새로운 객체 생성
		
		
		
	}

}
