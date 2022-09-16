package java1.e클래스.EX13_비회원제게시판;

public class BoardControl {

	
	BoardDAO boardDAO = new BoardDAO();
	// 1.
	boolean regist( String b_title, String b_content, String b_writer, String b_password) {
		
		BoardDTO boardDTO = new BoardDTO(0, b_title, b_content, b_writer, b_password, 0);
		
		boolean result = boardDAO.regist(boardDTO);
		return result;
	}
	
	// 2.
	BoardDTO[] getBoardlist() {
		BoardDTO[] boardlist = boardDAO.getBoardlist();
		return boardlist;
	}
	// 3. 
	BoardDTO getBoard(int b_no) {
		BoardDTO board = null;
		board = boardDAO.getBoard(b_no);
		return board;
	}
	
	// 4. 
	boolean update(int b_no, String b_password, String new_title, String new_content) {
		boolean board = boardDAO.update(b_no, b_password, new_title, new_content);
		
		if(board) {
			return true;
		}else {
			return false;
		}		
	}
	// 5.
	boolean delete(int b_no, String b_password) {
		
		return false;
	}
	
}
