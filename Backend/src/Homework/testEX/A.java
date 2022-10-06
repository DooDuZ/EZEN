package Homework.testEX;

public class A {
	class B{
		B(){}
		int field1 = 1;
		void method1 (){System.out.println("A-B 메서드1");}		
	}
	static class C{
		public C() {}
		int field1 = 2;
		static int field2 = 3;
		void method1() { System.out.println("A-staticC 메서드1");}
		static void method2() {System.out.println("A-staticC static메서드2");}
	}
	
	void method() {
		class D{
			public D() {}
			int field1;  // static 불가능
			void method1() { // static 불가
				System.out.println("A.method-D 메서드1");
			}

		}
		D d = new D();
		d.field1 = 4;
		System.out.println("D객체 생성 후 필드 호출 "+d.field1);
		d.method1();
	}
}
