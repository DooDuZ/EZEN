

게임판그리기()
 function 게임판그리기(){
	let 게임판 = ''
	for(let i = 1 ; i<=9 ; i++ ){ 
		게임판 += `<button> i </button>`
	 }
	document.getElementById('gameboard').innerHTML = 게임판
}


