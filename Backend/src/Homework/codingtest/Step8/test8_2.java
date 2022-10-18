package Homework.codingtest.Step8;

import java.util.Scanner;

public class test8_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int[] answer_box = new int[b-a+1];
		// a==b 이면 배열 길이가 0이되면서 런타임 에러 발생
		// a==b인 경우 -1출력 후 return하면 오답처리함
		// 백준 병신 ㅋㅋ
		// 결국 배열 길이 +1 해주면, 배열 길이를 쓰거나 하지않으므로 무방함
		int answerCount = 0;		// 소수 개수 저장용 변수, boolean값 써도 무방합니다.
		
		for(int i = a ; i<=b ; i++) {
			int count = 0;					//약수의 개수 저장하는 변수 
			for(int j = 1 ; j<=i ; j++) {
				if(i%j==0) {				// j가 i의 약수이면 
					count++;				// count++;
				}
			}
			if(count==2) {					// 약수가 1과 자기 자신만 있다면
				answer_box[i-a] = i;		// 배열에 값 추가
				answerCount++;				// 소수의 개수 +1;
			}
		}
		
		for(int tmp : answer_box) {			// 테스트용 출력입니다.
			if(tmp!=0) {
				System.out.print(tmp + " ");
			}
		}
		System.out.println("");				// 여기까지 테스트출력, 제출시 삭제
		
		if(answerCount>0) {					// 소수가 0개가 아니면
			int sum = 0;					// 변수 선언
			int firstNum = 0;				// 변수 선언
			for(int i = 0 ; i<answer_box.length ; i++) { // 배열 내 값 모두 더하기
				sum += answer_box[i];
				if(answer_box[i]!=0 && firstNum==0) { // firstNum의 초기값이 0이므로, 첫 인덱스인 경우만 저장됩니다.
					firstNum = answer_box[i];		
				}
			}
			System.out.println(sum);		// 답출력
			System.out.println(firstNum);	// 답출력
		}else if(answerCount==0) {
			System.out.println(-1);			// 소수가 없으면 -1출력
		}		
	}	
}
