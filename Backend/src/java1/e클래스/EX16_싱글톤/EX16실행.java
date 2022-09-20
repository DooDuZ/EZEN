package java1.e클래스.EX16_싱글톤;

public class EX16실행 {
	
	public static void main(String[] args) {
		
		
		// 싱글톤 클래스의 public 메소드를 통해서만 객체를 호출할 수 있다
		SingleTon s3 = SingleTon.getInstance();
		SingleTon s4 = SingleTon.getInstance();
		
		// 이 경우 메모리 할당이 1번만 됐으므로 s3==s4 
		
		if(s3==s4) {
			System.out.println("주소 같음");
		}else {
			System.out.println("주소 다름");
		}
		
		
	}

}
