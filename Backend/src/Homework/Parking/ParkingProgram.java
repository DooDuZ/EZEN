package Homework.Parking;

import java.sql.Date;
import java.util.Scanner;


/*
 * 번아웃 온게 아직 진정이 안대서 맥주 4병 묵고 짰음니다... 용서해주십시어..
 * 차량 번호판 입력은 input = 센서가 처리해준다 ---> 그러나 난 센서 그딴거 없으니 손으로 입력하자 ...라고 생각하고 했음니다.
 *
 */

/*
 	1. 안내 문구 출력
 		* 프로그램 내용 출력 ex) =========주차장==========
 		* 사용자가 안내 받아야 할 내용 출력
 			* 주차 가능한 자리 시각화 [ boolean 값 4개 ]
 			* 만석인 경우 안내 문구 후 종료
 	2. 사용자 정보 입력 받기
 		* scanner 사용. 코테도 아니고 버퍼리더 귀찮음니다...
 		* 각 boolean 값마다 대응 하는 사용자 정보 변수 선언 (String or int)
		* 
 	3. 입력 받은 정보 처리 가능 판단
  		* 사용자 선택한 int값과 대응하는 boolean 값 논리 검사
  		* true인 경우 대응하는 int 변수에 차량 정보 저장 및 안내문구 출력 후 continue ( 주차해도 주차장 기능은 돌아가니까 )
 		* false인 경우 안내문구 출력 후 continue ( 재선택 해야하므로 )
 		* 처리 값 따라 출력되는 주차장 시각 정보 변경ㄱ
 	4. 출차 기능 추가
 		* 출차하는 차량의 정보 입력 받기 [ int로 입력 받아 boolean 값 및 대응하는 차량 번호 판단 ]
 		* 주차 시간에 따른 주차 요금 정산 기능 추가 [ new date로 주차시 정보 저장 / 출차 시간과 비교 ]
 		* 정산 요금 입력 반기 [ next.int() ]
 		* 정산 완료 시 거스름돈 출력 or 요금 부족 출력
 		* 출차 후 boolean 값 및 차량 정보 데이터 변경
 */




public class ParkingProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean section = true;
		int section_info = 0;
		
		boolean section2 = true;
		int section2_info = 0;
		boolean section3 = true;
		int section3_info = 0;
		boolean section4 = true;
		int section4_info = 0;
		
		while(true) {
			System.out.println("=========주차장 입장==========");
			System.out.println("====주차 가능 자리====");
			if(section) {
				System.out.print("[ ]");
			}else {
				System.out.print("[X]");
			}
			if(section2) {
				System.out.print("[ ]");
			}else {
				System.out.print("[X]");
			}
			if(section3) {
				System.out.print("[ ]");
			}else {
				System.out.print("[X]");
			}
			if(section4) {
				System.out.println("[ ]");
			}else {
				System.out.println("[X]");
			}
			if(!section && !section2 && !section3 && !section4) {
				System.out.println("주차 가능한 자리가 없습니다.");
				return;
			}
			
			System.out.println("차량 번호를 입력해주세요");
			int car_info = input.nextInt();
			if(car_info<1000 || car_info>9999) {
				System.out.println("차량번호 4자리를 입력해 주세요.");
				continue;
			}else if(car_info==section_info || car_info==section2_info || car_info==section3_info || car_info==section4_info) {
				System.out.println("[관리자 문의] 차량 번호 오류");
				continue;
			}
			
			System.out.println("주차를 원하는 자리를 입력해 주세요.");
			int sel_section = input.nextInt();
			if(sel_section==1) {
				if(section) {
					System.out.println("주차 완료");
					section_info = car_info;
					section = false;
				}else {
					System.out.println("[주차 불가] 빈 자리를 선택해 주세요.");
					continue;
				}
			}else if(sel_section==2) {
				if(section2) {
					System.out.println("주차 완료");
					section2_info = car_info;
					section2 = false;
				}else {
					System.out.println("[주차 불가] 빈 자리를 선택해 주세요.");
					continue;
				}
			}else if(sel_section==3) {
				if(section3) {
					System.out.println("주차 완료");
					section3_info = car_info;
					section3 = false;
				}else {
					System.out.println("[주차 불가] 빈 자리를 선택해 주세요.");
					continue;
				}
			}else if(sel_section==4) {
				if(section4) {
					System.out.println("주차 완료");
					section4_info = car_info;
					section4 = false;
				}else {
					System.out.println("[주차 불가] 빈 자리를 선택해 주세요.");
					continue;
				}
			}else {
				System.out.println("유효한 번호가 아닙니다.");
				continue;
			}
			
			
			
			
		}
		
		
	}
}
