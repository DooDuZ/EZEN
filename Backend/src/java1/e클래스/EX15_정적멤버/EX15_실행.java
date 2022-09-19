package java1.e클래스.EX15_정적멤버;

public class EX15_실행 {
	public static void main(String[] args) {
		
		
		double result1 = Calculator.pi2;
		Calculator.plus2(10, 5);
		Calculator.minus2(10, 5);
		
		
		Calculator cal = new Calculator();
		double result2 = cal.pi2;
	}

}
