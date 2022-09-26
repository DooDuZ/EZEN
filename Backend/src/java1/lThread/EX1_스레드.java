package java1.lThread;

import java.awt.Toolkit;

public class EX1_스레드 {
	
	public static void main(String[] args) {
		// 스레드 : 코드를 읽어주는 하나의 흐름
		// 멀티스레드 : 코드를 읽는 여러개의 흐름
		// main스레드 : main함수 시작될 때 실행
		
		System.out.println("싱글스레드 시작");
		// 1. p.525
		Toolkit toolkit = Toolkit.getDefaultToolkit();
														// new 안써도댐 / static으로 이미 할당된 코드임
														// Toolkit : console ui 제공 -> 소리내는놈
		for(int i = 0 ; i<10 ; i++) {
			toolkit.beep(); // 비프음 소리 함수 [ 소리 속도보다 반복문이 더 빠르다.]
			try {
				Thread.sleep(500); // 예외처리 필요
			} catch (Exception e) {
				System.out.println("오류발생"+e);
			}
			// 밀리초 : 1/1000초
			// Thread : 현재 스레드
			// . sleep(밀리초) : 스레드 일시정지 [ 무조건 예외처리 발생 ]
		}// 동기화 미지원. 여튼 그렇다함.
		
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		/////////////////////////////////////////
		System.out.println("멀티스레드 시작");
		// 2. p 526
		Runnable beepTask = new BeepTask();			//구현 객체
		Thread thread = new Thread(beepTask);
		thread.start(); // 메소드 호출
		
		// main 스레드 생성된 스레드 실행 후 다음 코드 실행
		
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("스레드1 : 띵");
			try {
				thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		// 3. p.527 : 익명 구현 객체 - 1회성
		
		System.out.println("익명구현객체 멀티스레드");
		// Thread thread2 = new Thread();
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5;i++) {
					toolkit.beep();
				}				
				try {
				Thread.sleep(500);
				} catch (Exception e) {
				// TODO: handle exception
				}				
			}
		});
		thread2.start();
		for( int i = 0 ; i<5 ; i++) {
			System.out.println("띵");
			try {
				thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("---thread 클래스 객체---");
		// 4. thread 클래스 객체
		Thread thread3 = new BeepThread();
		thread3.start();
		for( int i = 0 ; i<5 ; i++) {
			System.out.println("띵");
			try {
				thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		System.out.println("---Thread 클래스 이용한 익명 자식객체 멀티스레드---");
		// 5. p.530 클래스명 객체명 = new 생성자(){멤버 재정의};
		Thread thread4 = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for( int i = 0 ; i<5 ; i++ ) {
					toolkit.beep(); 
					try{ Thread.sleep(500); }
					catch (Exception e) {}
				}
			}		
		};
		thread4.start();
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
			catch (Exception e) { }
		}
		
	}
}

/*
										[멀티 태스킹]			[ 멀티프로세스 ]
															--> 프로세스		--> 스레드	[싱글스레드]
															
										프로그램[애플리케이션] 	--> 프로세스		--> 스레드1	[멀티스레드]
											크롬								--> 스레드2
															--> 프로세스

하드웨어[주기억장치]		운영체제				프로그램[애플리케이션]		--> 프로세스		--> Main스레드	[싱글 스레드]
					[스케줄링]					자바
					[자바 제어X]								--> 프로세스		--> main스레드
																			--> 스레드1 생성
																			--> 스레드2 생성

										프로그램[애플리케이션]
			--------------------------------------------------------------------------------
			
			멀티스레드[동시처리x, 병렬 처리] 흐름 단위
			
					[운영체제 할당 메모리 순서대로 처리]
					1. main 스레드 처리
					2. 스레드2 처리
					3. 스레드1 처리
					4. 스레드2 처리
					5. main스레드 처리	... -> 처리 순서 우리가 제어 불가능
			
										MAIN스레드
											ㅣ
											ㅣ--------- 스레드 생성1
							스레드생성 ---------ㅣ
											ㅣ
											ㅣ
											ㅣ

	[작업스레드 생성 준비]
	
	1. run메소드 구현 -> 2. start 메소드 실행
	
		*작업스레드 인터페이스/클래스 선택 기준
			1. extends vs implements : 상속 1번 vs 구현 여러번
			2. 익명 사용 여부 : 작업스레드 호출 횟수로 판단
			
			
	1. Runnable 클래스
			- 1. 구현객체
					-- 구현 클래스
					CLASS 구현 클래스 implements Runnable{run(스레드가 실행할 코드);}
			
			Runnable 구현객체 = new 구현클래스();
			Thread 객체명 = new Thread(run 구현객체);
			객체명.start();
			
			- 2. 익명 구현 객체 
			Thread 객체명 = new Thread(new Runnable(){run(스레드가 실행할 코드);}
			객체명.start();
			
	2. Thread 클래스 
			- 3 . 
					--하위 클래스
					Class 하위클래스 extends Thread{run(스레드가 실행할 코드);}
			하위클래스 객체명 = new 하위클래스();
			객체명.start();
			
			-4. 익명 자식 객체 
			Thread 객체명 = new Thread(){run(스레드가 실행할 코드);};
			
			
	--스레드 메소드 
		1. run()					: 멀티 작업할 코드 정의
		2. start()					: run 메소드 실행
		3. 
			setName("새로운 스레드 이름) : 스레드 이름 정의하기 [ 생략시 thread -index ]
			getName()				: 스레드 이름 호출







*/