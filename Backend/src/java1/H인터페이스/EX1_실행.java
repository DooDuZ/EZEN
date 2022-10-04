package java1.H인터페이스;

public class EX1_실행 {
	
	public static void main(String[] args) {
		// 1. 객체[인터페이스x]
		Television tv = new Television();
		
		// 인터페이스 변수명 = new 구현클래스();
		RemoteControl rc;
		
		// 메소드 실행
		rc = new Television();
		rc.turnOn();
		
		// tv->audio
		rc = new Audio();		
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		
		System.out.println("audio -> smartTV 변경");
		
		SmartTelevision stv = new SmartTelevision();
		
		rc = stv;
		Searchable sa = stv;
		
		System.out.println(rc);
		System.out.println(sa);
		rc.setVolume(5);
		sa.search("11번");
		
	}
}
