package java1.c조건문반복문;

import java.util.Random;
import java.util.Scanner;

public class EX6_가위바위보 {
	
	/*
		가위바위보 게임
		[조건]
		1. 플레이어에게 가위[0], 바위[1], 보[2] 중에 입력받기
		2. 컴퓨터에게 난수 생성
			*Random 클래스
			*Random 변수명 = new Random();
				*변수명.nextInt(수) : 0 ~ 수-1까지 난수 발생
		3. 승리자 판단[ 경우의 수 ]
		4. 
	
	*/
	
	public static void main(String[] args) {
		
		int 가위 = 0;
		int 바위 = 1;
		int 보 = 2;
		int 종료 = 3;
		
		Scanner game = new Scanner(System.in);
		Random rand = new Random(); //랜덤 객체 생성
		
		int game_count = 0;
		int win_count = 0;
		int pcwin_count = 0;
		while(true) {
			
		
			System.out.println("★ 가위 바위 보 시작 ★");
			System.out.println("0. 가위 / 1. 바위 / 2. 보 / 3. 종료"); int turn_player = game.nextInt();
					
			int pc = rand.nextInt(3); //int형 난수 생성 : 객체명.nextInt(수)
			System.out.println("플레이어 : " + turn_player);
			System.out.println("컴퓨터 : " + pc);
			
			if(turn_player==3){				
				System.out.println("===================");
				System.out.println("종료");
				if(win_count>pcwin_count) {
					System.out.println("플레이어win : " + win_count + "\n컴퓨터win : " + pcwin_count + "\n무승부 :" + (game_count-win_count-pcwin_count));
					System.out.println("플레이어 승리");
				}else if(win_count<pcwin_count) {
					System.out.println("플레이어win : " + win_count + "\n컴퓨터win : " + pcwin_count + "\n무승부 :" + (game_count-win_count-pcwin_count));
					System.out.println("PC 승리");
				}else {
					System.out.println("플레이어win : " + win_count + "\n컴퓨터win : " + pcwin_count + "\n무승부 :" + (game_count-win_count-pcwin_count));
					System.out.println("승자 없음");
				}
				win_count = 0 ;
				pcwin_count = 0 ;
				break;
			}
			
			
			if(turn_player-pc==1 || turn_player-pc == -2) {
				System.out.println("player 승리");
				game_count++;
				win_count++;
			}else if(turn_player - pc == -1 || turn_player - pc == 2 ){
				System.out.println("pc 승리");
				game_count++;
				pcwin_count ++;
			}else if(turn_player==pc){
				System.out.println("무승부");
				game_count++;
			}else{
				System.err.println("무효");
			}
		}
		
	}
	

}
