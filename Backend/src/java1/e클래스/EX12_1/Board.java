package java1.e클래스.EX12_1;

public class Board {

	//필드
	String title;
	String content;
	String writer;
	String password;
	int index;
	
	//생성자
	public Board() {}
	
	Board(String title, String content, String writer, String password, int index){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.index = index;	
	};
	
	
}
