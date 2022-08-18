/*
 
		변수/상수 : 데이터(메모리) 한개
		배열 : 변수 여러개를 저장하는 객체
		함수 : 미리 정의된 코드
		객체[object] : 실제로 존재하는 사물
		인스턴스[instance] : 
			객체 지향[OOP] :  
 
	*객체 : 메모리(변수,배열 등)와 함수들의 모임 
 
*/

// p.246
// const/let 객체명 = {키 : 값 , 키2 : 값 , 키3 : 값3 , 키4 : 값4}
const product = {
	
		제품명 : '7D건조망고',
		유형 : '당절임',
		성분 : '망고, 설탕, 메타중아황산나트륨,치자황색소',
		원산지 : '필리핀'	 }
		
		
//2. 객체 확인
console.log('객체 호출' + product)
console.log('객체 내 속성 호출 : ' +product['제품명'])
console.log('객체 내 속성 호출 : ' +product['유형'])
console.log('객체 내 속성 호출 : ' +product.제품명)
console.log('객체 내 속성 호출 : ' +product.유형)

//p.248

const object = {
	number : 273 ,
	string : '구름' ,
	boolean : true,
	array : [52,273,103,32],
	method : function(){console.log('집에가고시플거야')}
}



//2.객체 내 속성과 메소드 호출
console.log('객체 내 메소드 호출' + object.method())






