package java1.b연산자;

import java.util.Scanner;

public class EX2_연산자문제 {
	
	public static void main(String[] args) {
		/*
		// 문제1 : 급여 명세서
		
		 
		 */
		
		
		Scanner 답지 = new Scanner(System.in);
		/*
		System.out.println("기본급 : "); int 기본급 = 답지.nextInt();
		System.out.println("수당 : ");int 수당 = 답지.nextInt();
		System.out.println("실수령액 : " + (기본급 + 수당 - (기본급+수당)/10) );
		
		//문제 2 : 지폐 개수 세기

		
		System.out.println("금액 입력 : "); int 가격 = 답지.nextInt();
		System.out.println("십만원권 : " + (가격/100000) + '장'); 
		System.out.println("만원권 : " + (가격-(가격/100000)*100000)/10000 + '장');
		System.out.println("천원권 : " + ( (가격 - (가격/10000)*10000))/1000 +'장');
		
		//문제3 : 하나의 정수를 입력받아 7의 배수 이면 '맞다' 아니면 '아니다' [ if x ]
		
		System.out.println("정수 입력 : "); int 배수 = 답지.nextInt();
		String 칠배수 = 배수%7==0 ? "맞다" : "아니다"; 
		System.out.println(칠배수);
		
		//문제4 : 하나의 정수를 입력받아 홀수이면 이면 '홀수' 아니면 '짝수' [ if x ]
		
		System.out.println("정수 입력 : "); int 홀짝 = 답지.nextInt();
		String 홀짝체크 = 홀짝%2==1 ? "홀수" : "짝수" ;
		System.out.println(홀짝체크);
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 이면 '참' 아니면 '거짓' 
		System.out.println("정수 입력 : "); int 배수2 = 답지.nextInt();
		String 홀짝체크2 = 배수2%7==0 && 배수2%2==0 ? "참" : "거짓" ;
		System.out.println("7배수짝수 : " + 홀짝체크2);

		//문제6 : 두개의 정수를 입력받아 더 큰수 출력 
		System.out.println("숫자1 입력 : "); int 숫자1 = 답지.nextInt();
		System.out.println("숫자2 입력 : "); int 숫자2 = 답지.nextInt();
		int 큰수 = 숫자1>숫자2 ? 숫자1 : 숫자2 ;
		System.out.println(큰수);
				
		
		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
		System.out.println("반지름 : "); int 반지름 = 답지.nextInt();
		System.out.println("원의 넓이 : " + (반지름*3.14));
	
		
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇 %인지 출력하기 
		System.out.println("숫자3 입력 : "); double 숫자3 = 답지.nextInt();
		System.out.println("숫자4 입력 : "); double 숫자4 = 답지.nextInt();
		System.out.println("숫자 비율 : " + (숫자3/숫자4)*100 + "%");
		
		//문제9 : 사다리꼴 넓이 구하기 [ 윗변과 밑변 높이를 입력받아 출력하기 ]
		System.out.println("윗변 길이 입력 : "); double 윗변 = 답지.nextInt();
		System.out.println("밑변 길이 입력 : "); double 밑변 = 답지.nextInt();
		System.out.println("높이 입력 : "); double 높이 = 답지.nextInt();
		
		System.out.println("사다리꼴 넓이" + (윗변+밑변)*높이/2);
			
		// 문제10: 키를 정수로 입력받아 표준체중 출력하기
		
		System.out.println("키 입력 : "); int 신장 = 답지.nextInt();
		System.out.println("표준 체중" + (신장-100)*0.9);
		
		
		
		//문제11 : 키와 몸무게를 입력받아 BMI 출력하기
		//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		
		System.out.println("키 : "); Double 신장 = 답지.nextDouble();
		System.out.println("몸무게 : "); Double 체중 = 답지.nextDouble();
		System.out.println("BMI : " + 체중/((신장/100)*(체중/100)));

	
		
		//문제12 : inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ]
		
		System.out.println("길이(inch) : "); double inch = 답지.nextDouble();
		System.out.println(inch + "inch : " + inch*2.54 + "cm");
		
		*/
		
		//문제13 :  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기ㄴ
		//소수 둘째 자리 까지 점수 출력하기
		//중간고사 반영비율 => 30 %
		//기말고사 반영비율 => 30 %
		//수행평가 반영비율 => 40 %
		
		System.out.println("중간고사 : "); Double 중간점수 = 답지.nextDouble();
		System.out.println("기말고사 : "); Double 기말점수 = 답지.nextDouble();
		System.out.println("수행평가 : "); Double 수행평가 = 답지.nextDouble();
		
		System.out.printf("중간비율 : " , "기말비율 : " , "수행평가비율 : " , 중간점수/(중간점수+기말점수+수행평가), 기말점수/(중간점수+기말점수+수행평가), 수행평가/(중간점수+기말점수+수행평가));
		
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
			//int x = 10;
		//int y = x-- + 5 + --x;
		//printf(" x의 값 : %d , y의값 :  %d ", x, y)
		
	}
	
}
