package java1.d배열;

import java.util.Scanner;

public class EX6_회원 {
	
	
	public static void main(String[] args) {
		
		String[][] 회원제 = new String[100][4]; // 0 1 2 3  
		//100명의 회원이 각각 4개의 정보를 가진다
		Scanner menu = new Scanner(System.in);
		
		boolean login = false;
		boolean Possible = true;
		
		int CurrentInfo = -1;
		
		int count = 0; 
		
		while(true) {		
			System.out.println("=========두두지 월드==========");
			if(!login) {
				System.out.println("1. 회원가입 2.로그인 3. 아이디찾기 4.비밀번호 찾기 || 0.종료");
			}else {
				System.out.println("1. 회원가입 2.로그인 3. 아이디찾기 4.비밀번호 찾기 5.로그아웃 6.회원탈퇴 || 0.종료");
			}
			
			int sel_numb = menu.nextInt();
			
			if(sel_numb==1) {	
				if(count==100) {
					System.err.println("멤버십 마감 / 회원가입 불가");
					continue;
				}				
				System.out.println("이름 : ");
				String Name = menu.next();
				for(int j = 0 ; j<100 ; j++) {
					if(Name.equals(회원제[j][0])) {
						Possible = false;
					}
				}
				회원제[count][0] = Name;
				
				System.out.println("ID : ");
				String ID = menu.next();
				for(int j = 0 ; j<100 ; j++) {
					if(ID.equals(회원제[j][1])) {
						Possible = false;
					}
				}
				회원제[count][1] = ID;
				
				System.out.println("PW : ");
				String PW = menu.next();
				회원제[count][2] = PW;

				System.out.println("Phone : ");
				String Phone = menu.next();
				for(int j = 0 ; j<100 ; j++) {
					if(Phone.equals(회원제[j][3])) {
						Possible = false;
					}
				}
				회원제[count][3] = Phone;
								
				if(!Possible) {
					System.err.println("이미 가입된 회원입니다.");
					회원제[count][0] = null;
					회원제[count][1] = null;
					회원제[count][2] = null;
					회원제[count][3] = null;
					count--;
				}
				count++;	
				Possible = true;		
			}
			
			if(sel_numb==2) {
				if(count<1) {
					System.out.println("회원이...없어요...");
					continue;
				}
				if(login) {
					System.err.println("이미 로그인 되었습니다.");
					continue;
				}
				System.out.println("ID : ");
				String ID = menu.next();
				
				int checkedID = -10000 ;
				for(int i =0; i<100 ; i++) {
					if(ID.equals(회원제[i][1])) {
						checkedID = i;
						i=99;
					}else {
						Possible = false;
					}
				}				
				
				System.out.println("비밀번호 : ");
				String PW = menu.next();
				if(PW.equals(회원제[checkedID][2])) {
					login = true;
					CurrentInfo = checkedID;
					System.out.println("로그인 완료");
				}else {
					Possible = false;;
				}
				
				if(!Possible) {
					System.err.println("로그인 실패");
				}
				Possible = true;				
			}
			
			if(sel_numb==3) {
				System.out.println("이름 : ");
				String Name = menu.next();
				System.out.println("전화번호 : ");
				String Phone = menu.next();
				
				int fixName = -1;
				for(int i = 0 ; i <100 ; i++) {
					if(Name.equals(회원제[i][0])) {
						fixName = i;
					}
				}
				
				if(fixName!=-1 && Phone.equals(회원제[fixName][3])) {
					System.out.println("ID는 " + 회원제[fixName][1] + " 입니다.");
				}else {
					Possible = false;
				}
				if(!Possible) {
					System.err.println("정보 불일치");
				}
				Possible = true;
			}
			
			if(sel_numb==4) {
				System.out.println("ID : ");
				String ID = menu.next();
				System.out.println("전화번호 : ");
				String Phone = menu.next();
				
				int fixName = -1;
				for(int i = 0 ; i <100 ; i++) {
					if(ID.equals(회원제[i][1])) {
						fixName = i;
					}
				}
				if(fixName!=-1 && Phone.equals(회원제[fixName][3])) {
					System.out.println("PW는 " + 회원제[fixName][2] + " 입니다.");
				}else {
					Possible = false;
				}
				if(!Possible) {
					System.err.println("정보 불일치");
				}
				Possible = true;
			}
			
			if(sel_numb==5) {
				login = false;
				CurrentInfo = -1;
				System.out.println("로그아웃 완료");
			}
			if(sel_numb==6) {
				login = false;
				for(int i = 0 ; i<4 ; i++) {
					회원제[CurrentInfo][i] = null;
				}
				for(int i = CurrentInfo ; i<100; i++) {
					회원제[i][0] = 회원제[i+1][0];
					회원제[i][1] = 회원제[i+1][1];
					회원제[i][2] = 회원제[i+1][2];
					회원제[i][3] = 회원제[i+1][3];
					if(회원제[i+1][0] == null) {
						i=99;
					}
				}
				CurrentInfo = -1;
				count--;
				System.out.println("회원 탈퇴 완료");
			}
			if(sel_numb==0) {
				System.out.println("종료");
				break;
			}
		}
	}
}


/*
 
 	회원제 프로그램 구현
 		[조건]
 			1. 2차원 배열
 		[기능]
 			1. 회원가입 기능
 				1. 아이디 비밀번호 이름 전화번호
 				2. 아이디 중복체크
 				3. 최대 회원 100명
 			2. 로그인 기능
 				아이디 비밀번호가 동일하면 성공
 			3. 아이디 찾기 기능
 				이름 전화번호가 동일하면 아이디 알려주기
 			4. 비밀번호 찾기 기능
 				아이디 전화번호가 동일하면 비밀번호[난수] 알려주기
 	
 		[출력]
 			1. 메뉴 : 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호 찾기
 
 
 
 */