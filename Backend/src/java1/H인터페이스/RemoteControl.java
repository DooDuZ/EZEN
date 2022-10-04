package java1.H인터페이스;

public interface RemoteControl {
	
	/*
	  	[인터페이스]
	  	
	  	1. 상수 --- 필드에는 상수만 존재
	  	2. 생성자X
	  	3. 메소드	  	
	  		1. 추상메소드[선언부만 존재]
	*/
	
	// [상수]
	int MAX_VOLUME = 10;		// public static final이 생략됨
	int MIN_VOLUME = 0;
	
	// [메소드]
		// 기능 정의 없이 선언만!!
		// override 해서 써야할듯
	public void turnOn();		// abstract 생략됨
	public void turnOff();
	public void setVolume(int volume);
}
