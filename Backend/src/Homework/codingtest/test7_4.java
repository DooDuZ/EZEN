package Homework.codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;




/*
 * 매우 매우 매우 매우 힘들었음
 * JS 사용 시 입력 양식만 검색해서 Node.js로 제출 시
 * 기준 식에 Math.ceil 한방에 정답 처리
 * 
 * java에서 처리 시 int끼리 계산될 때 소숫점 버리는 문제 발생
 * float로 강제 타입 변환 -> Math.ceil -> int로 강제 변환 -> 시간초과
 * 반복문 어떤 형태든 몽땅 시간초과
 * 결국 나머지가 0이 아닐때 1 더하기로 처리...
 * 시간 초과가 얼마나 됐는지 모르니 자꾸 로직 검사를 하게 됌 // 틀리면 로직 문제인지 시간 초과인지 정보 안알려줌
 * 백준 병신 ... 진짜 개병신
 */






public class test7_4 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			int A = Integer.parseInt(s);
			s = br.readLine();
			int B = Integer.parseInt(s);
			s = br.readLine();
			int V = Integer.parseInt(s);
			
			int x = (V-B)/(A-B) ;
			if((V-B)%(A-B)!=0) {
				x++;
			}
			System.out.println(x);
			
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
}


/*
시간 초과인듯?
int x = 0;

while(true) {
x++;
V -= A;
if(V>0) {
	V += B;
}else {
	System.out.println(x);
	break;
}				
}
*/