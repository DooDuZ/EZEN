package java1.키오스크.관리자;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminController {
	

	// 제품종류 추가 로직
	boolean inMenu(String menuname) {
		return AdminDAO.getInstance().inMenu(menuname);
	}
	// 제품종류 호출 로직
	ArrayList<MenuDTO> getCategory() {
		return AdminDAO.getInstance().getCategory();
	}
	
	// 제품 추가 로직
	boolean inProduct(String pname, int pprice, String pcomment, int pamount, int mno) {
		return AdminDAO.getInstance().inProduct(pname, pprice, pcomment, pamount, mno);				
	}
	// 주문 확인 로직
	void getOrder() {}
	

}
