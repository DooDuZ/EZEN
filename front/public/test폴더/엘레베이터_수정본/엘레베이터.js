 /**
 
 	p. 226
 		* 타이머함수 : 콜백함수 [내장함수]
 		setTimeout( 함수, 시간[밀리초] ) : 시간이후에 한번 함수 실행
 		setInterval( 함수, 시간[밀리초] ) : 매시간마다 함수 실행
 
 
 */ 

 
/*

elevator(ev) 만들기

ev = 하나의 정해진 범위의 Line 안에서 규정된 값만큼 이동할 수 있는 object
	//	하나의 정해진 범위의 Line : 최소값이 1로 시작하는, 2이상의 길이를 가진 배열
	//	규정된 값만큼 이동 : 배열 내 양 옆 element까지의 거리 [ 인덱스를 이용하여 값 사이의 차가 몇이든 1단위로 지정 가능 / ev는 통상적으로 1층씩 움직이므로, index요소 대신 값 간의 차를 이용 가능할 것 ]
		ㄴ 즉, 1 단위의 값(거리)씩 변하는 요소만 있으므로, 굳이 배열로 지정하지 않고 변수 몇 개 와 그 변수에 1씩 더하고 빼는 함수만으로 컨트롤 가능
	//  단위거리 1, 방향은 반대로 작동하는 함수 선언 1. function up_f(){}  2. function down_f(){} 
	// 원하는 거리만큼 단위거리 함수를 반복할 수 있는 함수 작성 
		1. function call_ev(){} 최초 입력받은 변수 간의 차를 계산하여 그 값만큼 반복 실행하는 함수이므로 매개변수 없음 / 
		2. function start_ev(i){} 우리가 실제로 엘레베이터에 탑승하는 경우 목표 층을 탑승 후에 입력하게 되므로, 외부 요소(button)를 이용해 변수를 입력받아 입력받은 변수(매개변수i)와 1. 에서 출력된 값의 차이만큼 움직이는 함수를 작성.
		3. 2.에 매개변수를 지정해주기 위한 <button>을 생성 // prompt, 미리 생성된 배열의 index값 호출, Math.를 이용한 방법 등 방법은 여러가지가 있겠으나, 실제 엘레베이터와 유사한 진행을 만들기 위해 <button>사용
		4. <button>을 통해 함수들이 적상작동 한다면, 그 과정을 표현해 줄 css작성 
		
		
const ev = {
	
	
	up_f(), // method 1...? 
	down_f(), // method 2...?   
	.
	.
	.
	floor{} // method 3...?
	등등 ev를 object로 정의하고 작동 함수를 method 요소로 추가
	각 floor마다 속성을 부여해서 또다른 object로 묶은 뒤, ev={}에 추가하여 활용 가능할듯 함
	개념만 그렇고 구현은 아직 어떻게 할지 모르겠음...
	일단 object선언 하고 이거저거 써보다 보면 길이 보일 지 모름. 
} 


 */



let rooftop = Number(prompt('최고 층수'))
 // let x = Number(prompt('목표 층수'))
let start_position = Number(prompt('출발 층수')) 
/* 호출 버튼을 반복해서 누르는 경우 엘레베이터가 최초 입력층으로 계속해서 돌아오는 문제 발생  
실제 엘레베이터에 가깝게 구현하려고 하면, 탑승자가 목표층에 도달 후 계단을 통해 다른 곳으로 이동하지 않는다고 가정했을 때
'새로운 출발층 = 이전에 엘레베이터를 통해 내렸던 목표층' 이므로
호출 버튼이 계속해서 최초 입력한 start_position으로 EV를 이동시키는 건 EV구동 목적에 맞지 않음.
따라서 출발층을 최초에 입력받는다고 가정하면 호출 직후 HTML에 입력된 <button> 자리를 공백으로 채워서
계속해서 원래의 출발층으로 재호출 되는 일이 없도록 해야함

다른 해결책으로 호출 버튼을 누를 때마다 계속해서 출발층을 재입력 받도록 함수를 수정하는 방법이 있으나
실제 우리가 EV이용 시에 층 정보를 집적 입력하지 않으므로
페이지 출력 시 최초에만 출발 층을 입력하고 호출 버튼은 최초 엘레베이터 탑승 시에만 작동하도록 작동 직후 innerHTML에 공백을 입력하여 삭제처리 하였음 
*/
let current_position = Number(prompt('EV 현재 위치'))
 
