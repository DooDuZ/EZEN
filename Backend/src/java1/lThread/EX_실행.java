package java1.lThread;

import java.util.Scanner;

public class EX_실행 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Timer timer = new Timer();
		boolean OnOff = true;
		
		while(true) {
			System.out.println("1.타이머 2.리셋 3.저장[db]");
			int ch = input.nextInt();
			if(ch==1) {			
				timer.start();
				System.out.println("1.일시정지/재시작 2.리셋");
				while(OnOff) {
					int stopNum = input.nextInt();
					if(stopNum == 1) {
						timer.plus();
					}else if(stopNum == 2) {
						OnOff = !OnOff;
						timer.setOnOff(OnOff);
						timer = new Timer();
					}
				}
			}
			OnOff = !OnOff;
		}
	}
}

/*

	멀티스레드
		1. Thread 클래스 상속
		2. Runnerble 인터페이스 구현 [ implements ]	
	

*/