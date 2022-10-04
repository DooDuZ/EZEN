package java1.H인터페이스;

public class ShootingGame implements GamePad{
	@Override
	public void ClickA() {
		System.out.println("미사일 발사");
	}
	@Override
	public void ClickB() {
		System.out.println("비행기 교체");
	}
	@Override
	public void ClickC() {
		System.out.println("폭탄 던지기");
	}
}
