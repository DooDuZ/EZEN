package java1.d배열;

import java.util.Random;
import java.util.Scanner;

public class EX2_로또판별기 {

	/*
	  	로또 판별기
	  		1. 구매번호 : 사용자가 6개 수 입력 - > 배열 저장
	  			1. 1~45 사이만 입력받기 아니면 재입력	2. 중복x
	  		2. 추처멉호 : 컴퓨터 난수 6개 생성 -> 배열저장
	  			1. 1~45 사이의 난수
	  		3. 구매번호와 추첨번호가 동일한 개수
	 */
	public static void main(String[] args) {
		//0. 메모리 선언
		Scanner numb_box = new Scanner(System.in);
		Random rand = new Random();
		int[] 구매번호 = new int[6];	// int형 변수 6개를 저장할 수 있는 공간
		int[] 추첨번호 = new int[6];	// 			
		
		//1. 사용자에게 입력 받는다 [6번]
		
		
		for(int i = 0 ; i<6 ; i++) {
			System.out.println("안내)" + (i+1) +"번째 번호 선택 : ");
			구매번호[i] = numb_box.nextInt();
			if(구매번호[i]>45 || 구매번호[i]<1) {
				i--;
				System.err.println("범위 초과 : 재입력");
			}// if end
			
			for(int j = 0 ; j<i ; j++) {
				if(구매번호[i]==구매번호[j] && i!=0) {
					System.err.println("이미 선택된 번호입니다.");
					구매번호[i]=0;
					i--;
				}
			}
		}
		
		//2 당첨번호 추첨
		for(int i = 0 ; i<6 ; i++) {
			int numb_rand = rand.nextInt(45)+1;
			System.out.println(numb_rand);
			추첨번호[i] = numb_rand;
			
			for(int j = 0 ; j<i ; j ++) {
				if(numb_rand == 추첨번호[j]) {
					추첨번호[i] = 0;
					i--;
				}
			}
		}
		
		System.out.println("구매번호 : ");
		
		for(int i = 0 ; i <6 ; i++) {
			System.out.print(구매번호[i] + ", " );
		}
		
		System.out.println("당첨번호 : ");
		for(int i = 0 ; i <6 ; i++) {
			System.out.print(추첨번호[i] + ", " );
		}
		System.out.println(' ');
		
		String 결과 = "";
		int 맞춘개수 = 0 ;
		
		for(int i = 0 ; i<6 ; i++ ) {
			for(int j = 0 ; j<6 ; j++) {
				if(구매번호[i]==추첨번호[j]) {
					결과 += 구매번호[i] + " ";
					맞춘개수++;
				}
			}
		}
		System.err.println("맞춘 번호 : " + 맞춘개수 + "개 : " + 결과);
		if(맞춘개수==6) {
			System.out.println("1등입니다");
		}else if(맞춘개수==5) {
			System.out.println("2등입니다");
		}else if(맞춘개수==4) {
			System.out.println("3등입니다");
		}else if(맞춘개수==3) {
			System.out.println("4등입니다");
		}else {
			System.out.println("이걸 왜하냐 나같으면 코인산다 ㅋㅋㅋ");
		}
		
	
	
	}
}





















