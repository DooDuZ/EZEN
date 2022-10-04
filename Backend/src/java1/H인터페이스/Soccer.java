package java1.H인터페이스;

public class Soccer implements GamePad{
	@Override
	public void ClickA() {
		System.out.println("슛");
	}
	@Override
	public void ClickB() {
		System.out.println("패스");
	}
	@Override
	public void ClickC() {
		System.out.println("태클");
	}
}
