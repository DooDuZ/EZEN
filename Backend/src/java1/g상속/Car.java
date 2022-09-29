package java1.g상속;

public class Car {
	
	Tire frontLeftTire = new Tire(6, "앞왼쪽");
	Tire frontRightTire = new Tire(6, "앞오른쪽");
	Tire backLeftTire = new Tire(3, "뒤왼쪽");
	Tire backRightTire = new Tire(4, "뒤오른쪽");
	
	
	
	boolean[] run() {
		System.out.println("자동차가 달립니다.");
		boolean[] tirestate = new boolean[4];
		tirestate[0] = frontLeftTire.roll();
		tirestate[1] = frontRightTire.roll();
		tirestate[2] = backLeftTire.roll();
		tirestate[3] = backRightTire.roll();
		for(boolean b : tirestate) {
			if(b==false) { stop(); break; }
		}
		return tirestate;
	};
	
	void stop() {
		System.out.println("자동차가 멈춥니다");
	}	
}
