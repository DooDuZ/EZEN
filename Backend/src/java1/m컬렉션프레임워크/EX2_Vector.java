package java1.m컬렉션프레임워크;

import java.util.List;
import java.util.Vector;

public class EX2_Vector {
	
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		for(Board tmp : list) {
			System.out.println(tmp.subject +"\t"+ tmp.content+"\t"+tmp.writer);
		}
		
		list.remove(2);
		list.remove(3);
		for(Board tmp : list) {
			System.out.println(tmp.subject +"\t"+ tmp.content+"\t"+tmp.writer);
		}
	}
	
}

/*
 	ArrayList <-------> Vector
 	동기화X				동기화O
 	단위실행				멀티실행
 						안전성 보장
 						
 	동기화 : 특정 메소드의 하나의 스레드만 사용 가능하도록 대기 상태
 	
 	
 	
*/
