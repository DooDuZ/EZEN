package java1; //현재 클래스가 속한 패키지[폴더] 표시

// 1. 클래스 선언부
public class Hello { //클래스 선언
// public : 접근제한자 ( 전범위 )
	//class : 클래스 선언 시 사용되는 키워드
		//Hello : 클래스명[ 아무거나 ]
			//{	} : 클래스 시작 ~ 끝
	// * 모든 코드는 클래스 {	} 안에서 작성해야 된다!!!
	
	// crtl+스페이스바 : 자동완성 [이클립스 단축키]
		// main + 자동완성
	
	// 2. 함수 선언부
	public static void main(String[] args) {	// main start
							// main 메소드에 main스레드[코드를 읽어주는 역할]
							// * 실행할 코드는 main 메소드 안에서 작성
		// syso + 자동완성
		System.out.println("Hello, Java");
	}	//	main end
	
	// 3. 주석 처리
		// 1. // : 한줄주석
		// 2. /* 여러줄 주석 */
	// 4. 세미콜론 ;
		// 실행문이 끝났음을 표시 ----> 실행
		// { } ; [x]	/ if();{} [x]	for();{} [x]
	
} //class e
