package java1.키오스크.관리자;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AdminDAO {
		
	private Connection con;				// db 연동 인터페이스
	private PreparedStatement ps;		// db 조작 인터페이스
	private ResultSet rs;				// db 쿼리 조작 인터페이스
	
	//생성자
	
	private static AdminDAO adao = new AdminDAO();  // 싱글톤 DAO 객체 [ 1. 생성자를 private  2.정적 객체 ]
	
	private AdminDAO() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mmth",
					"root", 
					"1234");
			
		} catch (Exception e) {
			System.out.println("DB연동 실패"+e);
		}	
	}
	
	// 3. 메소드
		// 1. 외부에서 싱글톤 객체를 호출하는 메소드
	public static AdminDAO getInstance() { return adao; }
	
	// 기능 메소드
		// 1. 제품 카테고리 추가 로직 [인수 : 메뉴이름 ] [ 반환 : 성공/실패 ]
	boolean inMenu(String menuname) {
		String sql = "insert into menu values(null,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, menuname);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("[DB오류]"+e);
		}
		return false;
	}
		// 2. 카테고리 호출
	ArrayList<MenuDTO> getCategory() {
		ArrayList<MenuDTO> list = new ArrayList<>(); 
		String sql = "select * from menu";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) { // rs.next() : 다음 레코드 읽기
				MenuDTO menu = new MenuDTO(rs.getInt(1), rs.getString(2));
				list.add(menu);
			}
			return list;
		} catch (Exception e) {
			System.out.println("[category호출 실패]"+e);
		}
		return list;
	}
	// 3. 제품 등록
	boolean inProduct(String pname, int pprice, String pcomment, int pamount, int mno) {
		String sql = "insert into product values(null,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, pname);
			ps.setInt(2, pprice);
			ps.setString(3, pcomment);
			ps.setInt(4, pamount);
			ps.setInt(5, mno);			
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("제품 등록 오류" + e);
		}
		return false;
	}
	
	
	
}
