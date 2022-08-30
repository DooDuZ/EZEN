/**
 * 
 */
 
 const name = document.querySelector('#name')
 const e_name = document.querySelector('#e_name')
 const email = document.querySelector('#email')
 const portfolio = document.querySelector('#portfolio')
 const work = document.querySelectorAll('.workplace')
 const cond = document.querySelector('#condition')
 


 

 function 전송하기(){
	document.getElementById('data_print').innerHTML += '<tr><td>'+name.value+'</td>'+
													'<td>'+e_name.value+'</td>'+
													'<td>'+email.value+'</td>'+
													'<td>'+portfolio.value+'</td>'+
													'<td>'+'없음'+'</td>>'+
													'<td>'+cond.value+'</td></tr>'
	
														
												
}
