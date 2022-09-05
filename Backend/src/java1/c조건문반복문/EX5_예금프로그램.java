package java1.c조건문반복문;

import java.util.Scanner;

public class EX5_예금프로그램 {

	public static void main(String[] args) { // class start
		
		boolean run = true;	//종료 스위치(on/off, true/false)
		int balance = 0;	//int형 변수 선언 / 금액 저장 
		Scanner account = new Scanner(System.in);		
		//입력 객체 선언
			//객체마다 변수와 메소드(함수) 포함 = 멤버
			// 객체의 멤버 호출( . ) 접근 연산자
		
		while( run ) { // while( true / false ) : true이면 반복문 실행
			System.out.println("-----------------------------------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택> "); int ch = account.nextInt();
			
			if(ch==1) {
				System.out.println("안내) 예금액>"); balance += account.nextInt();
			}
			else if(ch==2) {	
				System.out.println("안내) 출금액>"); int money = account.nextInt();
				
				//잔액부족 [ 경우의 수 2개 : 1. 예금액보다 출금액이 더 크면 2. 작거나 같으면
				if(balance < money ) {
					System.out.println("잔액 부족");
				}else { balance -= money ;
					
				}
			}
			else if(ch==3) {
				System.out.println("안내) 잔고>"+balance); 
			}
			else if(ch==4) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("알 수 없는 번호입니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
	
}
