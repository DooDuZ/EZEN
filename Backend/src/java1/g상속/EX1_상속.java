package java1.g상속;

public class EX1_상속 {
	
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상" + dmb.color);
		
		System.out.println("채널 : " + dmb.ch);
		
		dmb.powerOn();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요. 난 지웅이야.");
		dmb.sendVoice("아예~~~ 반갑습니다.");
		dmb.hangUp();
		dmb.powerOff();
		
		dmb.turnOnDmb();
	}

}


/*




*/