package java1.e클래스.EX5;

public class EX5_실행 {
	
	public static void main(String[] args) {
		
		// 1. 객체선언 : 빈 생성자
		Car car1 = new Car();
		
		// 2. 객체 선언 : 매개변수가 1개인 생성자
		Car car2 = new Car("자가용");
		
		// 3. 객체 선언 : 매개변수가 2개인 생성자
		Car car3 = new Car("자가용", "빨강");
		
		// 4. 객체 선언 : 매개변수가 3개인 생성자
		Car car4 = new Car("자가용", "빨강", 350);
		
		System.out.println(car1.maxSpeed);
		System.out.println(car2.maxSpeed);
		System.out.println(car3.maxSpeed);
		System.out.println(car4.maxSpeed);
		
	}

}
