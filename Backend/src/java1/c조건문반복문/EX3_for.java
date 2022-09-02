package java1.c조건문반복문;

import java.util.Scanner;

public class EX3_for {

	public static void main(String[] args) {
		
		System.out.println("반복횟수 : "); Scanner numb = new Scanner(System.in);
		
		/*
		 * int max = numb.nextInt();
		 * 
		 * for(int i = 1 ; i<= max ; i++) { System.out.println(i); }
		 * 
		 * // while로 똑같이
		 * 
		 * int j = 1 ; while(j<=max) { System.out.println(j); j++; }
		 * 
		 * // p. 151
		 * 
		 * int sum = 0;
		 * 
		 * for(int i = 1 ; i<=100 ; i++){ sum += i; } System.out.println(sum);
		 * 
		 * // while로 똑같이
		 * 
		 * sum = 0; j=0; while(j<=100) { sum += j; j++; } System.out.println(sum);
		 * 
		 * sum = 0; for(int i = 1; i<=100 ; i++) { if(i%7==0) { sum += i; } }
		 * System.out.println(sum);
		 */
		
		
		for(int i = 2 ; i<=9 ; i++) {
			System.out.println("\n"+i+"단\n");
			for(int j = 1 ; j<=9 ; j++) {
				System.out.println(i+" X "+j+" : " + i*j);
			}
		}
		
		
		// 무한루프
		
		while(true) {
			System.out.println("실행");
		}
		
		// 1. break : 반복문 종료 키워드 [ 가장 가까운 반복문 탈출 ]
		// 2. continue : 반복문으로 이동 키워드 [ 증감식 이동 ]
	}	
}














