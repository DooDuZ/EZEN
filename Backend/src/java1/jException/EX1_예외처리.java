package java1.jException;

public class EX1_예외처리 {
	
	public static void main(String[] args) {
		
		/*
			String data = null;
			System.out.println(data.toString());
		
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println(data1);
			System.out.println(data2);
		
		
			int[] 정수배열 = new int[3];
			for(int i = 0 ; i<= 정수배열.length ; i++) {
				System.out.println(정수배열[i]);
			}
		*/
		
		/*
		 * String data1 = "100"; String data2 = "a100";
		 * 
		 * int value1 = Integer.parseInt(data1); int value2 = Integer.parseInt(data2);
		 * // -> NumberFormat Exception 발생
		 */
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); 
		
		
		String a = "test";
		System.out.println(a);
		System.out.println(a.toString());
		
	}
	
	
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("개로 변환");
		}else {
			System.out.println("고양이는 안돼요");
		}
	}
}
