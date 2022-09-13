package java1.e클래스.EX7;

import java.util.Scanner;

public class EX7_실행 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Board[] boardList = new Board[100];
		
		while(true) {
			System.out.println("=====게시판=====");
			System.out.println("1.글작성\t2.글보기");
			int sel_numb = input.nextInt();
			
			if(sel_numb == 1) {
				System.out.println("제목 : ");	String title = input.next();
				System.out.println("작성자 : ");	String writer = input.next();
				System.out.println("비밀번호 : ");	String password = input.next();
				System.out.println("내용 : ");	String content = input.next();
				
				
				int index = 0;
				
				Board textInfo = new Board( title, content, writer, password, index);				
				
				for(Board temp : boardList) {
					if(temp==null) {						
						boardList[index] = textInfo;
						break;
					}index++;
				}
				System.out.println(boardList[0]);
				System.out.println("글 등록이 완료 되었습니다.");				
			}else if(sel_numb==2) {
				System.out.println("=====List=====");
				System.out.println("글번호\t작성자\t제목");
				int index = 0;
				for(Board temp : boardList) {
					if(temp!=null) {
						System.out.println(index + "\t" + boardList[index].writer + "\t" + boardList[index].content);
						index++;
					}else {
						break;
					}
				}
				System.out.println("=========================");
				System.out.println("글 번호를 입력해주세요.");
				int txt_numb = input.nextInt();
				
				System.out.println(boardList[txt_numb].content);
				System.out.println("=========================");
				System.out.println("1. 목록보기\t 2. 글 수정\t3. 글 삭제");
				int next_numb = input.nextInt();
				
				if(next_numb==1) {
					continue;
				}else if(next_numb==2) {
					System.out.println("비밀번호");
					String PW = input.next();
					
					if(boardList[txt_numb].password.equals(PW)) {
						System.out.println("글 제목");
						String correct_title = input.next();					
						System.out.println("본문");
						String correct_content = input.next();
						
						boardList[txt_numb].title = correct_title;
						boardList[txt_numb].content = correct_content;
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
						continue;
					}
				}else if(next_numb==3) {
					System.out.println("비밀번호");
					String PW = input.next();
					if(boardList[txt_numb].password.equals(PW)) {				
						for(int i = txt_numb ; i<boardList.length ; i++) {
							boardList[i]= boardList[i + 1];
							if(boardList[i+1]==null){
								break;
							}
						}
						System.out.println("삭제가 완료 되었습니다.");
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
						continue;
					}					
				}
			}			
		}		
	}	
}
