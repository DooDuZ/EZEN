package java1.kString;

public class EX1_String {
	public static void main(String[] args) {
		byte b = 72;
		char c = (char) b; System.out.println(c);
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; //32가 공백인듯
		char[] chars = new char[10];
		
		for(int i = 0 ; i<bytes.length ; i++) {
			chars[i] = (char)bytes[i];
		}
		
		for(int i = 0 ; i<chars.length ; i++) {
			System.out.print(chars[i]);
		}
		
		String str1 = new String(bytes);
		System.out.println("\n"+str1);
		
		String str2 = new String(bytes , 6 , 4 );
		System.out.println(str2);
		
		// 2,
		byte[] bytes2 = new byte[100];
		
		System.out.println(" 입력 : ");
		
		try {
			int readByteNo = System.in.read(bytes2);
			/*
				for(int i = 0 ; i<bytes2.length ; i++) {
					System.out.println(bytes2[i]);
				}
			*/
			String str3 = new String(bytes2, 0 , readByteNo-2);
			System.out.println(str3);
			System.out.println("------------------");
			
		} catch (Exception e) {
			System.out.println("오류 : "+e);
		}
	}
}


// 질문 1 {} 사용 잘 안하는 이유 
// 질문 2 system.in.read(); ----> () 안에 들어가는 것.


/*
	예외처리 [ Exception ]
		1. 일반예외 : 컴파일 전에 오류 체크 [ 실행 전에 자바가 알고있는 오류는 미리 예외 처리 ]
			* 외부와 연결 [ 키보드, DAO, FILE, 소켓 등 ]
		2. 실행예외 : 컴파일 전에 오류 체크X [ 실행 후에 발생하는 예외 - 개발자의 경험/짐작 ]
		
		try{
			예외 발생할 것 같은 코드
		}catch (Exception e) { // IOException -> 입출력(Input Output) 오류(Exception)
			대체 코드
		}

*/











