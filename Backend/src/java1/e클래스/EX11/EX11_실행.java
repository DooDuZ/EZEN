package java1.e클래스.EX11;

import java.util.Scanner;

public class EX11_실행 {

	public static void main(String[] args) { // 코드를 읽어주는[스레드]가 포함된 함수
		
		
	EX11_실행 exe = new EX11_실행();
	
	exe.run();
		
	}
	
	// 1. 함수 선언 [ 반환x 매개변수 x ]
	
	// static -> 모든 클래스를 읽은 후 static에 메모리 우선 할당하므로 같은 class에 있는 void읽지 못함
	// static = 프로그램 시작 시 메모리 할당 [ 메소드 영역 ]
	// 프로그램 종료 시 메모리 초기화
	// *모든 클래스에서 사용되는 [공통 메모리]
	
	// static main 안에 객체 선언[메모리 주입] 후 함수 호출
	// or 함수에도 static 부여 / but static 늘어날 수록 메모리 효율이 떨어짐
	void run() {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.회원가입 2.로그인");
			int sel_num = input.nextInt();
		}
	}
	
	void run3() {}
}


