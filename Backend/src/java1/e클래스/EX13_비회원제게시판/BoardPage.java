package java1.e클래스.EX13_비회원제게시판;

import java.util.Scanner;

public class BoardPage {
	
	Scanner input = new Scanner(System.in);
	BoardControl control = new BoardControl();
	
	public static void main(String[] args) {
		BoardPage page = new BoardPage(); //메소드 호출용
		page.view();
	}

	//
	void view() {
		while( true ) {
			System.out.println("1.글쓰기 2.글제목 선택 : ");
			int btn = input.nextInt();
			BoardPage page = new BoardPage();
			if(btn==1) {
				page.regist();
			}else if(btn==2) {
				page.getBoardlist();
			}else {
				System.out.println("경고) 알수 없는 번호 입니다.");
			}
		}
	}
	//
	void regist() {
		System.out.println("===>>> 등록 페이지 ");
		System.out.println(">>제목 : "); 		String b_title = input.nextLine();
		System.out.println(">>내용 : ");		String b_content = input.nextLine();
		System.out.println(">>작성자 : ");	String b_writer = input.next();
		System.out.println(">>패스워드 : ");	String b_password = input.next();
		//view에서 입력받은 데이터를 control로 이동
		boolean result = control.regist(b_title, b_content, b_writer, b_password);
		if(result) {
			System.out.println("글 등록 완료");
		}else {
			System.out.println("글 등록 실패[관리자 문의]");
		}
	}
	void getBoardlist() {
		System.out.println("===>>> 게시판");
		System.out.println("번호\t작성자\t제목\t조회수");
		BoardDTO[] boardlist = control.getBoardlist();
		for(BoardDTO dto : boardlist ) {
			System.out.println(dto.b_no+"\t"+dto.b_writer+"\t"+dto.b_title+"\t"+dto.b_view);
		}
		getBoard();
	}
	void getBoard() {
		System.out.println("===>>> 게시물 번호 입력");
		int b_no = input.nextInt();
		BoardDTO board = control.getBoard(b_no);
		if(board==null) {
			System.out.println("경고) 해당 게시물이 없습니다.");
			return;
		}
		System.out.println("===>>>게시물===");
		System.out.println("제목 : " + board.b_title); 
		System.out.println("작성자 : " + board.b_writer);
		System.out.println("조회수 : " + board.b_view);
		System.out.println("내용 : " + board.b_content);
		
		System.out.println("1. 목록보기 2. 수정 3.삭제");
		int btn = input.nextInt();
		BoardPage page = new BoardPage();
		if(btn==1) {
			return;
		}else if(btn==2) {
			update(b_no);
		}else if(btn==3) {
			delete(b_no);
		}
	}	
	void update(int b_no) {
		System.out.println("===>>> 수정 페이지");
		System.out.println("패스워드 : "); String b_password = input.next();
		System.out.println("제목 : "); String b_title = input.next();
		System.out.println("본문 : "); String b_content = input.next();
		boolean board = control.update(b_no , b_password, b_title, b_content);
		if(board) {
			System.out.println("수정 완료");
		}else {
			System.out.println("경고) 수정 실패 [ 관리자 문의 ]");
		}		
	}
	
	void delete(int b_no) {
		System.out.println("===>>> 삭제 페이지");
	}
	
}
