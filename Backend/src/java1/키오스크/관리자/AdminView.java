package java1.키오스크.관리자;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminView {

	Scanner input = new Scanner(System.in);				// 입력 객체
	AdminController acontrol = new AdminController();	// 컨트롤 객체
	public static void main(String[] args) {
		AdminView admin = new AdminView();
		admin.menu();
		
		
	}
	// 메뉴 출력
	void menu() {
		while(true) {
			System.out.println("1.메뉴추가 2.제품추가 3.주문확인");			
			try {
			
				int ch = input.nextInt();
				if(ch==1) {
					inMenu();
				}else if(ch==2) {
					inProduct();
				}else if(ch==3) {
					
				}else {
					System.out.println("알 수 없는 번호입니다.");
				}
				
			} catch (Exception e) {
				System.out.println("(오류발생) 유효하지 않은 입력입니다." + e);
				input = new Scanner(System.in); // input을 초기화 (메모리 새로 할당)
			}		
		}
	}
	// 제품종류 추가 화면
	void inMenu() {
		System.out.println("추가할 카테고리 : ");
		String menuname = input.next();
		boolean result = acontrol.inMenu(menuname);		
		if(result) {
			System.out.println("추가 성공");
		}else {
			System.out.println("등록 실패");
		}
	}
	// 제품 추가 화면
	void inProduct() {
		ArrayList<MenuDTO> list = acontrol.getCategory();
		for(MenuDTO menu : list) {
			System.out.print(menu.getMno() + "\t");
			System.out.println(menu.getMenuname());
		}
		System.out.println("추가할 제품의 번호 선택");
		int mno = input.nextInt();
		
		//제품 추가
		System.out.println("제품명 : "); String pname = input.next();
		System.out.println("가격 : "); int pprice = input.nextInt();
		System.out.println("소개 : "); String pcomment = input.next();
		System.out.println("초기 재고 : "); int pamount = input.nextInt();
		
		boolean result = 
				acontrol.inProduct(pname, pprice, pcomment, pamount, mno);
		if(result) {
			System.out.println("제품등록 성공");
		}else {
			System.out.println("제품 등록 실패");
		}
	}
	// 주문 확인 화면
	void getOrder() {}
	
}


