//p.203 윤년인지 확인하는 함수

function isLeapYear( year ){
	//isLeapYear 함수 이름
	//year 매개변수
	return (year%4==0) && (year%100 != 0) || ( year % 400 == 0) }



// 변수와 문자열 같이 출력하는 방법
// 1. '문자열' + 변수명 
// 2. '문자열 ${변수명/함수()}'

console.log(isLeapYear(2020))
console.log(`2010년은 윤년일까? === ${isLeapYear(2010)}`)
console.log(`2000년은 윤년일까? === ${isLeapYear(2000)}`)
console.log(`1900년은 윤년일까? === ${isLeapYear(1900)}`)




function 윤년버튼함수 (){
	//윤년버튼함수 라는 함수명으로 매개변수가 없는 함수	
	alert('버튼이 눌렸다.')
	let 연도 = Number(prompt('연도를 입력 : '))
	let 결과 = isLeapyear( 연도 )
	console.log('입력한'+연도+'는 윤년일까?'+결과)
	document.getElementByID('resultbox').innerHTML = '결과:'+결과
	// document : 문서 (HTML)
		// get : 가져오기
			// Element : 요소
				// ID : 식별자 이름
					// innerHTML : html작성
}

 