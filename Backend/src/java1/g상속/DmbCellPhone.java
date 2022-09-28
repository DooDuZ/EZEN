package java1.g상속;

public class DmbCellPhone extends CellPhone {
	
	// 필드	
	int ch ;
	// 생성자
	
	public DmbCellPhone(String model, String color, int ch) {
		this.model = model;
		this.color = color;
		this.ch = ch;
	}
	
	// 메서드
	void turnOnDmb() {
		System.out.println("채널 : " + ch + "번 dmb 방송 수신을 시작합니다.");
	}
}
