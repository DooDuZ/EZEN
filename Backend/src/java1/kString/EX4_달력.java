package java1.kString;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java1.e클래스.EX15_정적멤버.Calculator;

public class EX4_달력 {
	///////////////////////////////////////////////////////////////
	// 1. 필드
	Scanner input = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH)+1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	// 2. 생성자
	
	
	// 3. 메소드
	
	void run() {
		while(true) {
			cal.set(year, month-1, 1);
			int sweek = cal.get(Calendar.DAY_OF_WEEK);
			int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.printf("====== %d 년 %d 월의 달력\n", year, month);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			for(int i = 1; i<sweek ; i++) {
				System.out.print(" \t");
			}
			for(int i=1 ; i<=eday ; i++) {
				System.out.print(i+"\t");
				if(i%7==(7-sweek+1)) {
					System.out.print("\n");
				}
			}
			System.out.println("");
			/////////////////////////////////////////////////////////////////
			System.out.println("◀이전달[1] ▶다음달[2] 검색[3] 일정추가[4]");
			int btn = input.nextInt();
			if(btn==1) {
				month--;
				if(month==0) {
					month = 12;
					year--;
				}
			}else if(btn==2) {
				month++;
				if(month==13) {
					month = 1;
					year++;
				}
			}else if(btn==3) {
				System.out.println("연도 입력");
				int inputYear = input.nextInt();
				System.out.println("월 입력"); 
				int inputMonth = input.nextInt();
				if(inputYear>9999 || inputYear<1900 || inputMonth<1 || inputMonth>12) {
					System.out.println("지원하지 않는 날짜입니다.");
				}else {
					year = inputYear;
					month = inputMonth;
				}
			}else if( btn==4 ) {
				System.out.println("1.일정 추가\t2.일정 확인\t3.일정 삭제");
				int ch = input.nextInt();
				if(ch==1) {
					addSchedule();
				}else if(ch==2) {
					System.out.println("연/월 입력 : ");
					String checkDate = input.next();
					System.out.println("======todoList======");
					printSchedule (checkDate);
					System.out.println("======todoList======");
				}else {
					System.out.println("유효하지 않은 숫자입니다.");
				}
			}			
		}
	} // run 메소드
	
	
	// 날짜, 메모 등 기능 추가
	
	void addSchedule () {
		System.out.println("=====일정 추가=====");
		System.out.println("날짜 입력 : yyyymm");
		String addDate = input.next();
		System.out.println("내용 입력 : ");		
		String addComment = input.next();
		if(addDate.length()>6) {
			System.out.println("잘못된 입력입니다.");
			return;
		}		
		boolean result = CalDAO.getInstance().addSchedule(addDate, addComment);
		if(result) {
			System.out.println("일정 추가 완료");
		}else {
			System.err.println("[경고]일정 등록 실패");
		}
	}
	void printSchedule (String checkDate) {
		HashMap<Integer, ArrayList<String>> list = CalDAO.getInstance().printSchedule(checkDate);
		for(Integer key : list.keySet()) {
			for(String tmp : list.get(key)) {
				System.out.println(tmp);
			}
		}
	}	
}















