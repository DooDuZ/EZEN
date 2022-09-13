package java1.e클래스.EX6;

import java.util.Scanner;

public class EX6_실행 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Member[] MemberObject = new Member[100];
		
		while(true) {
			
			System.out.println("1.회원가입 2.로그인");
			int ch = input.nextInt();
			if( ch==1 ) {
				System.out.println("아이디");
				String ID = input.next();
				System.out.println("비밀번호");
				String PW = input.next();
				System.out.println("이름");
				String name = input.next();
				
				//객체 선언
				
				Member signupInfo = new Member(name, ID , PW, 1000);
				
				int index = 0;
				for(Member temp : MemberObject ) {
					index++;
					if(temp == null) {
						// temp = signupInfo;
						MemberObject[index] = signupInfo; 
						break;
					}
				}

				
				
				
			}else if( ch==2 ) {
				System.out.println("아이디 : "); String ID = input.next(); 
				System.out.println("비밀번호 : "); String PW = input.next();
				//
				Member loginInfo = new Member(ID, PW);
				int index=0;
				for( Member temp : MemberObject) {
					if(temp!=null) {
						if(MemberObject[index].ID.equals(ID)) {
							if(MemberObject[index].PW.equals(PW)) {
								System.out.println("로그인 성공");
								break;
							}
						}
					}
					index++;
				}				
			}
		}
	}
	
}
