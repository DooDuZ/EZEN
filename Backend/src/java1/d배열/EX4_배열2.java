package java1.d배열;

public class EX4_배열2 {
	
		public static void main(String[] args) {
			
			// 1. 1차원 배열
			String[] 배열1 = new String[10];
				//1. 항목에 값 대입
				배열1[0] = "유재석"; 배열1[2] = "강호동"; 배열1[2] = "신동엽";
				//2. 항목에 값 수정
				배열1[0] = "하하";
				//3. 항목에 값 삭제 [ 메모리 자체 삭제X -> 데이터 초기화 ]
				배열1[1] = null;
				//4. 모든 항목 호출
				for(String value : 배열1 )System.out.println( value );
				
			// 2. 2차원 배열
			String[][] 배열2 = new String[10][2];
				// 1. 값 대입
				배열2[0][0] = "유재석";		배열2[0][1] = "010-1111-1111";
				배열2[1][0] = "강호동";		배열2[1][1] = "010-2222-2222";
				배열2[2][0] = "신동엽";		배열2[2][1] = "010-2222-2222";
				//2. 항목 값 수정
				배열2[0][0] = "하하";		배열2[0][1] = "010-0000-0000";
				//3. 항목 값 삭제
				배열2[1][0] = null;	 	배열2[1][1] = null;
				//4. 모든 항목 호출
				for(int 행 = 0 ; 행<배열2.length ; 행++) {
					//0부터 마지막 행까지 반복
					for(int 열 = 0 ; 열<배열2[행].length; 열++) {
						System.out.print(배열2[행][열]+"\t");
					}
					System.out.println();
				}
				
			// 3. 3차원 배열
			String[][][] 배열3 = new String[10][2][3];
		}
}
