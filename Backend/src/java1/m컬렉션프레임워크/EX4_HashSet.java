package java1.m컬렉션프레임워크;

import java.util.HashSet;
import java.util.Iterator;

public class EX4_HashSet {
	public static void main(String[] args) {
		
		// 1. 선언
		HashSet<String> set = new HashSet<>();
		
		/*
			hashCode[저장 방식]
			ex) 안녕하세요 -> hash메서드 사용 -> 코드화[암호화]
			HashSet은 객체 저장 전 hashCode()호출 / 값 중복 시
		*/
		// 2. 추가
		set.add("java"); System.out.println("set 현황 : " + set.toString());
		set.add("jdbc"); System.out.println("set 현황 : " + set.toString());
		set.add("servlet/jsp"); System.out.println("set 현황 : " + set.toString());
		set.add("java"); // hashcode중복시 저장x
		System.out.println("set 현황 : " + set.toString());
		set.add("ibatis"); System.out.println("set 현황 : " + set.toString());
		
		System.out.println("set내 객체수 : " + set.size());
		
		// * 해시코드 함수 확인
		System.out.printf("java 문자열의 해시코드 변환 : %x \n" , "java".hashCode());
		System.out.printf("java 문자열의 해시코드 변환 : %x \n" , "java1".hashCode());
		
		// iterator() : 순회 [ 순서없는 자료들을 하나씩 순회하는 Iterator 인터페이스 ]
			//배열,프레임워크 등은 iterator를 제공 받는다
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {	//hasNext() : 다음 객체가 존재하면 true / false
			String element = iterator.next();	// next() : 다음 객체로 이동[호출]
			System.out.println("\t"+element);	// 순서 보장 받지 못함. 일반적으로는 넣은 순서대로 나옴.
		}
		
		
		
		for(String s : set ) {
			System.out.println("\t"+s);
		}
		
	}
}
