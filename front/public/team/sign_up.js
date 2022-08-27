/**
 * 
 */
 
 const id_info = document.querySelector('#id_input')
 const pw_info = document.querySelector('#pw_input')
 const pw_again_info = document.querySelector('#pw_input_again')
 const email_input = document.querySelector('#email_input')
 const email_checked = document.querySelector('#email_output')
 
 
 let domain_box = ['com' , 'kr' , 'net']
 let domain_box2 = ['co' , 'go' , 'or']
 // for(let = 0 ; i<=domain_box.length ; i++){} 활용
 
 //1. 이메일 유효성 검사

email_input.addEventListener('keyup' , ()=>{	
	유효성검사()
})


function 유효성검사(){
	
	 let checking = email_input.value.indexOf('@');
	 let checking_2nd = email_input.value.split('@');
	 
	 if(checking>1 && checking_2nd.length==2){
		
		let dot_cutter = checking_2nd[1].split('.')
		
		if(dot_cutter.length==2){
				if(domain_box.indexOf(dot_cutter[1]) >= 0){
					email_checked.style.color = 'green'
					email_checked.textContent = '이메일 형식입니다.'
				}else{//삭제대상
					email_checked.style.color = 'red'
					email_checked.textContent = '이메일 형식이 아닙니다.'			
				}			
		}else if(dot_cutter.length==3){
			if(domain_box2.indexOf(dot_cutter[1]) >= 0 && domain_box.indexOf(dot_cutter[2]) >= 0 ){
				email_checked.style.color = 'green'
				email_checked.textContent = '이메일 형식입니다.'
			}else{//삭제대상
				email_checked.style.color = 'red'
				email_checked.textContent = '이메일 형식이 아닙니다.'			
			}
		}else{
			email_checked.style.color = 'red'
			email_checked.textContent = '이메일 형식이 아닙니다.'
		}
	}else{
		email_checked.style.color = 'red'
		email_checked.textContent = '이메일 형식이 아닙니다.'
	}
}
