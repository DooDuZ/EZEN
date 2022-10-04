package java1.H인터페이스;

public class EX3_실행 {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.run();
		
		System.out.println("타이어 교체");
		
		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		car.backLeftTire = new HankookTire();
		car.backRightTire = new HankookTire();
		
		car.run();
		
	}
	
}
