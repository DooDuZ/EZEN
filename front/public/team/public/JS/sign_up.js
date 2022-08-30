/**
 * 
 */
 
 const id_info = document.querySelector('#id_input')
 const idp = document.querySelector('#idp')
 const pw_info = document.querySelector('#pw_input')
 const pwp = document.querySelector('#pwp')
 const repeatPw_info = document.querySelector('#repeatPw')
 const pwtp = document.querySelector('#pwtp')
 const email_input = document.querySelector('#email_input')
 const email_checked = document.querySelector('#email_output')
 const btn_p = document.querySelector('#btn_p')
 const name_input = document.querySelector('#name_input')
 
 const submit_box = {}
 console.log(submit_box)
 

 
 
 let domain_box = ['com' , 'kr' , 'net']
 let domain_box2 = ['co' , 'go' , 'or']
 // for(let = 0 ; i<=domain_box.length ; i++){} 활용
 
 //1. 이메일 유효성 검사

email_input.addEventListener('change' , ()=>{	
	email_test()
})

function email_test(){
	
	 let checking = email_input.value.indexOf('@');
	 let checking_2nd = email_input.value.split('@');
	 
	 if(checking>1 && checking_2nd.length==2){
		
		let dot_cutter = checking_2nd[1].split('.')
		
		if(dot_cutter.length==2){
				if(domain_box.indexOf(dot_cutter[1]) >= 0){
					email_checked.style.color = 'green'
					email_checked.textContent = '이메일 형식입니다.'
					return true
				}else{//삭제대상
					email_checked.style.color = 'red'
					email_checked.textContent = '이메일 형식이 아닙니다.'			
				}			
		}else if(dot_cutter.length==3){
			if(domain_box2.indexOf(dot_cutter[1]) >= 0 && domain_box.indexOf(dot_cutter[2]) >= 0 ){
				email_checked.style.color = 'green'
				email_checked.textContent = '이메일 형식입니다.'
				return true
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


id_info.addEventListener('keyup', ()=> {
	idlength_test()
})


pw_info.addEventListener('change', ()=>{
	pwlength_test()	
})

repeatPw.addEventListener('change', ()=>{
	repeatPw_test()	
})

//2. id유효성 검사 - 정규표현식x 단순 길이로만 체크

function idlength_test(){
	if(id_info.value.length==0){
		idp.textContent =''
	}else if(id_info.value.length<5){
		idp.style.color = 'red'
		idp.textContent = 'ID가 너무 짧아요!'
	}else{
		idp.textContent =''
		return true
	}
}


//3. pw유효성 검사 - 정규표현식x 단순 길이 + 비밀번호 확인까지만 체크

function pwlength_test(){	
	if(pw_info.value.length==0){
		pwp.textContent =''
	}else if(pw_info.value.length<8){
		pwp.style.color = 'red'
		pwp.textContent = '비밀번호가 너무 짧아요!'
	}else{
		pwp.textContent =''
		return true
	}
}

function repeatPw_test(){
	if(repeatPw.value.length==0){
		pwtp.textContent =''
	}else if(pw_info.value!=repeatPw.value){
		pwtp.style.color = 'red'
		pwtp.textContent = '비밀번호가 달라요!'
	}else{
		pwtp.textContent =''
		return true
	}
}


function submit_info(){
	if(idlength_test()==true && pwlength_test()==true && repeatPw_test()==true && email_test()==true){
		submit_box.userID = id_info.value
		submit_box.name = name_input.value
		submit_box.pw = pw_info.value
		submit_box.email = email_input.value
	}else{
		btn_p.style.color = 'red'
		btn_p.textContent = '입력 정보를 확인해주세요.'
		return
	}
	 localStorage.setItem(id_info.value, submit_box)
	 console.log(localStorage)
}







