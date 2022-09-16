package java1.e클래스.EX13_비회원제게시판;

public class BoardDTO {
	
	
	//필드	
	
	int b_no; 
	String b_title;
	String b_content; 
	String b_writer; 
	String b_password; 
	int b_view;	
	
	//생성자	
	
	public BoardDTO() {	}
	public BoardDTO(int b_no, String b_title, String b_content, String b_writer, String b_password, int b_view) {
		super();
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_writer = b_writer;
		this.b_password = b_password;
		this.b_view = b_view;
	}
	
	//메서드
}


/*
	1. BoardDAO : 데이터베이스와 접근 객체
		1. DB접속코드
		2. 메소드
			1. regist()
				인수 : BoardDTO
				반환 : boolean
			2. getBoardlist()
				인수 : x
				반환 : BoardDTO[]
			3. getBoard()
				인수 : int b_no
				반환 : BoardDTO
			4. update() 
					인수 : int b_no, String b_password, String b_title, String b_content
					반환 : boolean
			5. delete()
					인수 : int b_no, int b_password
					반환 : boolean
	2. BoardDTO : 이동객체[db의 필드명과 동일하게 작성]
		1. 필드
			int b_no / String b_title / String b_content / String b_writer / String b_password / int b_view
		2. 생성자
			1. 빈 생성자 
		3. 메소드

*/