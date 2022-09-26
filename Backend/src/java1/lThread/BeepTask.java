package java1.lThread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
						// 구현		// 스레드 인터페이스
						// implements : 구현 [ 인터페이스(추상) 구현할 때 ]
						// Runnable : 스레드 인터페이스

		
		// 필드
		
		
		
		// 생성자
		
		// 메소드[ 스레드 제공하는 함수 = run ]
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("띵");
			try {
			Thread.sleep(500); 
			} catch (Exception e) {
			System.out.println("오류발생"+e);
			}
		}
	}	
}
