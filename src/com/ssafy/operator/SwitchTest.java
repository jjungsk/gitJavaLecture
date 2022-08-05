package com.ssafy.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class SwitchTest {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = Integer.parseInt(br.readLine());
		
		int[] SCORES = {90, 80, 70};
		String[] GRADE = {"A", "B", "C"}; 
		int PLUS_SCORE = 5;
		
		System.out.println(Arrays.toString(GRADE));
		
		String result = "";
		
		for (int i = 0; i < SCORES.length; i++) {
			if (in >= SCORES[i] + PLUS_SCORE) {
				result = GRADE[i]+"+";
				System.out.println(i + ", " + result);
				break;
			}
			else if (in >= SCORES[i]) {
				result = GRADE[i];
				break;
			}
			else {
				result = "F";
			}
		}
		
		System.out.printf("점수 : %d, 학점 : %s", in, result);
		
	}

}
