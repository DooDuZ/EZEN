package java1.d배열;

import java.util.Scanner;

public class EX8_도서관 {

	public static void main(String[] args) {
		
		String[][] members = new String[100][4];
		Scanner 입력 = new Scanner(System.in);
		boolean login = false;
		
		while(true) {
			System.out.println("=======온라인 도서관=======");
			if(login=false) {
				System.out.println("1.회원가입 2. 로그인 ");
			}else if(login=true) {
				System.out.println("1.도서검색 2. 도서목록 3. 도서대여 4.도서반납 5.로그아웃");
			}
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
				for(int i = 0 ; i<=count ; i++) {
					if(ID.equals(members[i][1])) {
						System.err.println("이미 존재하는 아이디 입니다.");
						i=count;
					}else {
						members[count][0] = name;
						members[count][1] = ID;
						members[count][2] = PW;
						System.out.println("회원가입 완료");
						System.out.println("===================");
					}
				}
				continue;
			}
			if(select_numb==2) {
				System.out.println("======================================");
				System.out.println("ID : ");
				String ID = 입력.next();
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
					continue;
				}else {
					if(ID.equals(members[count][1]) && PW.equals(members[count][2])) {
						System.out.println("로그인 완료");
						login = true;
						continue;
					}
				}
			}
			
		}
	}
}