document.getElementById('ev_display').innerHTML = `현재 엘레베이터의 위치는 ${current_position}층 입니다.`

ev_img()



// 1. up, down 버튼 생성
function up_f(){
	current_position++
	ev_img()
	if(current_position>rooftop){
		alert('최고 층수 입니다.')
		return
	}
	document.getElementById('ev_display').innerHTML = `현재 엘레베이터의 위치는 ${current_position}층 입니다.` ;
}

function down_f(){
	current_position--
	ev_img()
	if(current_position<1){
		alert('최저 층수 입니다.')
		return
	}document.getElementById('ev_display').innerHTML = `현재 엘레베이터의 위치는 ${current_position}층 입니다.` ;
}


// 2. 엘레베이터 호출


function call_ev(){
			if(start_position<current_position){
			let stop = setInterval( ()=> { 
					down_f() 
					if(current_position==start_position){
						clearInterval(stop)
						alert('엘레베이터에 탑승해주세요.')
					}
					}, 1*1000)
			}else if(start_position>current_position){
			let stop = setInterval( ()=> { 
					up_f() 
					if(current_position==start_position){
						clearInterval(stop)
						alert('엘레베이터에 탑승해주세요.') 					
					}
					}, 1*1000)
			}
			document.getElementById('callbtn').innerHTML =''	
}



/*
최초 작성 함수

function call_ev(){
			let count = 0
			if(start_position<current_position){
			let stop = setInterval( ()=> {
					down_f() 
					count++
					if(count== current_position - start_position  )
						clearInterval(stop)
					}
					}, 1*1000)	
																	 
																	 /* 현재 엘레베이터 위치에서 목적지 위치의 값을 차감 
																	 count 값이 단위거리 1씩 움직이는 함수의 반복 1회마다 1씩 증가하여, 최초 계산한 거리의 값에 도달하면 함수 종료
																	 해당 방식에는 치명적인 문제점이 있는데, down_f()함수가 작동할 때마다 current_position의 값을 1씩 줄이기 때문에
																	 count 값이 증가할 때마다 current_position과 start_position 값의 차 또한 계속해서 줄어들게 됌
																	 
																	 ex) 함수의 최초 작동 시 current_position : 19, start-position : 10 인 경우 
																	 최초 작성 시 예상한 로직의 작동 방식 
																	 
																	 //count = 0  // current_position - start_position = 9
																	 //count = 1 // current_position - start_position = 9
																	 //count = 2  // current_position - start_position = 9
																	 //count = 3 // current_position - start_position = 9
																	 .
																	 .
																	 .
																	 실제 함수의 작동 결과값
																	 //count = 0  // current_position - start_position = 9
																	 //count = 1 // current_position - start_position = 8
																	 //count = 2  // current_position - start_position = 7
																	 //count = 3 // current_position - start_position = 6
																	 .
																	 .
																	 .
																	 count와 current_position이 동시에 단위거리 1씩 증감하므로,
																	 둘의 차가 홀수인 경우 count = (current_position - start_position) 이 될 수 없으므로
																	 함수는 무한루프에 빠짐. 
																	 함수 구동 실패	
																	 */
