package java1.d배열;

import java.util.Scanner;

public class EX5_학생점수관리 {

		public static void main(String[] args) {
		
			boolean run = true; // 무한루프
			int studentNum = 0; // 학생수 저장할 변수
			int[] scores = null; // 여러개 점수를 저장할 배열 [ 메모리 할당 전 ]
			Scanner 점수 = new Scanner(System.in); // 입력객체
			
			while(run) {
				System.out.println("----------------------------");
				System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
				System.out.println("선택 : "); int select_numb = 점수.nextInt();
				
				if(select_numb==1) {					
					System.out.print("학생수 : "); studentNum = 점수.nextInt();
					scores = new int[studentNum]; //studentNum을 입력받은 만큼 메모리 할당
					System.out.println("배열에"+studentNum + "명의 점수 입력 가능");
				}else if(select_numb==2) {
					for( int i = 0 ; i<scores.length ; i++) {
						System.out.println("scores["+i+"]:");
						scores[i] = 점수.nextInt();
					}					
				}else if(select_numb==3) {
					for(int i = 0 ; i<scores.length ; i++) {
						System.out.println("학생"+i+" :" + scores[i]);
					}					
				}else if(select_numb==4) {
					int winner = scores[0];
					if(winner<scores[1]) {
						winner = scores[1];
					}
					if(winner<scores[2]) {
						winner = scores[2];
					}
					System.out.println("최고점수 : " + winner);
					System.out.println("평균 점수 :" + (scores[0] + scores[1]+scores[2])/3);
				/*
					int tmp ;
					if(scores[0]>scores[1]) {
						tmp = scores[0] ;
						scores[0] = scores[1];
						scores[1] = tmp;
					}
					if(scores[0]>scores[2]) {
						tmp = scores[0] ;
						scores[0] = scores[2];
						scores[2] = tmp;
					}
					if(scores[1]>scores[2]) {
						tmp = scores[1] ;
						scores[1] = scores[2];
						scores[2] = tmp;
					}
					System.out.println("1등 : " + scores[0] + "\n2등 : " + scores[1] + "\n3등 : " + scores[2]);
				*/
					
					for(int i = 0 ; i< scores.length ; i++) {
						for(int j = i ; j<scores.length; j++) {
							if(scores[i]<scores[j]) {
								int tmp = scores[i] ;
								scores[i] = scores[j];
								scores[j] = tmp;
							}
						}
					}
					System.out.println("1등 : " + scores[0] + "\n2등 : " + scores[1] + "\n3등 : " + scores[2]);
					
					
				}else if(select_numb==5) {
					System.out.println("종료");
					run=false;
				}else {
					System.out.println("알수 없는 번호입니다."); // 그외 입력했을 때
				}
				
			}
		}	
}
