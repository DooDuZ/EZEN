package java1.g상속;

public class EX3_상속 {
	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원 면적 : " + cal.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
	}
}
