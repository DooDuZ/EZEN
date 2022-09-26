package java1.lThread;

import java.util.Scanner;

public class EX4_예제1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Music music = new Music(); // 음악 스레드 선언
		Movie movie = new Movie();
		
		Thread thread = new Thread(movie);
		
		boolean musicState = false;
		boolean movieState = false;
		while(true) {
			
			if(!musicState) {
				System.out.print("1.음악[재생]");
			}else {
				System.out.print("1.음악[중지]");
			}
			
			if(!movieState) {
				System.out.println("2.영화[재생]");
			}else {
				System.out.println("2.영회[중지]");
			}
			
			int ch = input.nextInt();
			
			if(ch==1 && !musicState) {	
				music.start();
				musicState = true;
			}else if ( ch==1 && musicState){
				music.setStop();
				musicState = false;
				music = new Music();
			}else if(ch==2 && !movieState) {
				thread.start();
				movieState = true;
				// thread.stop(); 스레드 강제종료... 비권장 -> 메모리 손실이 생길 수 있음
			}else if(ch==2 && movieState){
				movie.setOnOff(false);
				movieState = false;
				movie = new Movie();
				thread = new Thread();
			}
			
			
		}		
	}
}
