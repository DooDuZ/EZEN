package java1.g상속;

class A{  }

class B extends A {}
class C extends A {}


class D extends B {}
class E extends C {}

public class EX4_타입변환 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d; 
		// B b2 = E; --> 상속관계 아님. 타입변환 불가능
		
	}
}
