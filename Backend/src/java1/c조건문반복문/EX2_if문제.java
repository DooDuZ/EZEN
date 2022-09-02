package java1.c조건문반복문;

import java.util.Scanner;

public class EX2_if문제 {
	
	public static void main(String[] args) {
		
		Scanner numb = new Scanner(System.in);
		
		/*
		
		//문제1 : 2개의 정수를 입력받아서 더 큰 수 출력
		 * 
		System.out.println("x 값 : "); int x = numb.nextInt();
		System.out.println("y 값 : "); int y = numb.nextInt();
		
		if(x>y){
			System.out.println(x);			
		}else {
			System.out.println(y);
		}

		
		//문제2 : 3개의 정수를 입력받아서 더 큰 수 출력 
		System.out.println("a 값 : "); int a = numb.nextInt();
		System.out.println("b 값 : "); int b = numb.nextInt();
		System.out.println("c 값 : "); int c = numb.nextInt();
		
		if(a>b && a>c){
			System.out.println(a);
		}else if(b>a && b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
		int max = a ;
		if(max<b) {
			max = b;
		}
		if(max<c) {
			max = c;
		}	
		
		System.out.println(max);
		
		//문제3 4개의 정수를 입력받아서~~ 
		
		System.out.println("a2 값 : "); int a2 = numb.nextInt();
		System.out.println("b2 값 : "); int b2 = numb.nextInt();
		System.out.println("c2 값 : "); int c2 = numb.nextInt();
		System.out.println("d2 값 : "); int d2 = numb.nextInt();		
		
		int max2;
		
		if(a2>b2 && a2>c2 && a2>d2){
			max2 = a2;
		}else if(b2>a2 && b2>c2 && b2>d2) {
			max2 = b2;
		}else if(c2>a2 && c2>b2 && c2>d2) {
			max2 = c2;
		}else {
			max2 = d2;
		}
		System.out.println(max2);
		
		max2=a2;
		
		if(max2<b2) {
			max2=b2;
		}
		if(max2<c2) {
			max2=c2;
		}if(max2<d2) {
			max2=d2;
		}
		System.out.println(max2);
		
		int temp = 0;
		
		if(a>b){
			temp = a;
			a = b ;
			b = temp;
		}if(a>c) {
			temp = a;
			a=c;
			c=temp;
		}if(b>c) {
			temp = b;
			b=c;
			c=temp;
		}	
		System.out.println(a+""+b+c);		
		*/
		/*
		
		System.out.println("점수 : "); int 점수 = numb.nextInt();
				
		if(점수>=90) {
			System.out.println("A");
		}else if(점수>=80) {
			System.out.println("B");
		}else if(점수>=70) {
			System.out.println("C");
		}else {
			 System.out.println("재시험");
		}
		
		*/
		/*
		System.out.println("국어 : "); int 국어 = numb.nextInt();
		System.out.println("영어 : "); int 영어 = numb.nextInt();
		System.out.println("수학 : "); int 수학 = numb.nextInt();
		
		int 평균 = (국어+영어+수학)/3 ;
		
		if(평균>=90) {
			if(국어==100) {
				System.out.println("국어 우수");
			}
			if(영어==100) {
				System.out.println("영어 우수");
			}
			if(수학==100) {
				System.out.println("수학 우수");
			}			
		}else if(평균>=80){
			if(국어>=90) {
				System.out.println("국어 장려");
			}
			if(영어>=90) {
				System.out.println("영어 장려");
			}
			if(수학>=90) {
				System.out.println("수학 장려");
			}
		}else {
			System.out.println("재시험");
		}
		*/
		
		System.out.println("ID : "); String ID = numb.next();
		System.out.println("PW : "); int PW = numb.nextInt();
		
	
		String ID_Fix = "admin";
		int PW_Fix = 1234;
		
		
		if(ID.equals("admin") && PW==PW_Fix){
			//비교 연산자는 기본 자료형에서만 사용 가능 
			//클랙스(객체)는 비교연산자 사용 불가능
			//기본자료형 ==  vs  객체명.equals(객체명)
			// . : 접근연산자 ( 내부 )
			System.out.println("로그인 성공");
		}else {
			System.out.println("입력된 ID : " + ID);
			System.out.println("입력된 ID : " + PW);
			System.out.println("로그인 실패");
		}		
	}
}
