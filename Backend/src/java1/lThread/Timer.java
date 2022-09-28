package java1.lThread;

public class Timer extends Thread{
	
	private boolean OnOff = true;
	private boolean plus = true;
	
	@Override
	public void run() {
		int i = 0;
		
		
		while(OnOff) {
			if(plus) {
				i++;				
				System.out.println(i);
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("스레드 에러"+e);
			}
		}
	}
	
	void plus() {
		this.plus = !plus;
	}
	
	void stopTimer () {
		OnOff = !OnOff;
	}


	public boolean isOnOff() {
		return OnOff;
	}


	public void setOnOff(boolean OnOff) {
		this.OnOff = OnOff;
	}
	
	
	

}

