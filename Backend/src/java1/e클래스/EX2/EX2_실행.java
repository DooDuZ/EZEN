package java1.e클래스.EX2;

public class EX2_실행 {
	
	public static void main(String[] args) {
		
		// 1. 객체 선언
		
		Car myCar = new Car();
			// 1. car : 클래스명
			// 2. myCar : 객체명(임의)
			// 3. new : 객체 선언시 사용되는 키워드
			// 4. Car() : 생성자 - 초기값 담당
		// 2. 필드 호출
		
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		System.out.println("속도 : " + myCar.speed);
		
		// 3. 필드값 변경 [ 객체명.필드명 = 새로운 값 ]
		myCar.speed = 60;
		System.out.println("현재 속도 : " + myCar.speed);
	}

}
