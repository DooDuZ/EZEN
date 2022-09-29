package java1.g상속;

public class KTire extends Tire{

	public KTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KTire수명 : " 
					+ (maxRotation-accumulatedRotation)+"회");
			return true;
		}
		System.out.println("***" + location + "KTire펑크***");
		return false;
	}
	
}
