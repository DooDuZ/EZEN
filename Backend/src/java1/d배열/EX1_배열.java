package java1.d배열;

public class EX1_배열 {

	public static void main(String[] args) {
		
		//예1)p.180
		// 1. 배열 선언
		int[] scores = { 83, 90 , 87 }; // int형 배열 선언, 3개 값 초기화, 인덱스 0~2
		// 2. 배열 호출
		System.out.println("배열[0] : "+ scores[0]);
		System.out.println("배열[1] : "+ scores[1]);
		System.out.println("배열[2] : "+ scores[2]);
		System.out.println("배열 : " + scores);
		
		int sum = 0;
		for(int i = 0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/3);
		
		//예2
		//1. new 연산자를 이용한 선언
		int[] 배열 = new int[3]; // int형 3개를 저장할 수 있는 배열 [ 고정길이 ] 
		//2. 배열내 모든 인덱스 호출
		for(int i = 0 ; i<배열.length ; i++) {
			System.out.println(배열[i]);
		}
		
		//3. 배열에 데이터 넣기
		배열[0] = 91;
		배열[1] = 90;
		배열[2] = 99;
		
		//4.
		for(int i = 0 ; i<배열.length ; i++) {
			System.out.println(배열[i]);
		}
		
		
		//5. 향상된 for문
		for( int temp : 배열 ) {
			//for( 반복변수 : 배열명 )
			//배열내 첫번째 인덱스부터 마지막 인덱스까지의 값을 반복변수에 하나씩 대입
			System.err.println(temp);
		}
		
	}	
}

/*
	변수 : 데이터1개 저장
	배열
		1. 같은 타입[자료형/클래스]의 데이터를 연속된 공간에 나열
		2. 인덱스 
		3. []
		4. 제공받은 메소드 X -----> js의 push나 splice 같은 것
		
		배열 선언
			1. 타입[] 배열명; 2. 타입 배열명[];
		배열 생성
			1. 타입[] 배열명 = { 값 }				// 배열 선언과 동시에 값 대입
			2. 타입[] 배열명 = new 타입[길이]			// 배열의 길이만큼 선언[초기값]
				*배열의 길이를 미리 설정할 때			정수 : 0 실수 : 0.0 클래스 : null 
		배열 호출
			배열명 : 배열의 메모리 주소(번지)
			
		
	

*/