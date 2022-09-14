package java1.e클래스.EX10;

public class EX10_실행 {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setGas(0);
		
		boolean gasStats = car.isLeftGas();
		
		if(gasStats) {
			car.run();
		}else {
			System.out.println("가스를 주입해 주세요.");
		}
		
		car.setGas(30);
		gasStats = car.isLeftGas();
		
		if(gasStats) {
			car.run();
		}else {
			System.out.println("가스를 주입해 주세요.");
		}
		
	}

}
