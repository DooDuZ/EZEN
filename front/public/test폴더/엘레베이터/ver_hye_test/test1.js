
let rooftop = Number(prompt('최고 층수'))
// let x = Number(prompt('목표 층수'))
let y = Number(prompt('출발 층수'))
let z = Number(prompt('EV 현재 위치'))




function ev_img(){
		let elv_img = ''
		for(let i = rooftop ; i>=1 ; i--){
			if(i!=z){
			elv_img+=`<div style='border : 2px solid black;'>${i}</div>`}
			else{elv_img+=`<div style='border : 2px solid red;'>${i}</div>`}
		}document.getElementById('ev_img').innerHTML = elv_img
		elv_img = ''
}

ev_img()


// 1. up, down 버튼 생성
function up_f() {
	z++
	ev_img()
	if (z > rooftop) {
		alert('최고층 입니다.')
		return
	}
	document.getElementById('ev_display').innerHTML = `현재 엘레베이터 위치 : ${z}층 입니다.`
}

function down_f() {
	z--
	ev_img()
	if (z < 1) {
		alert('최저층 입니다.')
		return
	}
	document.getElementById('ev_display').innerHTML = `현재 엘레베이터 위치 : ${z}층 입니다.`
}


function call_ev() {
	if (y > z) {
		let stop = setInterval(() => {
			let count = 0
			up_f()
			count++
			if (count == y - z + 1) {
				clearInterval(stop)
				alert('엘레베이터에 탑승해주세요.')
			}
		}, 1 * 1000)
		
	} else if (y < z) {
		let stop = setInterval(() => {
			let count = 0
			down_f()
			count++
			if (count == z - y + 1 ) {
				clearInterval(stop)
				alert('엘레베이터에 탑승해주세요.')
			}
		}, 1*1000) 
		
	}else{alert('엘레베이터에 탑승해주세요')}
}
/*
function make_btn(){
		for(i = 1 ; i<=rooftop ; i++){
			if(y!=z){
				alert('엘레베이터를 호출해주세요.') 
				return
			}else{		
			document.getElementById('btn_box').innerHTML = `<button id='${i}' onclick='start_ev(i)'>${i}</button>`}
			
			}
		}
*/
let btn_box = ''
function make_btn(){
	if(z!=y){
		alert('엘레베이터를 호출해주세요.')
		return
	}for(let i = rooftop ; i>=1 ; i--){
		btn_box += `<button id='${i}' onclick='start_ev(${i})'>${i}</button> <br>`
	}
	document.getElementById('btn_box').innerHTML = btn_box
}


function start_ev( i ){
			if (i > z) {
				let stop = setInterval(() => {
					let count = 0
					up_f()
					count++
					if (count == i-z+1) {
						clearInterval(stop)
						alert('목적지에 도착했습니다.')
					}
				}, 1 * 1000)
				
			} else if (i < z) {
				let stop = setInterval(() => {
					let count = 0
					down_f()
					count++
					if (count == z-i+1) {
						clearInterval(stop)
						alert('목적지에 도착했습니다.')
					}
				}, 1*1000) 
				
			}
}
