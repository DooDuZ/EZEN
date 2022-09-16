package java1.e클래스.EX13_비회원제게시판;

import java.util.Scanner;

public class BoardPage {
	
	Scanner input = new Scanner(System.in);
	
	
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
				page.getBoard();
			}else {
				System.out.println("경고) 알수 없는 번호 입니다.");
			}
		}
	};
	//
	void regist() {
		System.out.println("===>>> 등록 페이지 ");
	}
	void getBoardlist() {
		System.out.println("===>>> 게시판");
		System.out.println("번호\t작성자\t제목\t조회수");
	}
	void getBoard() {
		System.out.println("===>>>게시물===");
		System.out.println("제목 : "); 
		System.out.println("작성자 : ");
		System.out.println("조회수 : ");
		System.out.println("내용 : ");
		
		System.out.println("1. 목록보기 2. 수정 3.삭제");
		int btn = input.nextInt();
		BoardPage page = new BoardPage();
		if(btn==1) {
			return;
		}else if(btn==2) {
			update();
		}else if(btn==3) {
			delete();
		}		
	}
	
	void update() {
		System.out.println("===>>> 수정 페이지");
	}
	
	void delete() {
		System.out.println("===>>> 삭제 페이지");
	}
	
}
