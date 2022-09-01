package java1.b연산자;

public class EX1_연산자 {

	public static void main(String[] args) {
		//1. 산술 연산자
		int 정수1 = 10; int 정수2 = 20;
		System.out.println(" 더하기 : " + 정수1 + 정수2);
		System.out.println(" 더하기 : " + (정수1 + 정수2));
		System.out.println(" 빼기 : " + (정수1 - 정수2));
		System.out.println(" 곱하기 : " + (정수1*정수2));
		System.out.println(" 나누기 : " + (정수1/정수2));
		System.out.println(" 나누기 : " + (정수1%정수2));
		
		//2. 비교
		System.out.println("이상 : " + (정수1>=정수2));
		System.out.println("이하 : " + (정수1<=정수2));
		System.out.println("초과 : " + (정수1>정수2));
		System.out.println("미만 : " + (정수1<정수2));
		System.out.println("같다 : " + (정수1==정수2));
		System.out.println("같지않다 : " + (정수1!=정수2));
		
		//3. 논리
		int 정수3 = 30 ; int 정수4 = 40;
		System.out.println(" && : AND :" + (정수1>=정수2 && 정수3>=정수4));
		System.out.println(" && : AND :" + (정수1<=정수2 && 정수3<=정수4));
		System.out.println(" || : OR :" + (정수1>=정수2 || 정수3<=정수4));
		
		//4. 증감
		int 정수5 = 10;
		System.out.println("후위증가 : " + (정수5++));
		System.out.println("확인 : " + 정수5);
		System.out.println("선위증가 : " + (++정수5));
		System.out.println("후위감소 : " + (정수5--));
		System.out.println("선위감소 : " + (--정수5));
		
		//5. 대입연산자
		int 정수6 = 10;
		System.out.println(정수6 += 3);
		System.out.println(정수6 -= 5);
		
		//6. 삼항연산자
		int 점수 = 85 ;
		char 등급 = 점수 > 90 ? 'A' : 'B';
		System.out.println("등급결과 : " + 등급 );
		char 등급2 = 점수 > 90 ? 'A' : 점수>80 ? 'B' :'C' ;
		System.out.println("등급결과 : " + 등급2 );
		
	}

}


/*

	연산자 : 계산시 사용되는 특수문자
		1. 산술연산자
			+ 더하기 - 빼기 * 곱하기 / 나누기 % 나머지
			+ 연결연산자
		2. 비교연산자 : true or false
			>= <= > < == !=
		3. 논리연산자 : 비교연산자 2개 이상 작성
			&& : and[이면서 면서 이고 그리고 모두]
			|| : or[이거나 거나 또는 하나라도]
			! : not
		4. 대입연산자
			= += =+	-=	=-
		5. 증감연산자
			++	--
		6. 삼항연산자




*/