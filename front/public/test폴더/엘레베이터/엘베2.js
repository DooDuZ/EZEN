/**
 * 
 */
 

let z = 20


let floor_img = ''
function ev_img(){
	for(let i = z ; i>=1 ; i--){
		floor_img += `<div>${i}</div>`		
	}
	document.getElementById('select_floor').innerHTML = floor_img
}



ev_img()