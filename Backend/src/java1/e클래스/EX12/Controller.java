package java1.e클래스.EX12;

public class Controller {
	
	
	static Board[] boardlist = new Board[100];
	
	static boolean push_txt(String title, String content, String writer, String password) {
		Board board = new Board(title, content, writer, password, 0);
		
		for(int index = 0 ; index<boardlist.length ; index ++ ) {
			if(boardlist[index]==null) {
				boardlist[index] = board;
				return true;
			}
		}
		return false;
	}
	static boolean delete_txt(int txt_numb, String PW) {
		if(PW.equals(boardlist[txt_numb].password)) {
			for(int i = txt_numb ; i<boardlist.length ; i++) {
				boardlist[i] = Controller.boardlist[i+ 1];
				if(boardlist[i+1]==null) {
					break;
				}
			}
			return true;
		}else {
			return false;
		}		
	}
	static boolean correct_txt(int txt_numb, String PW) {
		if(PW.equals(boardlist[txt_numb].password)) {
			return true;
		}else {
			return false;
		}		
	}
}
