package java1.m컬렉션프레임워크;

import java.util.ArrayList;

public class EX1_arraylist {
	
	public static void main(String[] args) {
		
		// 1. 객체 [ 클래스명 변수명 = new 생성자(); ]
		// 2. 컬렉션프레임워크 객체 [ 클래스명<타입파라미터> 변수명 = new 클래스명<>; ]
		
		// 정수 int 여러개를 저장할 수 있는 리스트 선언
		ArrayList<Integer> inlist = new ArrayList<>();
		// 실수 double 여러개를 저장할 수 있는 리스트 선언
		ArrayList<Double> doublelist = new ArrayList<>();
		//내가 만든 자료형을 여러개 저장할 수 있는 리스트 선언
		ArrayList<Member> memberlist = new ArrayList<>();
		
		// String 여러개를 저장할 수 있는 리스트 선언 
		ArrayList<String> list = new ArrayList<>();
		
		list.add("java"); System.out.println("리스트현황 :" + list.toString());
		list.add("jdbc"); System.out.println("리스트현황 :" + list.toString());
		list.add("servlet.jsp"); System.out.println("리스트현황 :" + list.toString());
		list.add(2, "database"); System.out.println("리스트현황 :" + list.toString());
		// (인덱스, 데이터) -> 특정 인덱스에 원하는 값 삽입 가능 
		list.add("ibatis"); System.out.println("리스트현황 :" + list.toString());
		
		// size() -> 배열에서의 length
		System.out.println("리스트 내 객체 수 : " + list.size());
		
		// get()
		System.out.println("특정 인덱스(2) 호출 : " + list.get(2));
		System.out.println("특정 인덱스(3) 호출 : " + list.get(3));
		
		// remove()
		System.out.println("특정 인덱스(0) 삭제 : " + list.remove(0));
		System.out.println(list.toString());
		System.out.println("특정 객체 삭제 : "+list.remove("ibatis"));
		System.out.println(list.toString());
		
		// 리스트/배열 <----> 반복문
			// 1.
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
			// 2.
		for( String s : list) { // for(타입파라미터 변수명 : 리스트) 
			System.out.println(s);
		}
		
		// contains / indexOf / isEmpty / iterator
		System.out.println("contains : "+list.contains("jdbc"));
		System.out.println("indexOf : "+ list.indexOf("jdbc"));
		System.out.println("isEmpty : " + list.isEmpty());
		System.out.println("iterator : " + list.iterator());
		
		// 리스트내 모든 객체 삭제
		list.clear();
		System.out.println(list.toString());
		System.out.println("isEmpty : " + list.isEmpty());
		
		
		
		
	}
	
}

/*
	문자열 10개 저장
	1. String[] 배열 = new String[10];
		1. 선언된 길이는 변경X
		2. 추가 삭제 삽입 -> 직접 인덱스 이용
	2. ArrayList<String> 배열 = new ArrayList();
		- <E> 데이터타입(클래스...?)
		- 길이가 자동 [ 기본값 10부터 ]
		- 추가 삭제 삽입 -> 메서드 사용 -> 편리하지만 무거움
*/