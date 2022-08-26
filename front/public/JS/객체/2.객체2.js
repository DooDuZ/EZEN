/**
 
 	//p. 249
 	자바스크립트 데이터를 저장하는 방법
 		1. 변수/상수
 		2. 배열
 		*. 함수 : 1. 매개변수 2. 미리 정의된 코드 3. 리턴값
 			1. 일반 함수 : function 함수명(매개변수~){ 코드 return값 }
 			2. 익명 함수 : function (){ }
 			3. [콜백함수]화살표 함수 : (매개변수) => 리턴값
 			4. [객체메소드] : 함수(){}
 		3. 객체
 		let/const 객체명 = {
			키	:	값	,
			키2	:	값2	,
			키3	:	값3	,
			키4	:	function(){}	
		}
 */
 
 const pet = {
	name : '구름' ,
	eat : function( food ){
		alert(this.name + '은/는' + food + '을/를 먹었습니다.')
			// this : 자신이 가진 속성 뜻.
			// 객채 내부 this.키. vs 객체외부 객체명.키
	} //함수 end
} // 객체 end


//2. 객채 내 메소드 호출[객체 내 속성/메소드 호출할때 : 객채명.키 ]
pet.eat('밥')

// p. 250 속성 추가
// 1. 객체 만들기
const student={}//비어있는 객체
// 2. 기존에 없는 키 접근
student.이름 = '윤인성'
student.취미 = '악기'
student.장래희망 = '생명공학자'
// 3. 객체 확인
console.log( student )

delete student.장래희망
console.log(student)



const pet2 = {
	name : '구름' , 
	eat(food){
		alert(this.name + '은/는' + food + '을/를 먹습니다.')
	}	
}

pet2.eat('밥')


// p. 254
// 1.

const 객체 = {
	name : '혼자 공부하는 파이썬' , 
	price : 18000 , 
	publisher : '한빛미디어'	
}






