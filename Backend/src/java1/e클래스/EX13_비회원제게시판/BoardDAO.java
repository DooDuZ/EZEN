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
						"jdbc:mysql://localhost:3306/boardtest", 
						"root", 
						"1234");				
			} catch (Exception e) {
				System.out.println("DB접속 실패" + e);
			}
		}
		
		
	// 3. 메소드
		// 1. 등록 메소드
			boolean regist(BoardDTO boardDTO) {
				String sql = "insert into board(b_title, b_content, b_writer, b_password, b_view )"
						+"values(?,?,?,?,?)";
								
						/*
						+ "values(" + boardDTO.b_title +","
								+ boardDTO.b_content +","
								+ boardDTO.b_writer +","
								+ boardDTO.b_password + ","
								+ boardDTO.b_view + ")" ;		
						*/
				try {
					ps = con.prepareStatement(sql);
						ps.setString(1, boardDTO.b_title);
						ps.setString(2, boardDTO.b_content);
						ps.setString(3, boardDTO.b_writer);
						ps.setString(4, boardDTO.b_password);
						ps.setInt(5, 0);
					ps.executeUpdate();
					return true;
				}catch (Exception e) {
					System.out.println("경고) DB오류");
					return false;
				}				
			}
			
		// 게시물 카운트 메소드	
			int getrows() {
				String sql = "select count(*) from board";
				try {
					ps = con.prepareStatement(sql);
					rs = ps.executeQuery();
					if(rs.next()) {
						return rs.getInt(1);
					}
					
				} catch (Exception e) {
					System.out.println("DB count 오류");
				}
				return 0;				
			}
			
		// 2. 모든 게시물 출력 메소드
			BoardDTO[] getBoardlist() {
				int count = getrows();
				BoardDTO[] boardlist = new BoardDTO[count];
				String sql = "select * from board";
				try {
					ps = con.prepareStatement(sql);
					rs = ps.executeQuery(); // select : excuteQuery
											// insert,update,delete : excuteUpdate
						//rs -> null -> .next() -> 검색된 행[레코드] -> 다음 행[레코드]	
					int index = 0;
					while(rs.next()) {		//레코드 한개당 필드 6개
						int b_no = rs.getInt(1); 		// 해당 레코드의 첫번째 필드의 데이터 호출
						String b_title = rs.getString(2);
						String b_content = rs.getString(3);
						String b_writer = rs.getString(4);
						String b_password = rs.getString(5);
						int b_view = rs.getInt(6);
						
						BoardDTO boardDTO = new BoardDTO(b_no, b_title, b_content, b_writer, b_password, b_view);
						boardlist[index] = boardDTO;
						index++;
					}					
				} catch (Exception e) {
					System.out.println("DB 오류");
				}
				return boardlist;				
			}
		// 3. 개별 게시물 출력 메소드
			BoardDTO getBoard(int b_no) {
				BoardDTO board = null;
				String sql = "select * from board where b_no=?";
				try {
					ps = con.prepareStatement(sql);
					ps.setInt( 1 , b_no);
					rs = ps.executeQuery();
					if(rs.next()) {
						board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
												rs.getString(4), rs.getString(5), rs.getInt(6));
					}
				} catch (Exception e) {
					System.out.println("DB 오류");
				}				
				return board;
			}
		// 4. 수정 처리 메소드
			boolean update(int b_no, String b_password, String new_title, String new_content) {
				BoardDTO board = null;
				String sql = "select * from board where b_no=?";
				try {
					ps = con.prepareStatement(sql);
					ps.setInt( 1 , b_no);
					rs = ps.executeQuery();
					
					if(rs.next()) {
						board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
								rs.getString(4), rs.getString(5), rs.getInt(6));
					}
					if(board.b_password.equals(b_password)) {
						board.b_title = new_title;
						board.b_content = new_content;
						
						sql = "update board set b_title= ?,  b_content=? where b_no = ?;";
						ps = con.prepareStatement(sql);
						ps.setString(1, new_title);
						ps.setString(2, new_content);
						ps.setInt(3, b_no);
						ps.execute();
						return true;
					}
					
				} catch (Exception e) {
					System.out.println("DB오류");
				}				
				return false;
			}
		// 5. 삭제 처리 메소드
			boolean delete(int b_no, String b_password) {
				BoardDTO board = null;
				String sql = "select * from board where b_no=?";
				try {
					ps = con.prepareStatement(sql);
					ps.setInt(1, b_no);
					rs = ps.executeQuery();
					
					if(rs.next()) {
						board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
								rs.getString(4), rs.getString(5), rs.getInt(6)); 
					}
					if(board.b_password.equals(b_password)) {
						sql = "delete from boardtest.board where b_no = ?";
						ps = con.prepareStatement(sql);
						ps.setInt(1, b_no);
						ps.execute();
						return true;						
					}
					
				} catch (Exception e) {
					return false;
				}
				
				return false;
			}
		
}


