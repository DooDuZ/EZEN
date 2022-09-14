package java1.e클래스.EX12_1;

import java.util.Scanner;

public class View {
	
	Controller con = new Controller();
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		View starter = new View();
		starter.start();
	}
	
	public void start() {
		while(true) {			
			System.out.println("=====게시판=====");
			System.out.println("1.글쓰기 2.글 보기");
			int sel_numb = input.nextInt();
			
			if(sel_numb==1) {
				System.out.println("작성자 : "); String writer = input.next();
				System.out.println("비밀번호 : "); String password = input.next();
				System.out.println("제목 : "); String title = input.next();
				System.out.println("본문 : "); String content = input.next();
				
				boolean result = con.write_txt(writer, password, title, content);
				
				if(result) {
					System.out.println("글 등록이 완료되었습니다.");
				}else {
					System.out.println("글 등록 실패[ 관리자 문의 ]");
				}
				
				System.out.println(con.boardlist[0].title);
				
			}else if(sel_numb==2){
				System.out.println("=============================");
				System.out.println("글번호\t작성자\t제목");
				view_list();
			}
		}
	}
	
	public void view_list() {
		for(int i = 0 ; i<con.boardlist.length;i++) {
			if(con.boardlist[i]!=null) {
				System.out.println(i+"\t"+con.boardlist[i].writer + "\t" + con.boardlist[i].title);
			}
		}
		System.out.println("글 번호를 입력해 주세요.");
		int txt_numb = input.nextInt();
		if(con.boardlist[txt_numb]==null) {
			System.out.println("없는 번호입니다.");
			return;
		}
		view_txt(txt_numb);
	}
	public void view_txt(int a) {
		System.out.println("=============================");
		System.out.println(con.boardlist[a].content);
		System.out.println("1. 목록보기 2. 글 수정 3. 글 삭제");		
		int next_numb = input.nextInt();
		if(next_numb==1) {
			view_list();
		}else if(next_numb==2) {
			correct_content(a);
		}else if(next_numb==3) {
			delete_content(a);
		}else {
			System.out.println("없는 번호입니다.");
			return;
		}
	}
	public boolean correct_content(int a) {
		if(pw_test(a)) {
			System.out.println("새로운 제목을 입력해 주세요.");
			con.boardlist[a].title = input.next();
			System.out.println("새로운 내용을 입력해 주세요.");
			con.boardlist[a].content = input.next();
			return true;
		}else {
			System.out.println("수정 실패[관리자 문의]");
			return false;
		}
	}
	public boolean delete_content(int a) {
		if(pw_test(a)) {
			con.del_con(a);
			System.out.println("삭제완료");
			return true;
		}
		System.out.println("삭제 실패[관리자 문의]");
		return false;
	}
	public boolean pw_test(int a) {
		System.out.println("비밀번호 입력");
		String password = input.next();
		
		boolean result = con.pw_test(a, password);
		
		if(result) {
			return true;
		}else {
			return false;
		}
	}
}


