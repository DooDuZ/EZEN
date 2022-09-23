package java1.kString;

public class EX2_String메소드 {
	
	public static void main(String[] args) {
		
		// 1. 문자열.charAt(인덱스) : 해당 인덱스의 문자 추출
		String ssn = "010624-1230123"; // 문자열
		char sex = ssn.charAt(7);
			System.out.println(sex);
		switch(sex) {
			case '1' :
			case '3' : 
				System.out.println("남자 입니다."); break;
			case '2' : 
			case '4' : 
				System.out.println("여자 입니다."); break;
		}
		// 2. 문자열1.equals(문자열2) : 두 문자열 비교
		String strVar1 = new String("신문철");
		String strVar2 = "신문철"; 
		
		// " "자체가 String을 뜻하기 떄문에 new쓰지 않아도 된다고함...
		// 보다 정확한(보편화 가능한) 이해 필요
		
		
		// 3. getBytes(인코딩 타입)
		
		String str = "안녕하세요";
		byte[] bytes = str.getBytes(); // 인코딩 타입 생략 시 : 자바 버전 따라감 // 설정값 있으면 설정값
		System.out.println("길이 : "+ bytes.length);		
		String str1 = new String(bytes);
			System.out.println("바이트열-> 문자열 : " + str1);
		 
		 try {
			// EUC-KR
			 byte[] bytes2 = str.getBytes("EUC-KR");
			 System.out.println("문자열 -> 바이트열 (EUC-KR) : " + bytes2.length);			 
			 String str2 = new String(bytes2 , "EUC-KR");
			 	System.out.println("바이트열->문자열 : " + str2);
			 // UTF-8
			 byte[] bytes3 = str.getBytes("UTF-8");
			 	System.out.println("문자열->바이트열(UTF-8) : "+ bytes3.length);
			 String str3 = new String(bytes3, "UTF-8");
			 	System.out.println("바이트열 -> 문자열 : " + str3);
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
}



/*

	method 목록
	
		1. charAt(index)
		2. equals() -> 힙영역 내 값 비교
		3. getBytes(인코딩 타입) : 바이트열 변환 -> 디코딩?
			*EUC-KR, UTF-8 : 한글 지원해주는 인코딩 [ 숫자->문자 변환 규칙 ]
		4. indexOf(문자) : 해당 문자 인덱스 번호 찾기
			* contains("문자") : 해당 문자 존재 여부 true / false
		5. length() 문자열 길이
		6. replace(el, el2) 문자 치환
		7. toLowerCase() 소문자 전환
		8 toUpCase() 대문자 전환
		9. valueOf() 다른 자료형 --> String 전환
		10. subString(startIndex, endIndex) 문자열 자르기
		11. split(기준문자) 기준 문자로 문자열 잘라서 배열로 return
		 
*/



