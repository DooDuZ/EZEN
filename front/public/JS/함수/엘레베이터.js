 /**
 
 	p. 226
 		* 타이머함수 : 콜백함수 [내장함수]
 		setTimeout( 함수, 시간[밀리초] ) : 시간이후에 한번 함수 실행
 		setInterval( 함수, 시간[밀리초] ) : 매시간마다 함수 실행
 
 
 */ 


/*

elevator(ev) 만들기

ev = 하나의 정해진 범위의 Line 안에서 규정된 값만큼 이동할 수 있는 object
const ev = {
	
	
	
	
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
