package java1.e클래스.EX18_접근제한자.GetSet메소드;

public class Car {
	
	// 필드 [ 필드 정보를 보호하기 위해 모든 필드 private 권장]
		private int speed; // 다른 클래스에서 접근 불가
		private boolean stop;
	// 생성자
	
	// 메소드 [ 필드에 직접 접근이 불가능하기 때문에 간접 접근 가능한 메소드 선언 ]
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed( int speed ) {
		if(speed<0) {
			this.speed = 0 ;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop; 
		this.speed = 0;
	}
	
	/*
	 	객체명.speed = 500 ; [ X ]
	 	객체명.setSpeed(500) [ 권장 O ]
	*/
}
