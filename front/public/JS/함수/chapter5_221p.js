/**
 		익명함수 = 람다
 		*JS : 함수도 자료이다.
 		매개변수에 함수 전달이 가능하다
	 		함수호출( 변수 )
	 		함수호출( 배열 )
	 		함수호출( 함수 )
	 		함수호출( function(){} )
	 	매개변수 : 자료형 [1. Number 2.String 3.Boolean 4. object( 배열 , 함수 ) ]
 */
 
 /* 
 index.of : 해당 요소의 인덱스 번호 찾기
 for.each : 해당 배열의 순회
 [기존배열 수정 X]
 map : 반환값[return]으로 새로운 배열 
 filter : 반환값[return true이면]으로 새로운 배열 
 
 
 
 */
 
 
 function callThreeTimes( callback ){
	for( let i = 0 ; i<3 ; i++ ){
		callback(i)
	}
}
 
 
 
 function print( i ){
	console.log(`${i}번째 함수 호출`)
}

//함수 호출

callThreeTimes(print)


//2. 익명 콜백 함수 정의 [p.222] 
function CallThreeTimes2( callback ){
	for(let i = 0 ; i<3 ; i++){
		callback( i )
	}
}

//익명
CallThreeTimes2( function(i){
	console.log(`${i}번째 함수 호출 `)
	} //익명함수 끝
) // 함수 호출 끝



//3. 배열의 forEach() 함수 메소드 [ p.223 ]
	// forEach() : 배열 반복문[ 인덱스와 값 호출 ] 함수 
	
	
let numbers = [273, 52 ,103, 32, 57]	

numbers.forEach( function(value, index, array){
	
	console.log(`${index}번째 요소 : ${value}`)
 })
	
// * forEach() 사용 안할때
function for_print(numbers){
	for(let i = 0 ; i<numbers.length ; i++){
		console.log(`${i}번째 요소 : ${numbers[i]}`)
	}
}	

for_print(numbers)
	
	
	
//4. 배열의 map() 함수 [p. 223]

numbers = numbers.map( function( value, index, array){
	return value*value
})

console.log('map실행결과 : ' + numbers)
numbers.forEach( console.log)



//5. 배열의 filter(){p.224}

const evenNumbers = numbers.filter(function(value){
	return value % 2 == 0
})
console.log('원래 배열 : ' + numbers )
console.log('짝수 배열 : ' + evenNumbers)





