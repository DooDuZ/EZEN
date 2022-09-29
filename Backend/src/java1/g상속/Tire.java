package java1.g상속;

public class Tire {
	
	public int maxRotation;
	public int accumulatedRotation;
	public String location;	

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire수명 : " 
					+ (maxRotation-accumulatedRotation)+"회");
			return true;
		}
		System.out.println("***" + location + "Tire펑크***");
		return false;
	}	
}
