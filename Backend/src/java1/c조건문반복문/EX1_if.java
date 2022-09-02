package java1.c조건문반복문;

public class EX1_if {
	
	public static void main(String[] args) {
		
		// 예1 ) : 참 실행문이 1개일 때는 중괄호 생략 가능
		if( 3 > 1 ) System.out.println("메롱이다임마");
		// 예2 : 조건이 true이면 실행 / 아니면 실행x
		if( 3 > 5) System.out.println("메롱이다임마");
		
		// p. 136
		int score = 93;
		if( score >= 90 ) {
			System.out.println("나는 배가 고픔니다");
			System.out.println("점심뭐뭑찌");
		}
		if( score < 90 ) {
			System.out.println("보끔밥");
			System.out.println("탕수육");
		}
		
		//예제 6 if 중첩
		int score4 = 95; char 성별 = 'M';
		if(score == 100) {
			if(성별=='M') {
				System.out.println("100점이면서 남자이다.");
			}else {
				System.out.println("100점이면서 여자이다.");
			}
		}else {
			if(성별=='M') {
				System.out.println("100점이 아니면서 남자이다.");
			}else {
				System.out.println("100점이 아니면서 여자이다.");
			}
		}		
	}
}

/*

	if 형태
		1.
			if(조건) 참			: 참[true] 위치에 실행문 [ ; ]이 1개이면 {} 생략 가능
		2.
			if(조건){참}			: 참[true] 위치에 실행문[ ; ]이 2개 이상일때
		3.
			if(조건){참}
			else{거짓}
		4.
			if(조건){참}
			else if(조건2){참2}
			else if(조건3){참3}
			else if(조건4){참4}
			else{거짓}
		5. 
			if(조건){
				if(조건){
					참
				}else{
					거짓
				}
			}






*/