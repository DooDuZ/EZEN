package java1.e클래스.가계부;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RecordDAO {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	static RecordDAO Rdao = new RecordDAO();
	
	
	private RecordDAO() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/moneyRecord",
					"root", 
					"1234");			
		} catch (Exception e) {
			System.out.println("[DB접속 실패]"+e);
		}			
	}
	
	public static  RecordDAO getRDAO() {
		return Rdao;
	}
	
	// 기능 메서드
	
	// 리스트 호출
	ArrayList<RecordDTO> getList() {
		ArrayList<RecordDTO> list = new ArrayList<>();
		String sql = "select * from record";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					RecordDTO dto = new RecordDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
					list.add(dto);
				}
				return list;
			} catch (Exception e) {
				// TODO: handle exception
			}
		return list;
	}
	// 입력
	boolean addList(RecordDTO dto) {
		String sql = "insert into record values (null, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
				ps.setString(1, dto.getdRecord());
				ps.setInt(2, dto.getPrice());
				ps.setString(3, dto.getContent());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("DB오류"+e);
		}
		return false;
	}
	boolean deleteList(int rNo) {
		String sql = "delete from record where rNo=?";
		try {
			ps = con.prepareStatement(sql);
				ps.setInt(1, rNo);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("DB오류"+e);
		}
		return false;
	}
	boolean updateList(RecordDTO dto) {
		String sql = "update record set dRecord=?, price=?, content=? where rNo=?";
		try {
			ps = con.prepareStatement(sql);
				ps.setString(1, dto.getdRecord());
				ps.setInt(2, dto.getPrice());
				ps.setString(3, dto.getContent());
				ps.setInt(4, dto.getrNo());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("DB오류"+e);
		}
		return false;
	}
	ArrayList<RecordDTO> findDate(int dRecord) {
		ArrayList<RecordDTO> list = new ArrayList<>();
		String sql = "select * from record where dRecord=?";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt(1, dRecord);
				rs = ps.executeQuery();
				while(rs.next()) {
					RecordDTO dto = new RecordDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
					list.add(dto);
				}
				return list;
			} catch (Exception e) {
				System.out.println("DB오류"+e);
			}
		return list;		
	}
	ArrayList<RecordDTO> getStats() {
		ArrayList<RecordDTO> list = new ArrayList<>();
		String sql = "select dRecord, sum(price) from record group by dRecord";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				RecordDTO dto = new RecordDTO(rs.getString(1), rs.getInt(2));
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
















