package java1.m컬렉션프레임워크;

import java.util.HashMap;

public class EX5_HashMap {
	public static void main(String[] args) {
		
		
		/*Map 인터페이스
			* 순서 없음
			* key 중복 불가 / value 중복 가능
		*/
		// 1. HashMap <key,value> 선언
		HashMap<String, Integer> map = new HashMap<>();
		
		// 2. entry(키,값) 저장
		map.put("지웅이", 32); System.out.println(map.toString());
		map.put("홍길동", 90); System.out.println(map.toString());
		map.put("동장군", 80); System.out.println(map.toString());
		map.put("홍길동", 42); System.out.println(map.toString());  //key 중복, 덮어씌워짐
		
		// 3. 호출
		System.out.println("get(키) -> 값 반환 : "+map.get("지웅이"));
		
		// 4. 모든 key 호출
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			System.out.println("키 : "+key);
			System.out.println("값 : "+map.get(key));
		}
		
		// remove
		map.remove("동장군");
		System.out.println(map.keySet());
	}
}
