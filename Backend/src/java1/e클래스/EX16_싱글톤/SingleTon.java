package java1.e클래스.EX16_싱글톤;

public class SingleTon {
	
	// 싱글톤 : 객체 1개만 선언 가능한 클래스 -> static
		// 방법 1. 외부 생성자 사용 제한
		// 접근제한자
			// private : 현재 클레스에서만 접근 가능
			// public : 프로젝트 내 어디서든 호출 가능
			// 둘 다 안쓰면 같은 패키지 내에서 호출 가능
		// 방법 2. 필드에 정적 객체 선언
	//2
	private static SingleTon s1 = new SingleTon();
	
	public SingleTon() {}
	
	public static SingleTon getInstance() {
		return s1;
	}
}
