package Homework.pcroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class pcroomDAO {
	
	private Connection con;				// db 연동 인터페이스
	private PreparedStatement ps;		// db 조작 인터페이스
	private ResultSet rs;				// db 쿼리 조작 인터페이스
	
	//생성자
	
	private pcroomDAO() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/pcroom",
					"root", 
					"1234");
		} catch (Exception e) {
			System.out.println("DB연동 실패"+e);
		}
	}
	
	// 메서드 작성
	public static pcroomDAO getInstance() {
		return pcdao;
	}
	
	
	private static pcroomDAO pcdao = new pcroomDAO();  // 싱글톤 DAO 객체 [ 1. 생성자를 private  2.정적 객체 ]
	
	// 요금제 출력 메서드
	ArrayList<priceDTO> priceViewer(){
		ArrayList<priceDTO> list = new ArrayList<priceDTO>();
		String sql = "select * from pricetable;";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				priceDTO dto = new priceDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				list.add(dto);				
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	void charge(int sel_numb) {
		if(sel_numb==1) {
			//로그인 구현 후 진행
		}
	}
	
	// 좌석 화면 출력 메서드
	ArrayList<currentPcDTO> printSeat () {
		ArrayList<currentPcDTO> list = new ArrayList<currentPcDTO>();
		String sql = "select * from currentPC;";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				currentPcDTO dto = new currentPcDTO(rs.getInt(1), rs.getBoolean(2), rs.getInt(3), rs.getString(4));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}











