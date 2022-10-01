package java1.jException;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EX4_실행 {		
	public void signUp() throws SQLException{
		try {
			Dao.getInstance().signUp();
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
	
	public void logIn() throws SQLException {
		try {
			Dao.getInstance().logIn();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		EX4_실행 view = new EX4_실행();
		Scanner input = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("1.회원가입 2.로그인");
				int ch = input.nextInt();
				if(ch==1) {
					view.signUp();
				}else {
					view.logIn();
				}				
			} catch (SQLException e) {
				System.out.println("DB 오류 : " + e);
			} catch (InputMismatchException e) {
				System.out.println("입력 오류" + e);
				input = new Scanner(System.in);
			}
		}
	}	
}
