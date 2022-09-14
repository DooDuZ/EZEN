package java1.e클래스.EX8;

public class EX8_실행 {
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member("나는지웅", "일이삼사", "지웅이");
		
		System.out.println(m2.ID);
		System.out.println(m2.PW);
		System.out.println(m2.name);
	}
}


/*

	객체지향 프로그램
		1. 클래스 : 필드, 생성자, 메소드로 미리 구성된 설계도
		2. 객체 : 클래스로부터 new 연산자를 사용한 메모리 할당
			객체 [선언] : 클래스명 객체명 = new 생성자();
			객체 [호출] : 객체명
			객체 [멤버 호출] : 객체명.멤버
			 	객체명.필드명
			 	객체명.메소드명






*/