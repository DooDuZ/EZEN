/**
 * 
 */
 const result = document.querySelector('#결과')
 
 let board = ''
 let select_number = []
 let 당첨번호 = []
 let 맞춘번호 = []
 
 
 function 번호목록(){
	board = ''
	for(let i = 1 ; i<=45 ; i++){
		board += `<button id=${i} onclick="번호선택(${i})">${i}</button>`
		if(i%5==0){
			board += '<br>'
		}
		document.getElementById('numb_board').innerHTML = board
	}	
}



 function 번호선택(i){	
	if(select_number.length==6){
		alert('번호 선택 완료')
		return
	}	
	if(중복검사(i)){
		alert('이미 선택한 번호입니다.')
		return
	}	
	select_number.push(i)
	document.getElementById('선택번호').innerHTML += i +','	
}


function 중복검사(i){
	if(select_number.indexOf(i)>=0){
		return true
	}	
}


function 번호추첨(){
	let rand = 0
	//선택지 while / if 등등일듯
	for(let i=1 ; i<=6 ; i++){
		rand = Math.floor(Math.random()*45)+1
		if(당첨번호.indexOf(rand)<0){
			당첨번호.push(rand)
		}else{
			i--
		}
	}
	document.getElementById('추첨번호').innerHTML = 당첨번호
	당첨결과()
}

function 당첨결과(){
	let count = 0
	
	for(let i = 0 ; i<6 ; i++){
		for(let j = 0 ; j<6 ; j++){
			if(select_number[i]==당첨번호[j]){
				맞춘번호.push(당첨번호[j])
				count++
			}
		}
	}
	if(count==6){
		result.style.color = 'red'
		result.textContent = '1등!'
	}if(count==5){
		result.style.color = 'red'
		result.textContent = '2등!'
	}if(count==4){
		result.style.color = 'red'
		result.textContent = '3등!'
	}if(count==3){
		result.style.color = 'red'
		result.textContent = '4등!'
	}else{
		result.style.color = 'red'
		result.textContent = '또속냨ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ!'
	}
	document.getElementById('번호비교').innerHTML = 맞춘번호
}

















