package java1.lThread;

public class EX3_동기화 {

	public static void main(String[] args) {
		계산기 my계산기 = new 계산기();
		
		사람1 user1 = new 사람1();
		user1.set계산기(my계산기);
		user1.start();
		
		사람2 user2 = new 사람2();
		user2.set계산기(my계산기);
		user2.start();
		
		// * 사람1과 사람2 동일한 계산기[객체] = 공유객체를 사용한다
		
		
		
		
	}
	
}


/*

	유재석[스레드]
				계산기[ 객체 = 메모리 ]
	강호동[스레드]


*/