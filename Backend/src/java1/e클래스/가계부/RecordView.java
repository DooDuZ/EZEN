package java1.e클래스.가계부;

import java.util.ArrayList;
import java.util.Scanner;

public class RecordView {
	static Scanner input = new Scanner(System.in);
	RecordController RC = new RecordController();
	
	public static void main(String[] args) {
		RecordView RV = new RecordView();
		while(true) {
			System.out.println("=====가계부=====");
			
			RV.getList();
			
			System.out.println("[메뉴버튼] 1.추가 2.삭제 3.수정 4.검색 5.통계");
			int ch = input.nextInt();
			if(ch==1) {
				RV.addList();
			}else if(ch==2) {
				RV.deleteList();
			}else if(ch==3) {
				RV.updateList();
			}else if(ch==4) {
				RV.findDate();
			}else if(ch==5) {
				RV.getStats();
			}else {
				
			}
		}
	}	
	
	void getList() {
		ArrayList<RecordDTO> list = RC.getList();
		for( RecordDTO tmp : list) {
			System.out.println(tmp.getrNo()+"\t"+ tmp.getdRecord() +"\t"+tmp.getPrice()+"\t"+tmp.getContent());
		}
	}
	
	boolean addList() {
		System.out.println("날짜 : ");
		String dRecord = input.next();
		System.out.println("금액 : ");
		int price = input.nextInt();
		System.out.println("내용 : ");
		String content = input.next();
		
		boolean result = RC.addList(dRecord, price, content);
		if(result) {
			System.out.println("등록 완료");
			return true;
		}else {
			System.out.println("[경고]등록 실패");
			return false;
		}
	}
	
	void deleteList() {
		System.out.println("삭제할 레코드 번호 입력");
		int selNo = input.nextInt();
		boolean result = RC.deleteList(selNo);
		if(result) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("[경고]삭제 실패");
		}
	}
	void updateList() {
		System.out.println("수정할 레코드 번호 입력");
		int selNo = input.nextInt();
		System.out.println("날짜 : ");
		String dRecord = input.next();
		System.out.println("금액 : ");
		int price = input.nextInt();
		System.out.println("내용 : ");
		String content = input.next();
		
		boolean result = 
				RC.updateList(selNo, dRecord, price, content);
		if(result) {
			System.out.println("수정 성공");	
		}else {
			System.out.println("[경고]수정 실패");
		}
	}
	void findDate() {
		System.out.println("날짜별 목록");
		System.out.println("날짜입력 : yyyymmdd");
		int dRecord = input.nextInt();
		if(dRecord>99999999 || dRecord<10000000) {
			System.out.println("날짜 형식 오류");
		}
		ArrayList<RecordDTO> list = RC.findDate(dRecord);
		for(RecordDTO dto : list) {
			System.out.println(dto.getdRecord() + "입출 리스트");
			System.out.println(dto.getrNo()+"\t"+dto.getPrice()+"\t"+dto.getContent());
		}
	}
	void getStats() {
		ArrayList<RecordDTO> list = RC.getStats();
		for( RecordDTO tmp : list) {
			System.out.println(tmp.getdRecord() + "\t 지출 :" + tmp.getPrice());
		}		
	}
}
