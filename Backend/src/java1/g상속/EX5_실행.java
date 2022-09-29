package java1.g상속;

public class EX5_실행 {
	
	public static void main(String[] args) {
		
		// 1. 자동차 생성
		Car car = new Car();
		
		// 2. 자동차 5번 회전
		
		for(int i = 0 ; i<5 ; i++) {
			boolean[] result = car.run();
			if(!result[0]) {
				car.frontLeftTire = new HTire(15, "앞왼쪽");
			}
			if(!result[1]) {
				car.frontRightTire = new HTire(13, "앞오른쪽"); 
			}
			if(!result[2]) {
				car.backLeftTire = new KTire(17, "뒤왼쪽"); 
			}
			if(!result[3]) {
				car.backRightTire = new KTire(16, "뒤오른쪽"); 
			}	
		}	
	}
}
