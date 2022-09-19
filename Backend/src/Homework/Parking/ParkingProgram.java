package Homework.Parking;

import java.util.Scanner;

public class ParkingProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean section = true;
		int section_info ;
		boolean section2 = true;
		int section2_info ;
		boolean section3 = true;
		int section3_info ;
		boolean section4 = true;
		int section4_info ;
		
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
			}
			
			System.out.println("차량 번호를 입력해주세요");
			int car_info = input.nextInt();
			if(car_info<1000 || car_info>9999) {
				System.out.println("차량번호 4자리를 입력해 주세요.");
				continue;
			}
			System.out.println("주차를 원하는 자리를 입력해 주세요.");
			int sel_section = input.nextInt();
			if(sel_section==1) {
				if(section) {
					System.out.println("");
				}
			}
			
			
			
		}
		
		
	}
	
	
}
