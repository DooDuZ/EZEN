package java1.e클래스.EX17_final;

public class EX17실행 {
	
	public static void main(String[] args) {
		
		// 1. 객체 선언
			// 클래스명 객체명 = new 생성자();
		Person p1 = new Person();
		Person p2 = new Person("123123-1231231", "홍길동");
		
		// p2.nation = "USA"; - > 파이널 필드 값 변경 불가. 오류
		// 그 외 가능
		p2.ssn = "123123-1231231";
		p2.name = "지웅이";		
	}
}
