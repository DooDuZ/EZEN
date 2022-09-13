package java1.e클래스.EX6;

public class Member {

	//필드
	
	String name;
	String ID;
	String PW;
	int point;
	
	//생성자
		// 1. 빈 생성자
		public Member() {};
		// 2. 회원가입시 사용되는 생성자
		Member(String name, String ID, String PW, int point){
			this.name = name;
			this.ID = ID;
			this.PW = PW;
			this.point = point;
		};
		// 3. 회원정보에서 비밀번호와 이름 변경 시 사용되는 생성자
		Member( String PW ){
			this.PW = PW;			
		};
		
		// 4. 로그인[아이디,비밀번호]시 사용되는 생성자 
		Member(String ID, String PW){			
			this.ID = ID;
			this.PW = PW;			
		};
	//메소드
	
	
}
