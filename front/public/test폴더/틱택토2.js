 /**
 * 
 */
 let 게임상황 = []
 let 승리 = ''
 
 function 게임판그리기(){
	
	게임상황 = [null,null,null,null,null,null,null,null,null]
	 let 게임판 = ''
	for(let i = 0 ; i<9 ; i++){
		게임판 += `<button id="${i}" onclick="버튼선택(${i})">${i}</button>`
		if(i%3==2){
			게임판 += '<br>'
		}
		document.getElementById('gameboard').innerHTML = 게임판		
	}
}
 
 function 버튼선택(i){
		if( 중복검사(i) ){
			alert('이미 둔 자리입니다.')
			return
		}			
		
		document.getElementById(i).innerHTML = 'O'
		게임상황[i] = 'O'		
		
		while( true ){
			let rand = Math.floor(Math.random()*9)
			if(게임상황[rand]==null){
				document.getElementById(rand).innerHTML = 'X'
				게임상황[rand] = 'X'
				break
			}
		}
}

function 중복검사(i){
	if(게임상황[i]!=null){
		return true
	}else{
		return false
	}
}



function 승리판단(){
	for(let i = 0 ; i<=6 ; i+=3){
		if(게임상황[i]!=null && 게임상황[i]==게임상황[i+1] && 게임상황[i+1]==게임상황[i+2]){
			승리=게임상황[i]
			return true
		}
	}
	for(let i = 0 ; i<=2 ; i++){
		if(게임상황[i]!=null && 게임상황[i] == 게임상황[i+3] && 게임상황[i+3] == 게임상황[i+6]){
			승리=게임상황[i]
			return true
		}
	if(게임상황[0]!=null && 게임상황[0] == 게임상황[4] && 게임상황[4] == 게임상황[8]){
			승리=게임상황[i]
			return true
		}
	}
}

