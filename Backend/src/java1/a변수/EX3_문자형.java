package java1.a변수;

public class EX3_문자형 {
	
	public static void main(String[] args) {
		
		// p.64 string타입 [ string 클래스 ]
		//char 문자 = "자바";
			// 오류 발생 : char는 문자 한개만 지정할 수 있다. 
		String 문자열 = "자바";
		
		// p.65 
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println("이름 : " + name + " / 직업 : " + job);
		
		
		// p.66
		System.out.println("안녕하세요"); // printIn : 출력 후 줄바꿈 처리 O
		System.out.print("자바입니다."); //print :  출력 후 줄바꿈처리 X
		System.out.println("포항항(ᵔᗜᵔ*)포항항(ᵔᗜᵔ*)포항항(ᵔᗜᵔ*)");
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력 \n");
		System.out.print("행 단위 출력 \n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.print("봄\\여름\\가을\\겨울");
		
		System.out.println("줄바꿈");
		
		System.out.println("\\   /\\ ");
		System.out.println(" ) ( ')");
		System.out.println("( /  )");
		System.out.println("\\(__)|");
		
		System.out.println("줄바꿈");
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"\t |");
		System.out.println("||_/=\\\\__|\n");
		
		
		
		
		
		
	}//main end

} //class end

/*

	문자[ 한글자 ]			: char		:	'자'
	문자열[ 두글자 이상 ]		: String	:	"자바 입니다"
	
	console 화면에 출력하는 함수
		print()		: 출력
		printIn()	: 출력하고 줄바꿈[\n] 포함
		printf()	: 형식문자 출력 
	- 제어[이스케이프] 문자
		1. \n : 줄바꿈
		2. \t : 들여쓰기[tab : 5칸]
		3. \" : " 출력
			"홍길동" 		----> 홍길동
			"\"홍길동\""	----> "홍길동"
		4. \' : ' 출력
		
*/