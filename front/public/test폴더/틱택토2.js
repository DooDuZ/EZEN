/**
 * 
 */
 
 let 게임판 = ''
 const 게임상황 = []
 
 
 function 게임판그리기(){
	
	for(let i = 0 ; i<9 ; i++){
		게임판 += `<button id="${i}" onclick="버튼선택(${i})">${i}</button>`
		if(i%3==2){
			게임판 += '<br>'
		}		
		document.getElementById('gameboard').innerHTML = 게임판		
	}	
}
 
 
 function 버튼선택(i){
			
		document.getElementById(i).innerHTML = 'O'
		게임상황.push(i)
	
		if(게임상황.length==9){
			alert('빈 자리가 없습니다.')
			return
		}
		
		if(게임상황.length%2==1){
			let rand = Math.floor(Math.random()*9)
			document.getElementById(rand).innerHTML = 'X'
		}		
}
 