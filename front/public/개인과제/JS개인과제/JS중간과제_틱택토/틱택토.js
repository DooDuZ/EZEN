
	
const board = document.querySelector('#board')


let gamebox = []

function make_board(){	
	gamebox = [null, null, null, null, null, null, null, null, null]
	for(let i = 0 ; i<9 ; i++){

		gamebox.push(i)
		board.innerHTML += `<button id='${i}' onclick='버튼입력(${i})'>${i}</button>`
		if(i%3==2){
			board.innerHTML += '<br>'
		}
	}	
}



function 버튼입력(i){
	
	중복검사(i)
	
	
	gamebox[i] = 'O'
	document.getElementById(i).innerHTML = 'O'

	let rand = Math.floor(Math.random())
	
	
	while(true){
		중복검사(i)
		gamebox[rand] = 'X'
		document.getElementById(rand).innerHTML = 'X'
		break
	}


	
}


function 중복검사(i){
	
	if(gamebox[i]!=null){
		alert('이미 둔 자리입니다!')
		return 
	}
	
}






















