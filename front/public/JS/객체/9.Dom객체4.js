/**
 * 
 */
 
// p.320
// 1.JS태그 생성
const header = document.createElement('h1')
//2. 텍스트 조작 
header.textContent = 'js에서 만든 태그'
header.style.color = 'white'
header.style.backgroundColor = 'black'
//3.
document.body.appendChild(header)


//p.321
	//1. 해당 id의 태그 객체 가져오기
const divA =  document.querySelector('#first')
const divB =  document.querySelector('#second')

const h1 = document.createElement('h1')
h1.textContent = '왔다갔다 하쥬? 킹받쥬?'

const toFirst = () => {
	divA.appendChild(h1) // 4. 첫번째 div에 js만든 태그 추가
	setTimeout( toSecond, 500 ) // 5. 1초 뒤에 다른 함수 toSecond 실행		
}
const toSecond = () =>{
	divB.appendChild(h1)
	setTimeout(toFirst, 500)
}

toFirst() //5. 함수 실행



/*
	1. 원형
	function 함수(){	divB.appendChild(divA)	}
	
	2. 익명 함수
	const 익명함수 = function (){ divB.appendChild(divA) }
	
	3.화살표 함수
	const 화살표함수 = ( 매개변수 ) => { divB.appendChild(divA) } 

	4. 콜백 함수
	함수( 함수 )
	
	1-4 표기 방법만 다를 뿐 모두 같음
	setTimeout( 함수, 3000 )
	
*/


const h2 = document.querySelector('h2')


//1. 타이머함수 : setTimeout(함수,밀리초)
//2. 문서객체.removeChild(자식 객체)
//3. 부모객체 찾기 : 문서객체.parentNode()
function 함수(){
	//h2.parentNode.removeChild(h2)
	document.body.removeChild(h2)
}
setTimeout( 함수 , 3000 )




/*



setTimeout( ()=> {
	h2.parentNode.removeChild(h2)
} , 3000 )




2. 같은 함수 다르게 쓰기
const 익명함수 = () =>{h2.parentNode.removeChild(h2)}
setTimeout( 익명함수, 3000 )

3. function 함수(){
	h2.parentNode.removeChild(h2)
}
setTimeout( 함수 , 3000 )

*/
