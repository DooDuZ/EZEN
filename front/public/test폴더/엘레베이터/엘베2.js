/**
 * 
 */
 
 let rooftop = Number(prompt('최고 층수'))



let btn_board = ''
function make_btn(){
		for(let i = 1 ; i <= rooftop ; i++){	
			btn_board += `<button>${i}</button>`
					
		}
		document.getElementById('select_floor').innerHTML = btn_board
}

make_btn()