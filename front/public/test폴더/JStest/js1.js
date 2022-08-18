



const array = [ ] 


let rooftop = 20


let btn_board = ''
function make_btn(  ){
		for(let i = rooftop ; i >= 1 ; i--){
			btn_board += `<button id="${i}" onclick("start_ev(i)")}>${i}</button>`
			if(i%2==1){
				btn_board+= '<br>'
			}
		}
		alert('목표층을 입력해 주세요.')
		document.getElementById('select_floor').innerHTML = btn_board
}


make_btn()


function start_ev(  ){
	
	
}