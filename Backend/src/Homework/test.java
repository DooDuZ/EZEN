package Homework;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);    	
    	
    	System.out.println("등록할 인원 수 : ");
    	int length = input.nextInt();			// 친구 수 = 배열의 길이 입력받기
    	String[] friends = new String[length];	// 친구 이름을 저장할 배열 선언
    											// length = 배열의 길이 이므로 하단에선 배열명.length() 대신 변수 length를 사용합니다.
    	int count = 0 ;							// 친구를 등록할 때마다 카운트를 올려줍니다.
    	while(count<length) {					// 등록한 친구의 수가 배열의 길이와 같아질 때 까지 실행  
    		String name = input.next();			// 반복문이 멈출 때까지 반복해서 등록할 친구의 이름을 입력 받습니다.
    		boolean checkName = true;			// 하단에서 실행될 검사 결과를 true/false로 저장할 변수 선언
    		for(int i = 0 ; i<count ; i++) {	// 위에서 선언한 배열의 0번째 인덱스부터 시작해서 등록된 친구의 숫자만큼 반복 
    			if(name.equals(friends[i])) {	// 만약 입력된 이름과 일치하는 값이 배열 내에 있다면
    				checkName = false;			// 위에서 선언한 checkName 변수에 false를 대입해줍니다.
    				System.out.println("중복");	// 중복값이 발생됐다고 출력해준 뒤
    				break;						// 이미 검사 값이 false가 됐기 때문에 더이상 검사할 필요가 없습니다.
    			}
    		}									// 검사가 끝나면
    		if(checkName) {						// checkName == true라면 위의 검사에서 겹치는 값이 없었다는 의미가 됩니다.
    			friends[count] = name;			// 등록했던 친구가 없다면 배열의 가장 첫번째 인덱스[count==0]에 입력받은 이름을 넣어주고
    			count++;						// 등록한 친구의 숫자에 1을 더해줍니다.
    		}									// 위 과정을 반복
    	}										
    	for(int i = 0 ; i<length ; i++) {		// 배열의 0번째 인덱스부터 마지막 인덱스 까지 반복
    		System.out.println("["+(i+1)+"]"+friends[i]);	// 넣은 값을 원하는 조건에 맞춰 출력하면 끝입니다.
    	}
    }
}





/*	성공
    	Scanner input = new Scanner(System.in);

    	System.out.println("등록할 친구 수 : ");
    	int T = input.nextInt();
    	String[] list = new String[T];
    	for(int i = 0 ; i<T ; i++) {
    		String name = input.next();
    		boolean check = true;
    		for(int j = 0; j<T ; j++) {
    			if(list[j]!=null && name.equals(list[j])) {
					check = false;
					System.out.println("중복");
					i--;
					break;
				}
    		}
    		if(check) {
    			list[i] = name;
    		}
    	}
    	for(int i = 0 ; i<T ; i++) {
    		System.out.println( "[" + (i+1) + "]" + list[i]);
    	}
*/