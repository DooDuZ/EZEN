package java1.lThread;

public class Movie implements Runnable{
	
	private boolean stop = true;
	
	public void setOnOff(boolean stop) {
		this.stop = stop;
	}
	
	@Override	
	public void run() {
		while(stop) {
			System.out.println("무비 재생중~~~");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
