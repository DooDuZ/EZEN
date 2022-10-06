package Homework.testEX;

public class EX1_실행 {
	public static void main(String[] args) {
		
		A a = new A();
		
		//인스턴스 멤버 객체 생성
		A.B b = a.new B();
		System.out.println("B타입 객체 필드 호출"+b.field1);
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		System.out.println(c.field1+" "+c.field2);
		c.method1();
		
		System.out.println(A.C.field2 + "static 접근확인");
		A.C.method2();
		
		a.method();
	}
}
