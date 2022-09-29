package java1.g상속;

public class HTire extends Tire{

	
	
	public HTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HTire수명 : " 
					+ (maxRotation-accumulatedRotation)+"회");
			return true;
		}
		System.out.println("***" + location + "HTire펑크***");
		return false;
	}
	
}
