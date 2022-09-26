package java1.lThread;

public class Music extends Thread{
	
	private boolean stop = true;
	
	
	// on/off 제어 메소드
	public void setStop() {
		this.stop = !stop;
	}
	
	
	@Override
	public void run() {
		while(stop) {
			System.out.println("음악재생중~~~");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(stop==false) {
				break;
			}
		}
	}
}
