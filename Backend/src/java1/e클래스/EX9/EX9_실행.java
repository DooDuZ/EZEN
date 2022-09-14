package java1.e클래스.EX9;

public class EX9_실행 {

	public static void main(String[] args) {
		
		Calculator mini = new Calculator();
		
		mini.powerOnOff();
		
		int result1 = mini.plus(5, 6);
		int result2 = mini.minus(5, 6);
		int result3 = mini.multiply(5, 6);
		double result4 = mini.divide(5, 6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		byte x = 10;
		byte y = 4;
		double result5 = mini.divide(x, y);
		System.out.println(result5);
		
		mini.powerOnOff();
		int stat = mini.plus(5, 5);
		System.out.println(stat);
		
		
	}
}
