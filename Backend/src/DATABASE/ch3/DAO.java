package DATABASE.ch3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;




// 이해X
// 걍 돼서 했음
// 뒤로 갈수록 이상함 참고 금지...!

public class DAO {
	//1 필드
	Connection con;			// db 연결 인터페이스
	PreparedStatement ps;	// sql 연결/조작 인터페이스
	ResultSet rs;			// sql결과[쿼리] 조작 인터페이스
	
	//2 생성자
	public DAO() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/market_db",
					"root", 
					"1234");
		} catch (Exception e) {
			System.out.println("DB 연결 실패" + e);
		}
	};
	// 3 메서드
	// 1. 예제 1 : 레코드 10줄 -> memberDTO 8개 -> 배열/리스트
	public ArrayList<DTO> 예제1결과() {
		
		// 배열 대신 리스트 사용 -> [ 컬렉션 프레임워크 ]
			//	ArrayList<리스트에 들어갈 클래스> = new ArrayList<>();
			// <> 제네릭 : 클래스 안에 클래스 넣을 때 사용
			// 리스트에 객체 담기 : 리스트명.add
		ArrayList<DTO> list = new ArrayList<>(); 
		
		// 1. sql 작성
		String sql = "select * from member";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				//레코드를 객체화
				DTO dto = new DTO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), 
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			System.out.println("[경고] 에러 발생");
		}
		return list;
	}
	
	DTO 예제3결과(){
		DTO dto = null;
		String sql = "select * from member where mem_name = '블랙핑크'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto = new DTO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), 
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
			}
		} catch (Exception e) {
			System.out.println("DB불러오기 실패"+e);
		}
		return dto;
	}
	
	ArrayList<DTO> 예제4결과(){
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select mem_id , mem_name from member where height <= 162";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), rs.getString(2), 0, sql, sql, sql, 0, sql);
				list.add(dto);	
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<DTO> 예제5결과(){
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select mem_name , height , mem_number from member where height >= 165 and mem_number > 6";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), rs.getInt(2) , rs.getInt(3));
				list.add(dto);	
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<DTO> 예제6결과(){
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select mem_name , height , mem_number from member where height >= 165 or mem_number > 6";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), rs.getInt(2) , rs.getInt(3));
				list.add(dto);	
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<DTO> 예제7결과() {
		ArrayList<DTO> list = new ArrayList<>(); 
		String sql = "select * from member where mem_name like '우%'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), 
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			System.out.println("[경고] 에러 발생");
		}
		return list;
	}
	ArrayList<DTO> 예제8결과() {
		ArrayList<DTO> list = new ArrayList<>(); 
		String sql = "select * from member where mem_name like '__핑크'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), 
						rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			System.out.println("[경고] 에러 발생");
		}
		return list;
	}
	ArrayList<DTO> 예제9결과(){
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select mem_id , mem_name , debut_date from member order by debut_date desc";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), rs.getString(2) , rs.getString(3));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<DTO> 예제10결과(){
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select mem_id , mem_name , debut_date , height from member where height >= 164 order by height desc";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), rs.getString(2) , rs.getString(3), rs.getInt(4));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<DTO> 예제11결과(){
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select mem_id , mem_name , debut_date , height from member where height >= 164 order by height desc , debut_date asc";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), rs.getString(2) , rs.getString(3), rs.getInt(4));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<DTO> 예제12결과(){
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select mem_name , height from member order by height desc limit 3 , 2 ";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(sql, rs.getString(1) , sql, rs.getInt(2));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<String> 예제13결과(){
		ArrayList<String> list = new ArrayList<>();
		String sql = " select distinct addr from member";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				String dto = rs.getString(1);
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<BuyDTO> 예제14결과(){
		ArrayList<BuyDTO> list = new ArrayList<>();
		String sql = "select mem_id , sum(amount) as 수량합계 from buy group by mem_id";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO dto = new BuyDTO(rs.getString(1), rs.getInt(2));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<BuyDTO> 예제15결과(){
		ArrayList<BuyDTO> list = new ArrayList<>();
		String sql = " select mem_id as 회원_아이디 , sum( price*amount )  as 총_구매금액 from buy group by mem_id";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO dto = new BuyDTO(rs.getString(1), rs.getInt(2));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<BuyDTO> 예제16결과(){
		ArrayList<BuyDTO> list = new ArrayList<>();
		String sql = "select mem_id , avg( amount ) as 수량평균 from buy group by mem_id";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO dto = new BuyDTO(rs.getString(1), rs.getInt(2));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<DTO> 예제17결과(){
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select mem_id , count( phone1 ) as 연락처 from member group by mem_id";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), sql, 0, sql, rs.getString(2), sql, 0, sql);
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<DTO> 예제18결과(){
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select mem_id , count( * ) as 회원수 from member group by mem_id";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				DTO dto = new DTO(rs.getString(1), sql, 0, sql, rs.getString(2), sql, 0, sql);
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	ArrayList<BuyDTO> 예제19결과(){
		ArrayList<BuyDTO> list = new ArrayList<>();
		String sql = "select mem_id as 회원아이디 , sum( price * amount ) as 총구매금액\r\n"
				+ "from buy\r\n"
				+ "group by mem_id\r\n"
				+ "having sum( price * amount ) > 1000         \r\n"
				+ "order by sum( price * amount ) desc;\r\n"
				+ "";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO dto = new BuyDTO(rs.getString(1), rs.getInt(2));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("에러 발생" + e);
		}
		return list;
	}
	
	
	
}



/*
 	1. 리스트 선언
 		ArrayList<dataType> 리스트명 = new ArrayList<>();
 	2. 리스트 객체 추가
 		리스트명.add(객체명)
 	3. 반복문 리스트 활용
 		for(클래스명 반복변수명 : 리스트명){
 			
 		}
 */

