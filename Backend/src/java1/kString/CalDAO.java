package java1.kString;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CalDAO {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static CalDAO dao = new CalDAO();
	
	private CalDAO() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/calendar",
					"root", 
					"1234");			
		} catch (Exception e) {
			System.out.println("DB연동 실패"+e);
		}
	}
	
	public static CalDAO getInstance() {
		return dao;
	}
	
	boolean addSchedule(String addDate, String addComment) {
		String sql = "insert into calData values (null, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, addDate);
			ps.setString(2, addComment);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("[경고] DB 오류 발생" + e);
		}
		return false;
	}
	HashMap<Integer, ArrayList<String>> printSchedule(String checkDate){
		HashMap<Integer, ArrayList<String>> list = new HashMap<Integer, ArrayList<String>>();
		String sql = "select * from calData where substring(date, 1, 6) = ?";
		//String sql = "select * from calData where date like ?%";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, checkDate);
			rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList<String> values = new ArrayList<>();
				values.add(rs.getString(2));
				values.add(rs.getString(3));
				list.put(rs.getInt(1), values);
			}
			return list;
		} catch (Exception e) {
			System.err.println("[경고] DB 오류 발생" + e);
		}
		return list;		
	}
	
	
}
