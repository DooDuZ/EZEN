package java1.H인터페이스;

import java.util.Scanner;

public class EX2_실행 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		GamePad gp;
		
		while(true) {
			System.out.println("게임 선택");
			System.out.println("1.축구 2.비행기");
			int ch = input.nextInt();
			
			if(ch==1) {
				gp = new Soccer(); // 인터페이스 변수에 구현객체 주소 대입
				gameStart(gp);
			}else if(ch==2) {
				gp = new ShootingGame();
				gameStart(gp);
			}
			
		}
	}
	
	public static void gameStart(GamePad gp) {
		while(true) {			
			char button = input.next().charAt(0);			
			if(button == 'A') {
				gp.ClickA();
			}else if(button == 'B') {
				gp.ClickB();
			}else if(button =='C') {
				gp.ClickA();
			}else if(button=='E') {
				return;
			}				
		}
	}	
}
