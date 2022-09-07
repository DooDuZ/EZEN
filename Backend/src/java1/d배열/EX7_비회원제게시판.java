package java1.d배열;

import java.util.Scanner;

public class EX7_비회원제게시판 {

	public static void main(String[] args) {
		
		String[][] 게시판 = new String[100][4];
		//String[][] 이름 = new String[정보 개수][정보 개수] -> 저장소 만들기 명령어!
		Scanner 입력 = new Scanner(System.in);
		//나도 안배워서 몰라요! 뭐 입력받으려면 이거 쓰고 시작하래요!!
		
		int count = 0;  // 등록된 글의 개수를 보다 쉽게 저장하고 불러오기 위한 변수
		while(true) {	//무슨짓을해도 행동이 끝나면 여기로 돌아오도록 도돌이표를 만들었어요.
			System.out.println("==============커뮤니티===============");//a.페이지 정보
			System.out.println("번호\t작성자\t제목");//메뉴 목록
			if(count>=1) {
				for(int i=0 ; i<count ; i++) { //등록된 글의 개수만큼 아래 작업을 반복해요
					System.out.println(i+"\t"+게시판[i][2]+"\t"+게시판[i][0]);
				}	//i:글이 등록된 순서 + 게시판에 저장된 [i]번째 글의 2번째 정보 + [i]번째 글의 0번째 정보 
			}		//두번째 []에 들어가는 숫자는 0~3까지 존재하고, 각 숫자마다 정보가 정해져 있어요
			System.out.print("1.글쓰기\t2.글보기\t 선택 : "); //a에서 할 수 있는 행동이 뭐가 있는지 말해줘요
			int sel_numb = 입력.nextInt();
			//우리가 보는 화면에는 클릭 기능이 없기 때문에, 숫자로 정보를 받아올 거에요.
			//입력.nextInt()는 숫자를 입력받는 명령어이고, int sel_numb는 입력받은 정보(숫자)를 저장할 변수에요  
			if(sel_numb<1 || sel_numb>2) { //선택할 두가지 경우의 수를 벗어난다면
				System.err.println("\n유효하지 않은 숫자입니다.");	//경고해줘요!
				continue;	//경고한 뒤 우리가 처음에 만든 도돌이표 첫 부분으로 돌아가요!
			}
			if(sel_numb==1) { //커뮤니티 화면에서 1번을 선택한다면 
				System.out.println("제목 : ");	//어떤 정보를 입력할지 알려주고
				String title = 입력.next();		//title을 이라는 문자열에 입력받은 값을 넣어줘요 
												//입력이 끝났다면 다음으로 넘어가요
				System.out.println("내용 : ");	//다시 어떤 정보를 입력할지 알려주고
				String content = 입력.next();		//content라는 문자열을 만들어서 받은 내용을 담고!
				
				System.out.println("작성자 : ");	//반복
				String writer = 입력.next();
				
				System.out.println("비밀번호 : ");	//정보가 4개이기 떄문에 4개를 모두 받았어요
				String PW = 입력.next();
				
				게시판[count][0] = title;			//각각 받은 정보를
				게시판[count][1] = content;		//맨 처음 만든 저장소의
				게시판[count][2] = writer;		//count번째 칸의
				게시판[count][3] = PW;			//다시 0~3번째 칸에 각각 넣어줘요
				count++;						//등록이 끝났으니 글의 개수에 1을 더해줘요
			}
			if(sel_numb==2) {					//커뮤티니 화면에서 2(글보기)를 골랐다면
				System.out.println("게시물 번호 선택 : "); //보고싶은 글의 번호를 입력하라고 알려줘요
				int sel_index = 입력.nextInt();		//보고싶은 글의 번호를 저장할 변수를 만들고 입력받기
				if(sel_index>count-1) {	//게시물은 0번부터 존재하기 때문에, count(개수)에서 -1한 값보다
										//입력한 번호가 크다면
					System.err.println("유효하지 않은 숫자입니다.");	//경고해준 뒤
					continue;	// 다시 도돌이표!
				}
				
				System.out.println("=======게시물 상세 페이지=======");	//보고 있는 페이지의 정보를 알려주고
				System.out.println("작성자 : " + 게시판[sel_index][2]+"\t제목 : "+게시판[sel_index][0]);
				//선택한 정보를 출력 / 앞에 보고있는 정보의 종류도 추가해줘요
				System.out.println("내용 : " + 게시판[sel_index][1]);//모든 정보를 한줄에 표시하려면 기니까 긴 내용은 아래에서 출력하기 
				System.out.println("==========================");	// 페이지 구분 
				System.out.println("1.목록보기\t2.글삭제 3.글 수정");	// 글을 열었으니 여기서 선택할 수 있는 경우의 수를 보여주기
				int sel_num = 입력.nextInt();	 //사용자가 번호를 입력하면 받아서 sel_num에 저장
				
				if(sel_num>3 || sel_num<1) { //역시 선택지를 벗어난다면
					System.err.println("유효하지 않은 숫자입니다."); //경고해주고
					continue;	//프롤로그로 도돌이표
				}				
				if(sel_num==1) {	//사용자가 1을 입력했다면
					continue;	// 처음으로 돌아가고 싶다는 뜻이니 도돌이표
				}else if(sel_num==2) {	//사용자가 2(글 삭제)를 입력했다면 
					System.out.println("비밀번호 입력");	//글을 지워도 되는 사람인지 비밀번호를 받아요
					String del_pw = 입력.next();		//받은 정보를 String(숫자가 아닐수도 있으니)에 저장하고
					if(del_pw.equals(게시판[sel_index][3])) {//비밀번호가 글 입력할 때 받았던과 동일하면
						게시판[sel_index][0]=null;		//sel_index(보고있는 글의 번호)에 담긴 정보를
						게시판[sel_index][1]=null;		//저장소에서 꺼내서
						게시판[sel_index][2]=null;		//0~3번째 항목까지 모두
						게시판[sel_index][3]=null;		//null->빈공간 으로 채워줘요
						
						//선택한 저장소의 위치를 빈칸으로 모두 채웠으니, 저장소 중간에 구멍이 생겼어요
						for(int i = sel_index ; i<count; i++) {	//비운 자리부터 글이 저장된 곳까지
							게시판[i][0]=게시판[i+1][0];	//하나씩 생긴 구멍으로 정보를 채워주기
							게시판[i][1]=게시판[i+1][1];	//0번부터
							게시판[i][2]=게시판[i+1][2];	
							게시판[i][3]=게시판[i+1][3];	//3번까지
						}
						count--;						//글이 지워졌으니 글의 개수에 -1을 해줘요
						continue;						//행동이 끝났으니 다시 프롤로그로 도돌이표
					}else {//그러나 비밀번호가 틀렸다면
						System.err.println("글 삭제 실패. 비밀번호 불일치");//경고띄워주기
						//continue해주지 않아도, 아래에 할 행동이 남아있지 않기때문에 알아서 프롤로그로 돌아갈 거에요
					}
				}else if(sel_num==3) {//글을 보다가 3번을 눌렀다면
					System.out.println("새로운 제목을 입력해주세요."); //글을 수정한다는 뜻이니
					String correct_title = 입력.next();		//수정하고 싶은 제목을 입력받고
					System.out.println("내용을 입력해주세요.");	//내용까지 추가
					String correct_content = 입력.next();		//둘 모두 String으로 문자열을 만들어서 받아요
															//컴퓨터나 숫자로 대화하지 인간은 문자를 쓰니까요
					게시판[sel_index][0] = correct_title;		//수정된 제목과
					게시판[sel_index][1] = correct_content;	//본문을 저장소의 보고있는 게시물 0,1번째 정보에 넣어주고
					continue;	//도돌이표로. 입력하지 않아도 도돌이표의 종료 구문이 없기 때문에 돌아갈테지만
								//작성자가 본인의 구분을 위해 넣어두었어요
				}//이렇게 끝!
			}
		}	
	}	
}






