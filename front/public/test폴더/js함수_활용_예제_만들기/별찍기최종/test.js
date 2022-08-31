/**
 * 
 */
 
 
 
 
  	function 보드그리기(){
		for(let i = 1 ; i<=13 ; i++){
			document.getElementById('board').innerHTML += `<tr id='${i}x'></tr>`
			for(let j = 1 ; j <= 13 ; j++){
				document.getElementById(i+'x').innerHTML += '<td></td>' 
			}
		}
	}
	보드그리기()
	