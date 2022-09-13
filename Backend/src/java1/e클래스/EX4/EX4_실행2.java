package java1.e클래스.EX4;

public class EX4_실행2 {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바" , "030208-3111111");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1.nation);

		Korean k2 = new Korean();
		
		k2.name = "김자바";
		k2.ssn = "001219-4111111";
		
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println(k2.nation);

		
		
		
	}
	
}

/*
 	매개변수[인수] : 외부로부터 들어오는 변수
  
*/
