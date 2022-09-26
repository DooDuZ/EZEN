package java1.lThread;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 비프음 소리 함수 [ 소리 속도보다 반복문이 더 빠르다.]
		System.out.println("스레드 호출 : 띵");
		try {
			Thread.sleep(500); // 예외처리 필요
		} catch (Exception e) {
			System.out.println("요류발생"+e);
		}
	}
	
}


/*
	extends		[상속]
			class A 클래스 extends B클래스		: B클래스의 설계된 메모리를 A클래스에게 물려준다.
											: A클래스는 B클래스의 멤버를 사용할 수 있다.
											: B클래스[부모 클래스] A클래스[자식 클래스]
											* 상속은 1번만 받는다
											
	implements	[구현]						: B인터페이스의 추상된 메소드를 A클래스가 구현한다.
	 		class A클래스 implements B인터페이스	: B인터페이스 메소드를 선언
	 										* 구현은 여러번 가능하다
	 		
	인터페이스란?		서로 다른 클래스[설계]들을 [*]동일한 목적 하에 조작
		
		






*/