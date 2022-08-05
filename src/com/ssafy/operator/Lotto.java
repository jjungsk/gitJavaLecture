package com.ssafy.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;

public class Lotto {
	
	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int in = Integer.parseInt(br.readLine());
//		
//		boolean dup = true;
//		boolean loop = true;
//		
//		int[] lottoArr = new int[5];
//		
//		while (dup == true) {
//			int[] lottoArr = new int[5];
//			
//			for (int i = 0; i < 5; i++) {
//			lottoArr[i] = (int)(Math.random() * 45) + 1;
//			}
//			
//			for (int j = 0; j < 5; j++) {
//				for (int k = j+1; k < 5; k++) {
//					if (lottoArr[j] == lottoArr[k]) {
//						System.out.println(j + ", " + k);
//						dup = true;
//						loop = false;
//						break;
//					} else
//						dup = false;
//					if (loop == false)
//						break;
//				} if (loop == false)
//					break;
//			}
//		}
//
//		
//		System.out.println(Arrays.toString(lottoArr));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임수 : ");
		int cnt = sc.nextInt();
		System.out.println("=== 금주 행운의 로또번호===");
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		for (int i =0; i < cnt; i++) {
			do {
				n1 = (int)(Math.random()*45) + 1;
				n2 = (int)(Math.random()*45) + 1;
				n3 = (int)(Math.random()*45) + 1;				
			} while (n1 == n2 || n2 == n3 || n3 == n1);
			
			System.out.println(n1 + " " + n2 + " " + n3);
		}
		
		
		
	}

}
