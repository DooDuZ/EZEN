 /**
 
 	p. 226
 		* 타이머함수 : 콜백함수 [내장함수]
 		setTimeout( 함수, 시간[밀리초] ) : 시간이후에 한번 함수 실행
 		setInterval( 함수, 시간[밀리초] ) : 매시간마다 함수 실행
 
 
 */ 
 

 const li_floor = [ ]
 let rooftop = Number(prompt('최고 층수'))
 // let x = Number(prompt('목표 층수'))
 let y = Number(prompt('출발 층수'))
 let z = Number(prompt('EV 현재 위치'))
 
document.getElementById('ev_display').innerHTML = `현재 엘레베이터의 위치는 ${z}층 입니다.`



// 1. 엘레베이터 층 배열 생성
function input_floor( rooftop ){
	for(let i = 1 ; i<=rooftop ; i++ ){
		if(i>0){li_floor.push(i)} // if end
	}//for end
}

// 2. up, down 버튼 생성
function up_f(){
	z++
	console.log(z)
	if(z>20){
		alert('최고 층수 입니다.')
		return
	}document.getElementById('ev_display').innerHTML = `현재 엘레베이터의 위치는 ${z}층 입니다.` ;
}

function down_f(){
	z--
	console.log(z)
	if(z<1){
		alert('최저 층수 입니다.')
		return
	}document.getElementById('ev_display').innerHTML = `현재 엘레베이터의 위치는 ${z}층 입니다.`  ;
}


//3. 엘레베이터 호출

function call_ev(){
			if(y<z){
			let stop = setInterval( ()=> { 
					let count = 0
					down_f() 
					count++
					if(count == z-y+1){
						clearInterval(stop)
						
						alert('엘레베이터에 탑승해주세요.')
					}
					
					}, 1*1000) 
			}else if(y>z){
			let stop = setInterval( ()=> { 
					let count = 0
					up_f() 
					count++
					if(count == y-z+1){
						clearInterval(stop)
						
						alert('엘레베이터에 탑승해주세요.')
					}
					
					}, 1*1000) 
			}
			
}

//4. 엘레베이터 탑승 후 버튼 출력


let btn_board = ''
function make_btn(){
		for(let i = rooftop ; i >= 1 ; i--){
			if(z!=y){
				alert('엘레베이터를 호출해 주세요.')
				return}
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
let floorimg = ''
function ev_img(){
	for(let i = rooftop ; i>=1 ; i--){
		floorimg += `<div class="box_${i}">${i}</div>`		
	}
	document.getElementById('ev_img').innerHTML = floorimg
}

ev_img()


function start_ev( i ){
			if(i<z){
			let stop = setInterval( ()=> { 
					let count = 0
					down_f() 
					count++
					if(count == z-i+1){
						clearInterval(stop)
						
						alert('목적지에 도착했습니다.')
					}
					
					}, 1*1000) 
			}else if(i>z){
			let stop = setInterval( ()=> { 
					let count = 0
					up_f() 
					count++
					if(count == i-z+1){
						clearInterval(stop)
						
						alert('목적지에 도착했습니다.')
					}
					
					}, 1*1000) 
			}
}




