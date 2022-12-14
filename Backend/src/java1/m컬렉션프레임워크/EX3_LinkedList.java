package java1.m컬렉션프레임워크;

import java.util.ArrayList;
import java.util.LinkedList;

public class EX3_LinkedList {
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0 ; i<10000 ; i++) {
			list1.add(0, i+""); // 숫자 -> 문자열 변환 : 1. 숫자+"" 2. String.valueOf(숫자)
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 10000개 삽입하는데 걸리는 시간 : " + (endTime-startTime)+"ns");
		
		
		startTime = System.nanoTime();
		for(int i = 0 ; i<10000 ; i++) {
			list2.add(0, i+""); // 숫자 -> 문자열 변환 : 1. 숫자+"" 2. String.valueOf(숫자)
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 10000개 삽입하는데 걸리는 시간 : " + (endTime-startTime)+"ns");
		
	}

}
