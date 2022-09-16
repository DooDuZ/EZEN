package java1.e클래스.EX13_비회원제게시판;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDAO {

	// 필드
		// JDBC 자주 사용하는 클래스 / 인터페이스
	
		Connection con;			// DB 접속 인터페이스
			//con = DriverManager.getConnection("db주소", "db계정명", "db비밀번호")
		PreparedStatement ps;	// 접속된 DB를 SQL 연결 조작하는 인터페이스
		ResultSet rs ;			// SQL 결과를 조작하는 인터페이스
	
	// 2. 생성자
		public BoardDAO() {
			// 빈 생성자에 DB접속 코드 ( 객체 생성시 자동으로 DB 접속 )
			
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql:://localhost:3306/boardtest", 
						"root", 
						"1234");				
			} catch (Exception e) {
				System.out.println("DB접속 실패" + e);
			}
		}
		
		
	// 3. 메소드
		// 1. 등록 메소드
			boolean regist(BoardDTO boardDTO) {
				
				return false;
			}
		// 2. 모든 게시물 출력 메소드
			BoardDTO[] getBoardlist() {
				BoardDTO[] boardlist = null;
				return boardlist;
			}
		// 3. 개별 게시물 출력 메소드
			BoardDTO getBoard(int b_no) {
				BoardDTO board = null;
				return board;
			}
		// 4. 수정 처리 메소드
			boolean update(int b_no, String b_password, String new_title, String new_content) {
				return false;
			}
		// 5. 삭제 처리 메소드
			boolean delete(int b_no, String b_password) {
				return false;
			}
		
}


