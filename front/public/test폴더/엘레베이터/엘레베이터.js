 /**
 
 	p. 226
 		* 타이머함수 : 콜백함수 [내장함수]
 		setTimeout( 함수, 시간[밀리초] ) : 시간이후에 한번 함수 실행
 		setInterval( 함수, 시간[밀리초] ) : 매시간마다 함수 실행
 
 
 */ 
 

 const li_floor = [ ]
 let rooftop = Number(prompt('최고 층수'))
 let x = Number(prompt('목표 층수'))
 let y = Number(prompt('출발 층수'))
 let z = Number(prompt('EV 현재 위치'))

document.write(`엘레베이터의 최초 위치는 ${z}층 입니다.`)

function input_floor( rooftop ){
	for(let i = 1 ; i<=rooftop ; i++ ){
		if(i>0){li_floor.push(i)} // if end
	}//for end
}


function up_f(){
	z++
	if(z>20){
		alert('최고 층수 입니다.')
		return
	}document.getElementById('ev_display').innerHTML = `현재 엘레베이터의 위치는 ${z}층 입니다.` ;
}

function down_f(){
	z--
	if(z<1){
		alert('최저 층수 입니다.')
		return
	}document.getElementById('ev_display').innerHTML = `현재 엘레베이터의 위치는 ${z}층 입니다.`  ;
}




function call_ev(y, z){
	let count = 0
	if(y>z){
		setInterval(
			()=> {	up_f
					count ++
					if(count==(y-z)){
						clearInterval(intervalId)
			
					}
				}, 1*1000)
			}
}
	
	



/*
function call_ev(y ,z){
	if(y>z){
		for(let i = z ; i<=y ; i++ ){
			up_f()
		}document.getElementById('ev_display').innerHTML = `엘레베이터가 ${y}층에 도착했습니다.`
	}else if(y<z){
		for(let i = z ; i>=y ; i--){
			down_f()
		}document.getElementById('ev_display').innerHTML = `엘레베이터가 ${y}층에 도착했습니다.`
	}else if(y==z){
		document.getElementById('ev_display').innerHTML = `엘레베이터가 도착했습니다.`
	}	
}

*/
