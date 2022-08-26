/**
 * 
 */
 
 let counter = 0 // 클릭 수 저장 변수
 let isConnect = false //연결상태 저장 변수 
 
 const h1 = document.querySelector('h1')
 const p = document.querySelector('p')
 const connectBtn = document.querySelector('#connect')
 const disconnectBtn = document.querySelector('#disconnect')
 const plusBtn = document.querySelector('#plus')
 const minusBtn = document.querySelector('#minus')
 

  const listener = () => {h1.textContent = `클릭횟수 : ${counter++}`}
  const listener2 = () =>{h1.textContent = `클릭횟수 : ${counter--}`}
 
 //1.연결
 connectBtn.addEventListener( 'click', ()=> {
	if(isConnect == false){		
		plusBtn.addEventListener( 'click' , listener )
		minusBtn.addEventListener( 'click' , listener2 ) 
		p.textContent = '이벤트 연결 상태 : 연결' // p태그에 내용 넣기
		isConnect = true // 연결했다는 의미로 연결상태 변수에 true 반환
	}	
})
 
 
 //2.연결해제
 disconnectBtn.addEventListener( 'click', ()=> {
	if( isConnect == true ){
		plusBtn.removeEventListener( 'click' , listener )
		minusBtn.removeEventListener( 'click' , listener2 ) 
		p.textContent = '이벤트 연결 상태 : 해제'
		isConnect = false
	}	
})

 
 /*
 // 출력하는 함수
function display(){h1.textContent = `클릭횟수 : ${counter}`}
 
 //1.연결
 connectBtn.addEventListener( 'click', ()=> {
	if(isConnect == false){		
		plusBtn.addEventListener( 'click' , ()=> {
			counter++
			display()
			})
		minusBtn.addEventListener( 'click' , ()=> {
			counter--
			display()
			})
		p.textContent = '이벤트 연결 상태 : 연결' // p태그에 내용 넣기
		isConnect = true // 연결했다는 의미로 연결상태 변수에 true 반환
	}	
})
 
 
 //2.연결해제
 //새로운 함수 똑같은 모양이라도 식별 불가 / remove 안됌
 

 disconnectBtn.addEventListener( 'click', ()=> {
	if( isConnect == true ){
		plusBtn.removeEventListener( 'click' ,()=> {
			counter++
			display()
			})
		minusBtn.removeEventListener( 'click' , ()=>{
			counter--
			display()
			})			
		p.textContent = '이벤트 연결 상태 : 해제'
		isConnect = false
	}	
})

*/
//3. 증가/ 감소 버튼

 
 // 객체명.addEventListener( '이벤트명' , 콜백함수 )
 	//해당 객체의 이벤트 발생했을 때 콜백함수 실행된다.
 	
 /*
 
 //1. 화살표함수 ver
 h1.addEventListener('click' , ( ) => {
	
	counter++ // 변수에 1증가
	h1.textContent = `클릭횟수 : ${counter}`	
	
})



//2. 기본함수ver

h1.addEventListener( 'click' , 함수 )
function 함수(){
	counter++ // 변수에 1증가
	h1.textContent = `클릭횟수 : ${counter}`		
}

*/