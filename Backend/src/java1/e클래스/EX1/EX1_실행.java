package java1.e클래스.EX1;

public class EX1_실행 {
	
	
	public static void main(String[] args) {

		// 1. 클래스 기반으로 객체 선언
			// 1. 클래스명 : 객체 생성시 사용되는 설계도
			// 2. 변수명 : 객체 이름으로 사용할 이름 임의로 정하기
			// 3. new 연산자 : 힙 영역에 메모리 할당 후 주소값 스택영역에 할당
			// 4. 생성자명 : 객체 생성시 초기값 담당[ 클래스명과 동일 ]
		Student s1 = new Student();
		// 1 	2  =  3		4
		// 스택영역		힙영역
		System.out.println("s1변수가 student 객체를 참조합니다." + s1);
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조 합니다.");
		
		/*
		 	!! : 동일한 클래스로 객체 선언 시 서로 다른[주소/메모리가 다른] 객체가 생성
		 */
	}
	
}
