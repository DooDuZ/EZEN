

let board = ''

let select_box = []

let 당첨박스 = []

function 번호판(){
	board = ''
	for(let i = 1 ; i<=45 ; i++){
		board += `<button id=${i} onclick="번호선택(${i})">${i}</button>`
	}
	document.getElementById('number_board').innerHTML = board 
}


function 번호선택(i){
	
	if(select_box.length==6){
		alert('숫자 선택 완료')
		return
	}
	if(중복검사(i)){
		alert('이미 선택된 숫자입니다.')
		return
	}
	select_box.push(i)
	document.getElementById('선택번호').innerHTML += i+','
	
	if(select_box.length==6){
		번호추첨()
		당첨결과()
	}
}

function 중복검사(i){
	if(select_box.indexOf(i)>=0){
		return true
	}
}
/*
function 번호추첨(){
	당첨박스 = []
	let rand = 0
	for(let i = 1 ; i<=6 ; i++){
		while(true){
			rand = Math.floor(Math.random()*45) + 1 
			if(당첨박스.indexOf(rand)>0){
			break
			}
		당첨박스.push(rand)
		}
	console.log(당첨박스)
	}
}
*/




function 번호추첨(){
	
	if(select_box.length!=6){
		alert('번호를 모두 골라주세요.')
		return
	}	
	let rand = 0
	당첨박스 = []
	for(let i = 1 ; i<=6 ; i++){
		rand = Math.floor(Math.random()*45)+1
		if(당첨박스.indexOf(rand)==-1){
			당첨박스.push(rand)
		}else{
			i--
		}
	}
	document.getElementById('당첨번호').innerHTML = 당첨박스 
}


function 당첨결과(){
	let count = 0
	for(let i = 0 ; i<6 ; i++){
		for(let j = 0 ; j<6 ; j++){
			if(select_box[i]==당첨박스[j]){
				count++
			}
		}	
	}
	if(count==6){
		alert('1등 당첨!')
	}else if(count==5){
		alert('2등 당첨!')
	}else if(count==4){
		alert('3등 당첨!')
	}else{
		alert('또속냨ㅋㅋㅋㅋ')
	}
	document.getElementById('당첨결과').innerHTML = '당첨된 번호는'+count +'개 입니다.'
}




















