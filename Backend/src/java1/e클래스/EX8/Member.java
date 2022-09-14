package java1.e클래스.EX8;

public class Member {
	
	// 필드
	String ID ;
	String PW ;
	String name ;	
	
	// 생성자 : 객체 생성시 초기값 [ 필드의 처음 값 설정 ]
		// * : 클래스명 이름 동일
		// * : 파라미터 개수에 따라 오버로딩 [ 여러개 사용 가능 ]
	public Member() {}

	
	
	public Member(String iD) {
		super();
		ID = iD;
	}

	

	public Member(String iD, String pW) {
		super();
		ID = iD;
		PW = pW;
	}



	public Member(String ID, String PW, String name) {
		this.ID = ID;
		this.PW = PW;
		this.name = name;
	}
	
	
	
	// 메소드
	
	
}
