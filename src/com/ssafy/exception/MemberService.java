package com.ssafy.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberService {
	
	
	public static void main(String[] args) {
	
		MemberService ms = new MemberService();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("비밀번호 : ");
			String pwd = in.readLine();
			boolean flag = ms.pwdCheck(pwd);
			System.out.println("good");
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PasswordNotMatchException e) {
			System.out.println("비밀번호 다시 입력 하시오");
			e.printStackTrace();
		}
		
	}

	private boolean pwdCheck(String pwd) throws PasswordNotMatchException {
		if (!pwd.equals("1234"))
			throw new PasswordNotMatchException("비밀번호 틀림");
		return true;
	}

}
