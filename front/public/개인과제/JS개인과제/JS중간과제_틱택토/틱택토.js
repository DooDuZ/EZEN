

const 게임판 = document.querySelector("#gameboard")

let count = 0
let 게임상황 = []

function 게임시작(){
	let gameboard = ''	
	게임상황 = [null, null, null, null, null, null, null, null, null] 
	for(let i = 0 ; i<9 ; i++){
		gameboard += `<button id=${i} onclick="입력(${i})">${i}</button>`
		if(i%3==2){
			gameboard += '<br>'
		}
	}	
	게임판.innerHTML = gameboard
}


function 입력(i){
	count++
	if(!중복검사(i)){
		alert('이미 둔 자리입니다.')		// 이새기 왜 안돼?	왜안돼긴 병시나...	
		return
	}
	게임상황[i] = 'O'
	document.getElementById(i).innerHTML = 'O'
	
	
	if(승리판단()){
		return
	}
	console.log(count)
	if(count==5){
		alert('무승부')
		return
	}
	
	
	while(true){
		let rand = Math.floor(Math.random()*9)
		if(중복검사(rand)==true){
		게임상황[rand] = 'X'
		document.getElementById(rand).innerHTML = 'X'
		break
		}
	}
	if(승리판단()){
		return
	}
}


function 중복검사(i){

	if(게임상황[i]==null){  //i는 어디서 올까 ?  --> 입력(i) 에서 받아진다
		return true
	}else{
		return false
	}
}

//승리하는 경우의 수 or 조건 찾기

//가로세로 길이가 달라도 적용 되도록 만들기

//가로 승리조건 : [012, 345, 678], 세로 승리조건 : [036, 147, 258], 대각선 승리 조건 : [048, 246]

//콜백함수 공부 / 연산자 값 산출 공부!!!!!!!!@!!!!@!@!@!@

function 승리판단(){ // 매개변수 필요 없을거 가튼디..? 아니네 ㅋㅋ 필요없어 븅시나...
	for(let i = 0 ; i<=6 ; i += 3){
		if(게임상황[i]!=null && 게임상황[i] == 게임상황[i+1] && 게임상황[i+1] ==게임상황[i+2]){        // 왜 게임상황[i] == 게임상황[i+1] && 게임상황[i+1] == 게임상황[i+2]이어야 하는지 
			alert(게임상황[i]+'승리')										//이렇게 알림 바로 띄우고 종료하면 안되는지
			return true													//return해도 승리 판단 의 리턴값 -> 입력(i)의 파라미터로 돌아갈 뿐 입력(i)가 멈추진 않음
		}
	}for(let i = 0; i<=2 ; i++){
		if(게임상황[i]!=null && 게임상황[i]==게임상황[i+3] && 게임상황[i+3]==게임상황[i+6]){  // == 연산자는 3개 값 동시 비교 못하는듯 함. && || 연산시 앞뒤 값 출력되듯 뭐가 있는듯
			alert(게임상황[i]+'승리')
			return true
		}
	}
	let i = 0
	if(게임상황[i]!=null && 게임상황[i]==게임상황[i+4] && 게임상황[i+4]==게임상황[i+8]){	
		alert(게임상황[i]+'승리')
		return true
	}
	i = 2 
	if(게임상황[i]!=null && 게임상황[i]==게임상황[i+2] && 게임상황[i+2]==게임상황[i+4]){	
		alert(게임상황[i]+'승리')
		return true
	}
}



