package java1.e클래스.EX15_정적멤버;

public class Calculator {
	//필드
	double pi1 = 3.14159;
	static double pi2 = 3.14159;
	
	int plus1(int x, int y) {
		return (x+y);
	}
	static int plus2(int x, int y) {
		return x+y;
	}
	int minus1(int x, int y) {
		return (x-y);
	}
	static int minus2(int x, int y) {
		return x-y;
	}
}
