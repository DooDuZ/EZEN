package java1.e클래스.EX12;

import java.util.Scanner;

public class View {
	
	static Scanner input = new Scanner(System.in); //[필드화] 모든 함수에서 사용
	
	public static void main(String[] args) {
				
		start();		
	}	
	
	public static void start() {
		while(true) {
			System.out.println("=====게시판=====");
			System.out.println("1.글쓰기 2.글보기");
			int sel_numb = input.nextInt();
			
			if(sel_numb==1) {
				write_content();
			}
			else if(sel_numb==2) {
				view_board();
			}else {
				System.out.println("지정된 번호가 아닙니다.");
			}
		}		
	}
	
	public static void write_content() {
		System.out.println("작성자 : " );
		String writer = input.next();
		System.out.println("비밀번호 : " );
		String password = input.next();
		System.out.println("제목 : " );
		String title = input.next();
		System.out.println("내용 : " );
		String content = input.next();
		
		boolean result = 
				Controller.push_txt(title, content, writer, password);
		if(result) {
			System.out.println("글 등록 완료");
		}else {
			System.out.println("글 등록 실패");
		}
	}
	public static void view_board() {
		System.out.println("======목록======");
		System.out.println("글번호\t글제목");
		for(int i= 0 ; i<Controller.boardlist.length ; i++) {
			System.out.println(i+"\t"+Controller.boardlist[i].title);
			if(Controller.boardlist[i+1] == null) {
				break;
			}
		}
		System.out.println("글 번호를 입력해 주세요.");
		view_content();		
	}
	public static void view_content() {
		int txt_numb = input.nextInt();
		System.out.println("작성자 : " + Controller.boardlist[txt_numb].writer + "\t제목 : "+ Controller.boardlist[txt_numb].title);
		System.out.println("===="+ Controller.boardlist[txt_numb].content +"====");
		System.out.println("===============================");	
		System.out.println("1.목록보기 2.글 수정 3. 글 삭제");
		int next_numb = input.nextInt();
		if(next_numb == 1) {
			view_board();
		}else if(next_numb == 2) {
			boolean result = correct_content(txt_numb);
			if(result) {
				System.out.println("글 수정 완료");
			}else {
				System.out.println("비밀번호 불일치");
			}
			
		}else if(next_numb ==3 ) {
			boolean result = delete_content(txt_numb);
			if(result) {
				System.out.println("글 삭제 완료");
			}else {
				System.out.println("삭제 실패 [ 관리자 문의 ]");
			}
		}
	}
	public static boolean correct_content(int txt_numb) {
		System.out.println("비밀번호 입력");
		String PW = input.next();
		
		boolean result = Controller.correct_txt(txt_numb, PW);
		
		if(result) {
			System.out.println("제목을 입력해 주세요.");
			Controller.boardlist[txt_numb].title = input.next();
			System.out.println("내용을 입력해 주세요.");
			Controller.boardlist[txt_numb].content = input.next();
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean delete_content(int txt_numb) {
		System.out.println("비밀번호 입력");
		String PW = input.next();
		boolean result = Controller.delete_txt(txt_numb, PW);
		if(result) {
			return true;
		}else {
			return false;
		}
	}
}








