/**
 * 
 */

 
 const x = Number(prompt('현재층'))
 const y = Number(prompt('목표층'))
 const z = Number(prompt('엘레베이터 위치'))
 
 let ev_display = z
 
 function ev_up(x, z){
	if(x>z){
	ev_display += 1
	document.getElementById('f_dp').innerHTML = ev_display
	}else if(x==z){
		alert('엘레베이터 도착')
	}else if(x<z){
		alert('하강 버튼을 눌러주세요.')
	}
	
	return
}