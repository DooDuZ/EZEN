package java1.jException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {		
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private static Dao dao = new Dao();
	
	private Dao() {
		try {
			con = DriverManager.getConnection(
					"jdbc://mysql://localhost:3306/mmth",
					"root",
					"1234"
					);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static Dao getInstance() {
		return dao;
	}
	
	public void signUp() throws SQLException{
		String sql = "";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
	}
	public void logIn() throws SQLException{
		String sql = "";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
	}
	
	
}
