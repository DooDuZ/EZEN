package java1.d배열;

import java.util.Scanner;

public class EX8_도서관 {

	public static void main(String[] args) {
		
		String[][] members = new String[100][4];	// 이름 ID PW [도서 대여 여부]
		String[][] books = new String[100][3];		// 제목 [대여 상태] 빌려간ID
		
		//관리자 지정
		members[0][0] = "관리자";
		members[0][1] = "admin";
		members[0][2] = "123";
		
		//초기 책 값 지정
		books[0][0] = "나는_고양이로소이다";
		books[1][0] = "정확한_사랑의_실험";
		books[2][0] = "말테의_수기";
		books[3][0] = "인간_실격";
		books[4][0] = "부루마블에_평양이_있다면";	
		
		books[0][1] = "대여가능";
		books[1][1] = "대여가능";
		books[2][1] = "대여가능";
		books[3][1] = "대여가능";
		books[4][1] = "대여가능";	
		
		books[0][2] = "";
		books[1][2] = "";
		books[2][2] = "";
		books[3][2] = "";
		books[4][2] = "";
		
		
		Scanner 입력 = new Scanner(System.in);
		boolean login = false;
		String current_ID = null;
		
		while(true) {
			System.out.println("=======온라인 도서관=======");
			if(login==false) {
				System.out.println("1.회원가입 2. 로그인 ");
				
				int select_numb = 입력.nextInt();
				
				if(select_numb==1) {
					System.out.println("=====회원가입=====");
					System.out.println("이름 : ");
					String name = 입력.next();
					System.out.println("ID : ");
					String ID = 입력.next();
					System.out.println("PW : ");
					String PW = 입력.next();
					
					int count = 0;
					for(int i = 0 ; i<members.length ; i++) {
						if(members[i][0]==null) {
							count = i;
							i = members.length;
						}
					}
					
					boolean checkedID = true;
					
					for(int i = 0 ; i<=count ; i++) {
						if(ID.equals(members[i][1])) {
							checkedID = false;
						}
					}
					if(checkedID==true) {
						members[count][0] = name;
						members[count][1] = ID;
						members[count][2] = PW;
						System.out.println("회원가입 완료");
						System.out.println("===================");
					}else {
						System.err.println("이미 존재하는 ID입니다.");
					}					
					continue;
				}
				if(select_numb==2) {
					System.out.println("======================================");
					System.out.println("ID : ");
					String ID = 입력.next();
					current_ID = ID;
					System.out.println("비밀번호 : ");
					String PW = 입력.next();
					int count = -1;
					for(int i = 0 ; i<members.length ; i++) {
						if(ID.equals(members[i][1])) {
							count = i;
							i=members.length;
						}
					}				
					if(count==-1) {
						System.out.println("일치하는 아이디가 없습니다.");
						current_ID = "";
						continue;
					}else {
						if(ID.equals(members[count][1]) && PW.equals(members[count][2])) {
							System.out.println("로그인 완료");
							login = true;
							continue;
						}
					}
				}
			}else if(login==true && current_ID.equals("admin")) {
				System.out.println("=======관리자메뉴=======");
				System.out.println("1. 도서등록 2.도서목록 3.도서삭제 4.로그아웃 ");
				int select_numb = 입력.nextInt();
				
				if(select_numb==1) {
					System.out.println("등록할 도서의 제목을 입력해 주세요.");
					String bookstitle = 입력.next();
					
					boolean Checkedbook = true;
					int count = 0;
					
					for(int i = 0 ; i <books.length ; i++) {
						if(bookstitle.equals(books[i][0])) {
							Checkedbook = false;
						}
					}
					for(int i = 0 ; i <books.length ; i++) {
						if(books[i][0]==null) {
							count = i;
							i=books.length;
						}
					}
					
					if(Checkedbook) {
						books[count][0] = bookstitle;
						books[count][1] = "대여가능";
						books[count][2] = "";
						System.out.println(bookstitle + " 등록 완료");
					}else {
						System.out.println("이미 등록된 책입니다.");
					}
					continue;
				}
				if(select_numb==2) {
					int bookslist = 0;
					for(int i = 0 ; i<books.length ; i++) {
						if(books[i][0]==null) {
							bookslist=i;					
							i = books.length;
						}
					}
					
					for(int i = 0 ; i<bookslist ; i++) {
						System.out.println("책번호 : " + i + "  제목 : " + books[i][0]);
						System.out.println("상태 : " + books[i][1]);
					}
					continue;
				}
				if(select_numb==3) {
					System.out.println("삭제할 책의 번호를 입력해주세요.");
					int del_book = 입력.nextInt();
					
					int bookslist = 0;
					
					for(int i = 0 ; i<books.length ; i++) {
						if(books[i][0]==null) {
							bookslist = i;
							i=books.length;
						}
					}
					if(del_book>bookslist) {
						System.out.println("존재하지 않는 책 번호입니다.");
					}else {
						System.out.println(books[del_book][0] + "삭제 완료");
						for(int i = del_book ; i<=bookslist ; i++) {
							books[i][0] = books[i+1][0];
							books[i][1] = books[i+1][1];
							books[i][2] = books[i+1][2];
						}
					}
					continue;
				}
				if(select_numb==3) {
					System.out.println("======로그아웃 완료 ======");
					login = false;
					current_ID = null;
				}
			}else if(login==true) {
				System.out.println("1.도서검색 2. 도서목록 3. 도서대여 4.도서반납 5.로그아웃");
				
				int select_numb = 입력.nextInt();
				if(select_numb==1) {
					System.out.println("찾으시는 책의 제목을 입력해 주세요.");
					String books_title = 입력.next();
					
					int find_books = -1;
					
					for(int i = 0 ; i <books.length ; i++) {
						if(books_title.equals(books[i][0])) {
							find_books = i;
						}
					}
					
					if(find_books>=0) {
						System.out.println("===== 검색 완료 =====");
						System.out.print("책번호 : " + find_books + " ");
						System.out.println("제목 : " + books[find_books][0]);
						System.out.println("상태 : " + books[find_books][1]);
						
					}else {
						System.out.println("===== 소장 도서가 아닙니다. =====");						
					}
					
					find_books = -1;
					continue;
				}				
				if(select_numb==2) {
					int bookslist = 0;
					for(int i = 0 ; i<books.length ; i++) {
						if(books[i][0]==null) {
							bookslist=i;					
							i = books.length;
						}
					}
					
					for(int i = 0 ; i<bookslist ; i++) {
						System.out.println("책번호 : " + i + "  제목 : " + books[i][0]);
						System.out.println("상태 : " + books[i][1]);
					}
					continue;
				}
				if(select_numb==3) {
					System.out.println("대여할 도서의 책번호를 입력해 주세요.");
					int sel_book = 입력.nextInt();
					if(books[sel_book][1]==null) {
						System.out.println("존재하지 않는 책번호 입니다.");
					}else if(books[sel_book][1].equals("대여가능")) {
						System.out.println("\""+books[sel_book][0] + "\" 대여 완료");
						books[sel_book][1] = "대여중";
						books[sel_book][2] = current_ID;
						continue;
					}else if(books[sel_book][1].equals("대여중")) {
						System.out.println("이미 대여중인 도서입니다.");
						continue;
					}					
				}
				if(select_numb==4) {
					System.out.println("반납할 도서의 번호를 입력해주세요.");
					int return_book = 입력.nextInt();
					
					if(books[return_book][1].equals("대여중") && books[return_book][2].equals(current_ID)) {
						System.out.println("반납 완료");
						books[return_book][1] = "대여가능";
						books[return_book][2] = null;
					}else{
						System.out.println("해당 도서관의 책이 아닙니다.");
					}
					continue;
				}
				if(select_numb==5) {
					System.out.println("======로그아웃 완료 ======");
					login = false;
					current_ID = null;
					continue; //안써도 됌. 코드 편히 보기위해 작성
				}
			}
		}
	}
}
