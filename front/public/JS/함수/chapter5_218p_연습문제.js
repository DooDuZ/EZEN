/**
 * 
 */
 
 
 function multiplyAll (a,b){
	let result = 1
	for(let i = a ; i<=b ; i++ ){
		result *= i}
		return result
}


console.log('모두 곱한 결과 : ' + multiplyAll(1,2) )
console.log('모두 곱한 결과 : ' + multiplyAll(1,3) )




// 확인문제2-1 [익명함수 선언 -> function(인수~)]
const max = function( array ) {
	let maxvalue = array[0]
	for(let i of array ){ 
/*	for(let i in array){array[i]}
	for(let i ; i<array.length ; i++){ array[i]}
	똑같음 												 */
	if(maxvalue<i){maxvalue = i} // i값이 maxvalue보다 크면 maxvalue에 i 대입 
	}// for end
	return maxvalue
	//배열 내 요소(값)를 하나씩 출력하는 방법
	//for( let i in 배열명 ) : 배열에서 *인덱스를 하나씩 대입 반복
	//			배열명[i]
	//for( let i of 배열명 ) : 배열에서 *값을 하나씩 대입 반복
	//for( let i ; i<배열명.length ; i++ )
	//			배열명[i]	
	}
console.log( max([1,2,3,4]))

//2-2
const max2 = function(...array) {
	maxvalue = array[0]
	for(let i of array){
	if(maxvalue<i){maxvalue = i} 
	}
	return maxvalue

	}
console.log( max2(1,2,3,4))




//확인문제 2-3

const max3 = function(array, ...array2){
	
	let maxvalue = 0
	let items
	
	if(Array.isArray(array )){ //배열이면
		maxvalue = array[0]
		items = array
	}else if( typeof(array) ==='number'){
		maxvalue = array
		items = array2
	}
	
	for(let i of items ){
		if(maxvalue < i){maxvalue = i}	
	}
	return maxvalue
}
console.log(`최대값 구하기 결과3[배열->매개변수1개]: ${max3([1,2,3,4])}`)
console.log(`최대값 구하기 결과3[숫자->매개변수4개]: ${max3(1,2,3,4)}`)