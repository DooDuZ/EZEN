/*
	[엘리베이터]
	상승,하강 버튼
	누르면 현재 엘베 위치 변화 -> 모션 눈으로 확인할 수 있도록 응용
 */
 

let elv_current = 10		//현재 엘베 층
let person_floor = 3		//현재 내 층
let 첫탑승 = false			//첫 탑승 여부 - 첫 탑승인지를 나타내는 불린 변수

 //엘베 상승 함수
 function up(pressedBtn, destination){
	if(!첫탑승){			//첫탑승인경우
		let 타이머 = setInterval( () => {
			if(elv_current==destination){		//현재 엘베 층이 목적지와 같으면
				clearInterval(타이머)				//타이머 종료
				offBtn(pressedBtn)				//버튼 꺼짐
				alert("도착했습니다. 문이 열립니다.")
				첫탑승=true
				dest_floor(pressedBtn)
			}else{								//현재 엘베 층이 목적지와 같지않으면
				document.getElementById(elv_current).innerHTML = ''	
				elv_current+=1					//엘베 층 상승
				document.getElementById(elv_current).innerHTML = elv_current
			}
	 	}, 1*1000 )
	 }else{				//첫탑승이 아닌 경우
		let 타이머 = setInterval( () => {
			if(elv_current==destination){
				clearInterval(타이머)				//타이머 종료
				offBtn(pressedBtn)				//버튼 꺼짐
				alert("도착했습니다. 문이 열립니다. 안녕히가세요.")
				첫탑승=true
			}else{
				document.getElementById(elv_current).innerHTML = ''
				person_floor+=1
				elv_current+=1					//엘베 층 상승
				document.getElementById(elv_current).innerHTML = elv_current
				document.getElementById('current_me').innerHTML = elv_current
			}
	 	}, 1*1000 )
	}
}
 //엘베 하강 함수
 function down(pressedBtn, destination){
	if(!첫탑승){			//첫탑승인경우
		let 타이머 = setInterval( () => {
			if(elv_current==destination){
				clearInterval(타이머)				//타이머 종료
				offBtn(pressedBtn)				//버튼 꺼짐
				alert("도착했습니다. 문이 열립니다.")
				첫탑승=true
				dest_floor(pressedBtn)
			}else{		//첫탑승이 아닌경우
				document.getElementById(elv_current).innerHTML = ''
				elv_current-=1					//엘베 층 하강
				document.getElementById(elv_current).innerHTML = elv_current
			}
	 	}, 1*1000 )
	 }else{				//첫탑승이 아닌 경우
		let 타이머 = setInterval( () => {
			if(elv_current==destination){
				clearInterval(타이머)				//타이머 종료
				offBtn(pressedBtn)				//버튼 꺼짐
				alert("도착했습니다. 문이 열립니다. 안녕히가세요.")
				첫탑승=true
			}else{
				document.getElementById(elv_current).innerHTML = ''
				person_floor-=1
				elv_current-=1					//엘베 층 상승
				document.getElementById(elv_current).innerHTML = elv_current
				document.getElementById('current_me').innerHTML = elv_current
			}
	 	}, 1*1000 )
	}
}

function drawElv(){
	let elvlist = ''
	for(let i=9;i>=1;i--)
		elvlist += `<div class="elv"><h3 id=${i}></h3></div>`
	document.getElementById('elvs').innerHTML += elvlist
}

//내 현재 층과 엘베의 현재 층 비교 함수
function compare_floor(pressedBtn){
	//눌린 버튼에 따라서 버튼 표시 바꾸기
	onBtn(pressedBtn)

	//내 현재 층과 엘베의 현재 층 비교
	if(elv_current>person_floor)
		down(pressedBtn, person_floor)
	else if(elv_current<person_floor)
		up(pressedBtn, person_floor)
	else
		alert("문이 열립니다.")
}

//버튼 켜짐
function onBtn(pressedBtn){
	//눌린 버튼에 따라서 버튼 표시 켜기
	if(pressedBtn=='btnup')
		document.getElementById('btnup').innerHTML = '▲'
	else
		document.getElementById('btndown').innerHTML = '▼'
}

//버튼 꺼짐
function offBtn(pressedBtn){
	//눌린 버튼에 따라서 버튼 표시 끄기
	if(pressedBtn=='btnup')
		document.getElementById('btnup').innerHTML = '△'
	else
		document.getElementById('btndown').innerHTML = '▽'
}

function dest_floor(pressedBtn){
	let input_floor = Number(prompt('가고 싶은 층을 입력하세요.'))
	if(input_floor>elv_current)
		up(pressedBtn, input_floor)
	else
		down(pressedBtn, input_floor)
}

drawElv()