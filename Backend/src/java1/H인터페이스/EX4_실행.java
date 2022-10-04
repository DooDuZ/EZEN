package java1.H인터페이스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class EX4_실행 {
	
	public static void main(String[] args) {
		Vehicle vehicle;
		
		vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); 
		// bus에만 있음. vehicle 형변환 후 사용 불가
		
		// 인터페이스->객체 형변환
		System.out.println("=====강제 형변환=====");
			// instanceof -> 상속,구현 관계 확인
		System.out.println(vehicle instanceof Bus); // 관계 확인
		System.out.println(vehicle instanceof RemoteControl); // 관계 확인
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
		
		// 프레임워크
		List<String[]> list;
		
		// 인터페이스 변수에 arrayList
		list = new ArrayList<>();
		
		String[] arr = {"dd","zz"};
		String[] arr2 = {"ㅁㅁ","ㅋㅋ"};
		list.add(arr);
		list.add(arr2);
		System.out.println(arr);
		System.out.println(list);
		
		System.out.println(list); // List는 toString이 override되어있는듯 함... 주소가 아니라 바로 값이 나온다.
									// List가 아니라 List<String> 의 <> 내부 데이터타입 따라 적용된다.
									// String 클래스에 toString이 오버라이딩 되어있었기 때문에 String은 바로 출력, 그외엔 주소값 출력
		// 인터페이스 변수에 vector
		list = new Vector<>();
		list.add(arr);
		
		System.out.println(list);
		
		// 인터페이스 변수에 linkedList
		list = new LinkedList<>();
		list.add(arr);
		
		System.out.println(list);
	}	
}
