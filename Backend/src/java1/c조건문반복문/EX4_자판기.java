package java1.c조건문반복문;

import java.util.Scanner;

public class EX4_자판기 {
		
	
	public static void main(String[] args) {
		Scanner 자판기 = new Scanner(System.in);
		
		int 콜라 = 10;
		int 환타 = 10;
		int 사이다 = 10;
		int selected1 = 0;
		int selected2 = 0;
		int selected3 = 0;
	
		int 결제판단 = 1;
		int 투입금액 ;
		
		
		while(결제판단==1) {		
			if(콜라+사이다+환타==0){
				System.err.println("상품 재고 없음");
				break;
			}
			System.out.println("=================================\n");
			System.out.println("콜라(400) 재고 : " + 콜라 + "개\n" + "환타(300) 재고 : " + 환타 + "개\n" + "사이다(200) 재고 : " + 사이다 + "개\n");
			System.out.println("음료를 선택해 주세요.\n 1.콜라 2.환타 3.사이다");
			System.out.println("번호입력 : ");
			int 선택 = 자판기.nextInt();			
			
			if(선택 == 1) {
				if(콜라>0) {
					콜라--;
					selected1++;
				}else {
					System.err.println("재고 없음");
				}
			}else if(선택 == 2 ) {
				if(환타>0) {
					환타--;
					selected2++;
				}else {
					System.err.println("재고 없음");
				}
			}else if(선택 == 3 ) {
				if(사이다>0) {
					사이다--;
					selected3++;
				}else {
					System.err.println("재고 없음");
				}
			}
			
			System.out.println("콜라 재고(400) : " + 콜라 + "개\n" + "환타 재고(300) : " + 환타 + "개\n" + "사이다(200) 재고 : " + 사이다 + "개\n");
			System.out.println("==========장바구니==========");
			System.out.println("콜라 : " + selected1 +"개\n" + "환타 : " + selected2 +"개\n" + "사이다 : " + selected3 +"개\n");
			System.out.println("==========장바구니==========");
			
			if(콜라+사이다+환타==0){
				System.out.println("남은 상품 없음. 선택한 상품을 결제 해주세요.");
				결제판단=2;
			}else{
				System.out.println("1.더 고르기 2.선택완료/결제");
				결제판단 = 자판기.nextInt();
			}
			if(결제판단==2) {
				System.out.println("총 결제 금액 : "  + (400*selected1+ 300*selected2 + 200*selected3) + "원" );
				System.out.println("금액을 투입해주세요.");
				투입금액 = 자판기.nextInt();
				if(투입금액>=(400*selected1+ 300*selected2 + 200*selected3)) {
					System.out.println("콜라 : " + selected1 + "개, " + "환타 : " + selected2 + "개, " + "사이다" + selected3 + "개 결제 완료");
					System.out.println("거스름돈 : " + (투입금액-(400*selected1+ 300*selected2 + 200*selected3))+"원");
				}else{
					System.err.println("금액부족/결제 실패");
					System.err.println("제품을 다시 담아 주세요.");
					콜라 += selected1;
					환타 += selected2;
					사이다 += selected3;					
				}
				selected1 = 0;
				selected2 = 0;
				selected3 = 0;					
				결제판단 = 1;
			}
		}//while end	
	}	//기능추가 : 장바구니 상품 빼기 + 관리자모드 만들기(id+비밀번호 검증 후 재고추가 및 매출 현황 확인)
}



/*

	자판기 프로그램
		[조건]
		
		1. 제품 : 콜라, 환타, 사이다
		2. 초기재고 : 각 10개씩 
		3. 메뉴판에서 선택한 제품을 장바구니에 담기
		4. 결제를 선택했을 때 장바구니 현황 표시 [ 결제 ]
		5. 금액 부족 시 결제 취소 / 금액이 크면 잔돈
		[화면구현]
		1. 메뉴판 : 1.콜라 2.환타 3.사이다 4.결제
		2. 
		
	



*/