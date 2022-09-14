package DATABASE.java연동;

import java.sql.Connection;			// DB 연동 인터페이스
import java.sql.DriverManager;		// DB 드라이버 클래스 [ 드라이버 데이터 ]
import java.sql.PreparedStatement;	// sql 조작 인터페이스
import java.sql.ResultSet;			// sql 결과 조작 인터페이스

public class JDBC실행 {

	public static void main(String[] args) {
		
		// JDBC : 자바와 DB 연동
			// 1. 라이브러리 필요! [ ]
				// * jar 미리 만들어진 클래스들의 집합 
			// 2. 해당 프로젝트 라이브러리 추가
				// 1. 해당 프로젝트 오른쪽 클릭
				// 2. build path -> configure build path
				// 3. libraries 탭 선택
				// 4. add External jar -> 해당 jar파일 선택
					// * 해당 jar 파일의 경로 변경되면 라이브러리 실행 불가능
				// 5. apply
			// 3. 미리 만들어진 JDBC관련된 클래스를 사용할 수 있다.
				// 1. Connection : 인터페이스
				// 2. DriverManager : 클래스
					// 3. .getConnection : 메소드 ( db주소, db계정명, db 비밀번호 ) : 메소드
		
			// MYSQL 연동 할 때 해당 클래스에서 예외(오류 발생)
				// * 연동 실패 했을 경우 그에대한 대처를 작성하지 않았기 때문
				// 해결 방안 : 예외 처리 [ try ~ catch ] 
		try { // 만일 try 안에서 예외가 발생하면 catch로 코드 흐름이 이동
			// 예외가 없으면 try 만 실행
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysql드라이버 이름
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/shop_db3", 
					"root", 
					"1234");
			System.out.println("DB 연동 성공");
			
		// * JDBC에서 SQL 조작
		// 1. 테이블에 데이터 추가
			// 1. sql 문법을 ""감싸고 문자열 변수에 저장
			/*
			String sql = "insert into member values('tess' ,'나훈아','경기 부천시 중동')";
			// 2. sql 조작 인터페이스
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			sql = "insert into member values('팔레트' ,'IU','청담동')";
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			sql = "insert into member values('jyp' ,'박진영','알바아님')";
			ps = con.prepareStatement(sql);			
			ps.executeUpdate();
			*/
			// 박진영 주소 변경
			/*
			String sql = "update member set member_addr = '경기도 안산시 상록구' where member_id='jyp'";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			// 삭제
			
			sql = "delete from member where member_id='jyp'";
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			*/
			
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
				// 결과 레코드[행] 여러개 존재하기 때문에 ResultSet에 인터페이스 저장
				// 반복문을 이용한 레코드 하나씩 출력
					// null -> 검색레코드1 - > 검색레코드2
					// .next() : 다른 레코드 호출
					// getString(필드 순서번호) : n번째 필드 데이터 가져오기(문자열)
					// getInt(필드 순서번호) : n번째 필드 데이터 가져오기(정수형)
					// 레코드/필드는 1번부터 존재 [ index와 다름 ]
			while(rs.next()) {
				System.out.print("회원ID : " + rs.getString(1) +"\t"); // 첫번째 필드 데이터 가져오기
				System.out.print("회원명 : " + rs.getString(2) +"\t"); // 두번째 필드 데이터 가져오기
				System.out.print("회원주소 : " + rs.getString(3) +"\n"); // 세번째 필드 데이터 가져오기
			}
			
		
			
			
			
		}catch( Exception e ) { System.out.println("연동 실패");}
	}
	
}
