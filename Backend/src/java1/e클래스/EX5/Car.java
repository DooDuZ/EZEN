package java1.e클래스.EX5;

public class Car {
	
	// 목적 : 반복적인 코드, 식별용[내부 필드와 매개변수 ]
	// this.필드명		: 현재 클래스의 필드 호출
	// this()		: 현재 클래스의 생성자 호출
	// this.메소드명	: 현재 클래스의 메소드 호출
	
	// 필드
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	// 생성자
		// 오버로딩 : 동일한 생성자 명으로 여러개 선언
		// 1. 빈 생성자 : 매개변수가 없는 생성자[기본생성자]
		Car(){}
		// 2. 매개변수가 1개인 생성자
		Car(String model){
			this.model = model;
		}
		// 3. 매개변수가 2개인 생성자
		Car(String model, String color){
			this(model, color, 5000);
		}
		// 4. 매개변수가 3개인 생성자
		Car(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;			
		}
	
}
