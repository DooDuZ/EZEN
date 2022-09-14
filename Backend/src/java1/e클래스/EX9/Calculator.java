package java1.e클래스.EX9;

public class Calculator {
		//필드
		
		boolean power = false;
	
		//생성자
		
		//메소드
			//반환타입 메소드명(){}
		
		void powerOnOff() {
			//void : 반환[ 리턴값 없음 ]
			if(!power) {
				System.out.println("전원을 켭니다.");
				power = true;
				return; //void인 경우 생략 가능
			}else {
				System.out.println("전원을 끕니다");
				power = false;
				return;
			}
		}
		/*
		void powerOff() {
			System.out.println("전원을 끕니다");
			power = false;
			return;
		}
		*/
		
		
	
		
		
		int plus(int x, int y) {
			if(power) {
				int result = x+y;
				return result;
			}else {
				int result=0;
				return result;
			}
		}
		int minus(int x, int y) {
			int result = x+y;
			return result;		
		}
		int multiply(int x, int y) {
			int result = x*y;
			return result;		
		}
		double divide(int x, int y) {
			double result = (double)x / (double)y;
			return result;		
		}
	
		
		
}
