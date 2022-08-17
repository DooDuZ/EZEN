/**
 * 
 */
 
 	
	let x = Number(prompt('출발층'))
	let y = Number(prompt('목표층'))	
	let z = Number(prompt('e_floor'))
	
	
function call_EV(x, z){
	let display = 0 
	if(x<z){
		for(let i = z ; i>=x ; i--){
			display = i
		}document.getElementById('floor_p') = display;
	}else if(x>z){
		for(let i = z ; i <= x ; i++){
			display = i
		}document.getElementById('floor_p') = display;
	}
}
			
