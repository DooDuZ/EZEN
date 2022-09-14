package DATABASE.java연동;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC실행2 {
	
	public static void main(String[] args) {
		
		try {			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/shop_db3", 
					"root", 
					"1234");
			System.out.println("연동 성공");
			/*
			String sql = "insert into product values('바나나', 1500, '2021-07-01', '델몬트', 17)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			sql = "insert into product values('카스', 1500, '2022-03-01', 'OB', 3)";
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			sql = "insert into product values('삼각김밥', 800, '2023-09-01', 'CJ', 22)";
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			*/
			
			//1. 카스의 재고 수량을 10으로 수정
			
			String sql = "update product set amount=10 where product_name='카스'";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			//2. 삼각김밥 제거
			sql = "delete from product where product_name='삼각김밥'";
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			//3. 모든 제품의 정보를 console 출력
			
			sql = "select * from product";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {			
				System.out.print("제품명 : " + rs.getString(1) + "\t");
				System.out.print("가격 : " + rs.getString(2) + "\t");
				System.out.print("제조일 : " + rs.getString(3) + "\t");
				System.out.print("제조사 : " + rs.getString(4) + "\t");
				System.out.println("수량 : " + rs.getString(5) + "\t");
			}
			
		}catch( Exception e ){ System.out.println("연동 실패");}
		
	}

}