/*
첫번째 수정 내용

function call_ev(){
			if(start_position<current_position){
			let stop = setInterval( ()=> {
				let count = 0
				down_f() 
				count++
				if(count== current_position - start_position  )
						clearInterval(stop)
					}
					}, 1*1000)					
					
																	// 직전의 실행 결과가 무한루프에 빠진 원인을 setInterval의 함수 내부 식 혹은 변수에 문제가 있을 것으로 생각																	
																	// setInterval에 대한 이해 부족으로 let count의 선언 위치가 문제일 수 있겠다는 오판을 함.
																	// let count를 함수 내부로 이동하자 무한루프는 사라지고 목표값보다 항상 1부족한 결과가 도출되어
																	// 각 항목의 console.log를 해본 결과
																	
																	 ex) 함수의 최초 작동 시 current_position : 19, start-position : 10 인 경우 
																	 최초 작성 시 예상한 로직의 작동 방식 
																	 
																	 //count = 0  // current_position - start_position = 9
																	 //count = 1 // current_position - start_position = 9
																	 //count = 2  // current_position - start_position = 9
																	 //count = 3 // current_position - start_position = 9
																	 .
																	 .
																	 .
																	 실제 함수의 작동 결과값
																	 //count = 0 // current_position - start_position = 9
																	 //count = 1 // current_position - start_position = 8
																	 //count = 1 // current_position - start_position = 7
																	 //count = 1 // current_position - start_position = 6
																	 //count = 1 // current_position - start_position = 5
																	 .
																	 .
																	 .
																	 //함수 내부에서 let count의 값을 지속적으로 초기화 했으므로 count의 값은 고정
																	 // current_position - start_position 가 1에 도달하는 경우 함수 종료
																	 // 그러므로 언제나 원하는 수치에서 1만큼 부족한 값이 수정되어 출력
																	 // +1 보정 값을 주어 값은 해결했으나
																	 // 여전히 논리적으로 세세한 구동 방식이 해결되지 않은 채 과제 제출함...ㅠㅠㅠㅠㅠㅠ
 //해결 방법
 //if문구에 변수들간의 차(current_position과 목적지 사이의 거리)를 기준으로 잡지 않고
 //current_position == 목적지<button>의 값 으로 조건을 변경
 	ㄴ양측 데이터의 차(거리)를 이용하지 않고 비교연산자를 통한 boolean 이용'
 	
			if(start_position<current_position){
			let stop = setInterval( ()=> { 
					down_f() 
					if(current_position==start_position){
						clearInterval(stop)
					}
					}, 1*1000)
					
//다른 해결 방법 찾기
 1. 함수 실행 전 current_position의 값을 상수로 선언하여 고정된 값을 이용. -> up_f() down_f() 자체가




 */


//4. 엘레베이터 탑승 후 버튼 출력


let btn_board = ''
function make_btn(){
		for(let i = rooftop ; i >= 1 ; i--){
			if(current_position!=start_position){
				alert('엘레베이터를 호출해 주세요.')
				return
			}
			btn_board += `<button id="${i}" onclick="start_ev(${i})">${i}</button>`
			if(i%2==1){
				btn_board+= '<br>'
			}
		}
		alert('목표층을 입력해 주세요.')
		document.getElementById('select_floor').innerHTML = btn_board
}
//5 ev출발



// ev img 

function ev_img(){
	let floorimg = ''
	for(let i = rooftop ; i>=1 ; i--){
		if(i!=current_position){
			floorimg += `<div class="box_${i}">${i}</div>`
		}else if(i==current_position){
			floorimg += `<div class="box_${i}" style='border: solid 3px red;'>${i}</div>`
		}				
	}
	document.getElementById('ev_img').innerHTML = floorimg
}


function start_ev( i ){
			if(i<current_position){
			let stop = setInterval( ()=> { 
					down_f() 
					if(current_position==i){
						clearInterval(stop)
						alert('목적지에 도착했습니다.')
					}			
					}, 1*1000) 
			}else if(i>current_position){
			let stop = setInterval( ()=> { 
					up_f() 
					if(current_position==i){
						clearInterval(stop)
						alert('목적지에 도착했습니다.')
					}
					}, 1*1000) 
			}
}
