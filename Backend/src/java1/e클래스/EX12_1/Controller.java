package java1.e클래스.EX12_1;

public class Controller {
	
	
	Board[] boardlist = new Board[100];
	
	public boolean write_txt(String writer, String password, String title, String content) {
		Board board = new Board(writer, password, title, content, 0);
		
		for(int i = 0 ; i<boardlist.length ; i++) {			
			if(boardlist[i]==null) {
				boardlist[i]=board;
				return true;
			}
		}
		return false;
	}
	public void del_con(int a) {
		for(int i = a ; i<boardlist.length ; i++) {
			boardlist[i] = boardlist[i+1];
			if(boardlist[i+1]==null) {
				break;
			}
		}
	}
	
	public boolean pw_test(int a, String pw) {
		if(boardlist[a].password.equals(pw)) {
			return true;
		}else {
			return false;
		}
	}
}
