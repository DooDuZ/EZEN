package java1.lThread;

public class 계산기 {
	
	//필드
	private int 저장소 ;
	//
	
	//메서드
	public int get저장소() {return 저장소;}
	public synchronized void set저장소(int 저장) {
		// synchronized : 여러개의 스레드가 동일한 객체를 사용할 떄 대기상태[순서대로 처리]
				// 싱글스레드에서 X
		// 컬렉션 프레임워크
				// ArrayList	:	동기화x - 싱글스레드용
				// Vector		:	동기화o - 멀티스레드용
				// HashMap		:	동기화x - 싱글스레드용
				// HashTable	:	동기화o - 멀티스레드용
		this.저장소 = 저장;
		// 1. 스레드에 시간차 두기
		try { Thread.sleep(2000);} 
		catch (Exception e) {}
		System.out.println(Thread.currentThread() + " : " + this.저장소);
	}
	
	
}
