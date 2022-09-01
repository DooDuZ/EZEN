package java1.a변수;

public class EX2_자료형 {	//class start
	
	// 2. 실행할 코드는 main 메소드 안에서 작성
	
	public static void main(String[] args) {	// main start
	
			// p.61

			// 1. byte : -128 ~ 127
			byte 바이트변수1 = -128; System.out.println("바이트변수1 : " + 바이트변수1);
			byte 바이트변수2 = 127; System.out.println("바이트변수2 : " + 바이트변수2);
			// byte 바이트변수3 = 128; System.out.println("바이트변수3 : " + 바이트변수3);
				// 오류 발생 : 저장범위 초과
			// 2. char[ 글자 1개 ] : 유니코드
				//문자[1개] 입력시 : ' ' 작은 따옴표
				//문자열[여러개] 입력시 : " " 큰따옴표
			char 문자변수1 = 65;		System.out.println("문자변수1 : " + 문자변수1);
			char 문자변수2 = 'A';		System.out.println("문자변수2 : " + 문자변수2);
				int 문자변수3 = 'A';		System.out.println("문자변수3 : " + 문자변수3);
			char 문자변수4 = '가';		System.out.println("문자변수4 : " + 문자변수4);
				int 문자변수5 = '가';		System.out.println("문자변수5 : " + 문자변수5);
			
				
			// 3. short[ 10진수 ] : +-3만정도
			short 쇼트변수1 = 30000;	System.out.println("쇼트변수1 : " +쇼트변수1);
			//	short 쇼트변수2 = 40000;	System.out.println("쇼트변수2 : " +쇼트변수2);
				//오류 발생 : 저장 범위 초과
			
			//4. int[ * 정수 기본 자료형 ] : +- 20억 정도
			
			//5. long[ 입력 숫자 뒤에 L ] : int 이상 
			long 롱변수1 = 1000000000;	System.out.println("롱변수1 : " + 롱변수1);
			long 롱변수2 = 3000000000L;	System.out.println("롱변수2 : " + 롱변수2);
				//기본 입력값이 int기 때문에 long변수에 int 범위를 초과하는 값을 넣을 경우 숫자 뒤에 L
			
			
			// . int : 10진수 정수를 저장하는 자료형[상자]
		
			int var1 = 0b1011;	// 2진수 [ 0b : 2진수 작성 가능 ]
			System.out.println("2진수 : " + var1);
			int var2 = 0206;	// 8진수 [ 0: 8진수 작성 가능 ]
			System.out.println("8진수 : " + var2);
			int var3 = 365;
			System.out.println(var3);
			int var4 = 0xb3;
			System.out.println("16진수 : " + var4);
			
			
			
	}	// main end
}


/*

	진수
		* 2진수를 변환하여 다양한 표현 단위를 사용할 수 있다. --> 많은 단위를 표현가능
		2진수		0,1 [ 기계어 , 이진 코드 ] 문제 : 표현 단위가 적다 ---> 8진수, 10진수, 16진수
		8진수		0,1,2,3,4,5,6,7
		10진수	0~9
		16진수	0~9, a, b, c, d, e, f 




*/