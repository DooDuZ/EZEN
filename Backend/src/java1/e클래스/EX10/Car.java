package java1.e클래스.EX10;

public class Car {
	//1. 필드
	int gas;
	//2. 생성자
	//3. 메소드
	
	//1. 반환값X 매개변수 1개
	void setGas(int gas) {this.gas = gas; return;}
	
	//2. 반환값 boolean 매개변수x
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	//3.
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("자동차 주행중.[gas잔량 : "+gas+"]");
				gas-=1;
			}else {
				System.out.println("주행 정지 / 가스 없음");
				return;
			}
		}
	}

}
